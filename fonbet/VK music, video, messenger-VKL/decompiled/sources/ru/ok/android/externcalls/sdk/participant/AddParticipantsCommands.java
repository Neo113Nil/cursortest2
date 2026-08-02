package ru.ok.android.externcalls.sdk.participant;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.RandomAccess;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.participant.AddByLinkFailedException;
import ru.ok.android.externcalls.sdk.participant.AddParticipantsCommands;
import ru.ok.android.externcalls.sdk.participant.add.AddParticipantsFailedException;
import ru.ok.android.externcalls.sdk.participant.add.AddParticipantsResult;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;
import ru.ok.android.webrtc.Call;
import ru.ok.android.webrtc.participant.CallExternalId;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.signaling.api.Signaling;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.android.webrtc.utils.Consumer;
import xsna.cq;
import xsna.dn0;
import xsna.gzs;
import xsna.izs;
import xsna.j5g;
import xsna.s3q0;
import xsna.zcl;
import xsna.zm0;

/* compiled from: AddParticipantsCommands.kt */
/* loaded from: classes9.dex */
public final class AddParticipantsCommands {
    private final Call call;
    private final IdMappingWrapper mappings;
    private final SignalingProvider signalingProvider;
    private final gzs<Conversation.State> stateProvider;

    /* JADX WARN: Multi-variable type inference failed */
    public AddParticipantsCommands(SignalingProvider signalingProvider, Call call, IdMappingWrapper idMappingWrapper, gzs<? extends Conversation.State> gzsVar) {
        this.signalingProvider = signalingProvider;
        this.call = call;
        this.mappings = idMappingWrapper;
        this.stateProvider = gzsVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 addParticipantByLink$lambda$0(String str, final Consumer consumer, final Runnable runnable, final AddParticipantsCommands addParticipantsCommands, Signaling signaling) {
        try {
            signaling.send(SignalingProtocol.createRequestAddParticipantByLink(str), new Signaling.Listener() { // from class: xsna.bn0
                @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
                public final void onResponse(JSONObject jSONObject) {
                    runnable.run();
                }
            }, new Signaling.Listener() { // from class: xsna.cn0
                @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
                public final void onResponse(JSONObject jSONObject) {
                    AddParticipantsCommands.addParticipantByLink$lambda$0$1(Consumer.this, addParticipantsCommands, jSONObject);
                }
            });
        } catch (JSONException e) {
            consumer.accept(new RuntimeException("Request preparation error", e));
        }
        return s3q0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addParticipantByLink$lambda$0$1(Consumer consumer, AddParticipantsCommands addParticipantsCommands, JSONObject jSONObject) {
        consumer.accept(addParticipantsCommands.parseErrorResponse(jSONObject));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void addParticipantsExtIds$default(AddParticipantsCommands addParticipantsCommands, Collection collection, Boolean bool, boolean z, izs izsVar, izs izsVar2, int i, Object obj) {
        if ((i & 2) != 0) {
            bool = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            izsVar = null;
        }
        if ((i & 16) != 0) {
            izsVar2 = null;
        }
        addParticipantsCommands.addParticipantsExtIds(collection, bool, z, izsVar, izsVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 addParticipantsExtIds$lambda$0(Collection collection, Boolean bool, boolean z, final AddParticipantsCommands addParticipantsCommands, izs izsVar, final izs izsVar2, Signaling signaling) {
        try {
            signaling.send(SignalingProtocol.createAddParticipantsExtIds(collection, bool, z), addParticipantsCommands.new ListenerAddParticipantsResponse(izsVar, izsVar2, collection), new Signaling.Listener() { // from class: xsna.an0
                @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
                public final void onResponse(JSONObject jSONObject) {
                    AddParticipantsCommands.addParticipantsExtIds$lambda$0$0(izs.this, addParticipantsCommands, jSONObject);
                }
            });
        } catch (JSONException e) {
            if (izsVar2 != null) {
                izsVar2.invoke(new RuntimeException("add.participant", e));
            }
        }
        return s3q0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addParticipantsExtIds$lambda$0$0(izs izsVar, AddParticipantsCommands addParticipantsCommands, JSONObject jSONObject) {
        if (izsVar != null) {
            izsVar.invoke(addParticipantsCommands.parseAddError(jSONObject));
        }
    }

    private final AddParticipantsFailedException parseAddError(JSONObject jSONObject) {
        String optString = jSONObject.optString("message");
        if (optString == null) {
            optString = cq.c("Add participants error: ", jSONObject);
        }
        return new AddParticipantsFailedException(optString);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    private final AddByLinkFailedException parseErrorResponse(JSONObject jSONObject) {
        AddByLinkFailedException.Reason reason;
        String optString = jSONObject.optString("message");
        if (optString == null) {
            optString = cq.c("Add participant by link error: ", jSONObject);
        }
        String optString2 = jSONObject.optString("error");
        if (optString2 != null) {
            switch (optString2.hashCode()) {
                case -1949027499:
                    if (optString2.equals("malformed_qr_url")) {
                        reason = AddByLinkFailedException.Reason.MALFORMED_QR_URL;
                        break;
                    }
                    break;
                case -1148527576:
                    if (optString2.equals("qr.no_user_id_parameter")) {
                        reason = AddByLinkFailedException.Reason.QR_NO_USER_ID_PARAMETER;
                        break;
                    }
                    break;
                case -814624751:
                    if (optString2.equals("qr.wrong_prefix")) {
                        reason = AddByLinkFailedException.Reason.QR_WRONG_PREFIX;
                        break;
                    }
                    break;
                case -506696988:
                    if (optString2.equals("qr.general_error")) {
                        reason = AddByLinkFailedException.Reason.QR_GENERAL_ERROR;
                        break;
                    }
                    break;
                case -500593498:
                    if (optString2.equals("wrong_signature")) {
                        reason = AddByLinkFailedException.Reason.WRONG_SIGNATURE;
                        break;
                    }
                    break;
                case 1966207640:
                    if (optString2.equals("link_is_outdated")) {
                        reason = AddByLinkFailedException.Reason.LINK_OUTDATED;
                        break;
                    }
                    break;
            }
            return new AddByLinkFailedException(optString, reason);
        }
        reason = AddByLinkFailedException.Reason.UNKNOWN;
        return new AddByLinkFailedException(optString, reason);
    }

    private final void withSignaling(izs<? super Throwable, s3q0> izsVar, izs<? super Signaling, s3q0> izsVar2) {
        Signaling signaling = this.signalingProvider.getSignaling();
        if (signaling != null) {
            izsVar2.invoke(signaling);
        } else if (izsVar != null) {
            izsVar.invoke(new IllegalStateException("Conversation is not prepared or already destroyed"));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void withSignaling$default(AddParticipantsCommands addParticipantsCommands, izs izsVar, izs izsVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            izsVar = null;
        }
        addParticipantsCommands.withSignaling(izsVar, izsVar2);
    }

    public final void addParticipantByLink(String str, Runnable runnable, Consumer<Throwable> consumer) {
        withSignaling(new AddParticipantsCommands$addParticipantByLink$1(consumer), new dn0(0, str, consumer, runnable, this));
    }

    public final void addParticipantsExtIds(Collection<CallExternalId> collection, Boolean bool, boolean z, izs<? super AddParticipantsResult, s3q0> izsVar, izs<? super Throwable, s3q0> izsVar2) {
        if (this.stateProvider.invoke() == Conversation.State.Finished) {
            return;
        }
        withSignaling$default(this, null, new zm0(collection, bool, z, this, izsVar, izsVar2), 1, null);
    }

    /* compiled from: AddParticipantsCommands.kt */
    public final class ListenerAddParticipantsResponse implements Signaling.Listener {
        private final Collection<CallExternalId> externalIds;
        private final izs<Throwable, s3q0> onError;
        private final izs<AddParticipantsResult, s3q0> onSuccess;

        /* compiled from: AddParticipantsCommands.kt */
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Call.HandleParticipantAddedResult.values().length];
                try {
                    iArr[Call.HandleParticipantAddedResult.OK.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Call.HandleParticipantAddedResult.ERROR_STATE_ACCEPTED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ListenerAddParticipantsResponse(izs<? super AddParticipantsResult, s3q0> izsVar, izs<? super Throwable, s3q0> izsVar2, Collection<CallExternalId> collection) {
            this.onSuccess = izsVar;
            this.onError = izsVar2;
            this.externalIds = collection;
        }

        /* JADX WARN: Removed duplicated region for block: B:48:0x0141 A[Catch: JSONException -> 0x0048, TryCatch #0 {JSONException -> 0x0048, blocks: (B:3:0x0006, B:5:0x0017, B:7:0x0022, B:11:0x0054, B:12:0x0029, B:16:0x0044, B:19:0x004b, B:20:0x0050, B:22:0x0051, B:25:0x0057, B:27:0x005b, B:29:0x0065, B:30:0x0067, B:32:0x006f, B:33:0x0071, B:35:0x0079, B:36:0x007b, B:38:0x0083, B:39:0x0085, B:41:0x008e, B:44:0x0098, B:45:0x012c, B:46:0x013b, B:48:0x0141, B:51:0x014d, B:56:0x0151, B:57:0x0166, B:59:0x016c, B:62:0x0178, B:67:0x017c, B:68:0x018f, B:70:0x0195, B:73:0x01a1, B:78:0x01a5, B:79:0x01b2, B:81:0x01b8, B:84:0x01c4, B:89:0x01c8, B:91:0x009d, B:93:0x00a6, B:94:0x00ac, B:96:0x00b2, B:100:0x00cf, B:104:0x00dd, B:105:0x00ec, B:107:0x00f2, B:110:0x0100, B:115:0x0104, B:116:0x010f, B:118:0x0115, B:121:0x0123), top: B:2:0x0006 }] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x016c A[Catch: JSONException -> 0x0048, TryCatch #0 {JSONException -> 0x0048, blocks: (B:3:0x0006, B:5:0x0017, B:7:0x0022, B:11:0x0054, B:12:0x0029, B:16:0x0044, B:19:0x004b, B:20:0x0050, B:22:0x0051, B:25:0x0057, B:27:0x005b, B:29:0x0065, B:30:0x0067, B:32:0x006f, B:33:0x0071, B:35:0x0079, B:36:0x007b, B:38:0x0083, B:39:0x0085, B:41:0x008e, B:44:0x0098, B:45:0x012c, B:46:0x013b, B:48:0x0141, B:51:0x014d, B:56:0x0151, B:57:0x0166, B:59:0x016c, B:62:0x0178, B:67:0x017c, B:68:0x018f, B:70:0x0195, B:73:0x01a1, B:78:0x01a5, B:79:0x01b2, B:81:0x01b8, B:84:0x01c4, B:89:0x01c8, B:91:0x009d, B:93:0x00a6, B:94:0x00ac, B:96:0x00b2, B:100:0x00cf, B:104:0x00dd, B:105:0x00ec, B:107:0x00f2, B:110:0x0100, B:115:0x0104, B:116:0x010f, B:118:0x0115, B:121:0x0123), top: B:2:0x0006 }] */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0195 A[Catch: JSONException -> 0x0048, TryCatch #0 {JSONException -> 0x0048, blocks: (B:3:0x0006, B:5:0x0017, B:7:0x0022, B:11:0x0054, B:12:0x0029, B:16:0x0044, B:19:0x004b, B:20:0x0050, B:22:0x0051, B:25:0x0057, B:27:0x005b, B:29:0x0065, B:30:0x0067, B:32:0x006f, B:33:0x0071, B:35:0x0079, B:36:0x007b, B:38:0x0083, B:39:0x0085, B:41:0x008e, B:44:0x0098, B:45:0x012c, B:46:0x013b, B:48:0x0141, B:51:0x014d, B:56:0x0151, B:57:0x0166, B:59:0x016c, B:62:0x0178, B:67:0x017c, B:68:0x018f, B:70:0x0195, B:73:0x01a1, B:78:0x01a5, B:79:0x01b2, B:81:0x01b8, B:84:0x01c4, B:89:0x01c8, B:91:0x009d, B:93:0x00a6, B:94:0x00ac, B:96:0x00b2, B:100:0x00cf, B:104:0x00dd, B:105:0x00ec, B:107:0x00f2, B:110:0x0100, B:115:0x0104, B:116:0x010f, B:118:0x0115, B:121:0x0123), top: B:2:0x0006 }] */
        /* JADX WARN: Removed duplicated region for block: B:81:0x01b8 A[Catch: JSONException -> 0x0048, TryCatch #0 {JSONException -> 0x0048, blocks: (B:3:0x0006, B:5:0x0017, B:7:0x0022, B:11:0x0054, B:12:0x0029, B:16:0x0044, B:19:0x004b, B:20:0x0050, B:22:0x0051, B:25:0x0057, B:27:0x005b, B:29:0x0065, B:30:0x0067, B:32:0x006f, B:33:0x0071, B:35:0x0079, B:36:0x007b, B:38:0x0083, B:39:0x0085, B:41:0x008e, B:44:0x0098, B:45:0x012c, B:46:0x013b, B:48:0x0141, B:51:0x014d, B:56:0x0151, B:57:0x0166, B:59:0x016c, B:62:0x0178, B:67:0x017c, B:68:0x018f, B:70:0x0195, B:73:0x01a1, B:78:0x01a5, B:79:0x01b2, B:81:0x01b8, B:84:0x01c4, B:89:0x01c8, B:91:0x009d, B:93:0x00a6, B:94:0x00ac, B:96:0x00b2, B:100:0x00cf, B:104:0x00dd, B:105:0x00ec, B:107:0x00f2, B:110:0x0100, B:115:0x0104, B:116:0x010f, B:118:0x0115, B:121:0x0123), top: B:2:0x0006 }] */
        @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onResponse(JSONObject jSONObject) {
            RandomAccess randomAccess;
            RandomAccess randomAccess2;
            Iterator it;
            Iterator it2;
            Iterator it3;
            Iterator it4;
            try {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                if (jSONObject.has(SignalingProtocol.KEY_PARTICIPANTS)) {
                    JSONArray jSONArray = jSONObject.getJSONArray(SignalingProtocol.KEY_PARTICIPANTS);
                    int length = jSONObject.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject optJSONObject = jSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            CallParticipant.ParticipantId extractParticipantIdFromParticipant = SignalingProtocol.extractParticipantIdFromParticipant(optJSONObject);
                            int i2 = WhenMappings.$EnumSwitchMapping$0[AddParticipantsCommands.this.call.onParticipantAddedToCall(extractParticipantIdFromParticipant, optJSONObject).ordinal()];
                            if (i2 == 1) {
                                arrayList.add(extractParticipantIdFromParticipant);
                            } else {
                                if (i2 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                arrayList2.add(extractParticipantIdFromParticipant);
                            }
                        }
                    }
                }
                izs<AddParticipantsResult, s3q0> izsVar = this.onSuccess;
                if (izsVar != null) {
                    AddParticipantsCommands addParticipantsCommands = AddParticipantsCommands.this;
                    Iterable participantIdsFromStringArray = SignalingProtocol.getParticipantIdsFromStringArray(jSONObject, SignalingProtocol.KEY_REJECTED_PARTICIPANT_IDS);
                    if (participantIdsFromStringArray == null) {
                        participantIdsFromStringArray = EmptyList.b;
                    }
                    Iterable participantIdsFromStringArray2 = SignalingProtocol.getParticipantIdsFromStringArray(jSONObject, SignalingProtocol.KEY_BANNED_PARTICIPANT_IDS);
                    if (participantIdsFromStringArray2 == null) {
                        participantIdsFromStringArray2 = EmptyList.b;
                    }
                    Collection participantExtIdsFromDataArray = SignalingProtocol.getParticipantExtIdsFromDataArray(jSONObject, SignalingProtocol.KEY_REJECTED_PARTICIPANTS);
                    if (participantExtIdsFromDataArray == null) {
                        participantExtIdsFromDataArray = EmptyList.b;
                    }
                    Collection participantExtIdsFromDataArray2 = SignalingProtocol.getParticipantExtIdsFromDataArray(jSONObject, SignalingProtocol.KEY_BANNED_PARTICIPANTS);
                    if (participantExtIdsFromDataArray2 == null) {
                        participantExtIdsFromDataArray2 = EmptyList.b;
                    }
                    if (participantExtIdsFromDataArray.isEmpty() && participantExtIdsFromDataArray2.isEmpty()) {
                        randomAccess2 = EmptyList.b;
                        randomAccess = randomAccess2;
                        IdMappingWrapper idMappingWrapper = addParticipantsCommands.mappings;
                        ArrayList arrayList3 = new ArrayList();
                        it = participantIdsFromStringArray2.iterator();
                        while (it.hasNext()) {
                            ParticipantId byInternal = idMappingWrapper.getByInternal((CallParticipant.ParticipantId) it.next());
                            if (byInternal != null) {
                                arrayList3.add(byInternal);
                            }
                        }
                        ArrayList u0 = j5g.u0((Iterable) randomAccess2, arrayList3);
                        IdMappingWrapper idMappingWrapper2 = addParticipantsCommands.mappings;
                        ArrayList arrayList4 = new ArrayList();
                        it2 = participantIdsFromStringArray.iterator();
                        while (it2.hasNext()) {
                            ParticipantId byInternal2 = idMappingWrapper2.getByInternal((CallParticipant.ParticipantId) it2.next());
                            if (byInternal2 != null) {
                                arrayList4.add(byInternal2);
                            }
                        }
                        ArrayList u02 = j5g.u0((Iterable) randomAccess, arrayList4);
                        IdMappingWrapper idMappingWrapper3 = addParticipantsCommands.mappings;
                        ArrayList arrayList5 = new ArrayList();
                        it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            ParticipantId byInternal3 = idMappingWrapper3.getByInternal((CallParticipant.ParticipantId) it3.next());
                            if (byInternal3 != null) {
                                arrayList5.add(byInternal3);
                            }
                        }
                        IdMappingWrapper idMappingWrapper4 = addParticipantsCommands.mappings;
                        ArrayList arrayList6 = new ArrayList();
                        it4 = arrayList2.iterator();
                        while (it4.hasNext()) {
                            ParticipantId byInternal4 = idMappingWrapper4.getByInternal((CallParticipant.ParticipantId) it4.next());
                            if (byInternal4 != null) {
                                arrayList6.add(byInternal4);
                            }
                        }
                        izsVar.invoke(new AddParticipantsResult(arrayList5, arrayList6, u02, u0));
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Collection<CallExternalId> collection = this.externalIds;
                    if (collection != null) {
                        for (CallExternalId callExternalId : collection) {
                            Collection collection2 = participantExtIdsFromDataArray2;
                            linkedHashMap.put(callExternalId.getId(), new ParticipantId(callExternalId.getId(), callExternalId.getType() == CallExternalId.Type.ANONYM, callExternalId.getDeviceIndex()));
                            participantExtIdsFromDataArray2 = collection2;
                        }
                    }
                    ArrayList arrayList7 = new ArrayList();
                    Iterator it5 = participantExtIdsFromDataArray2.iterator();
                    while (it5.hasNext()) {
                        ParticipantId participantId = (ParticipantId) linkedHashMap.get((String) it5.next());
                        if (participantId != null) {
                            arrayList7.add(participantId);
                        }
                    }
                    ArrayList arrayList8 = new ArrayList();
                    Iterator it6 = participantExtIdsFromDataArray.iterator();
                    while (it6.hasNext()) {
                        ParticipantId participantId2 = (ParticipantId) linkedHashMap.get((String) it6.next());
                        if (participantId2 != null) {
                            arrayList8.add(participantId2);
                        }
                    }
                    randomAccess = arrayList8;
                    randomAccess2 = arrayList7;
                    IdMappingWrapper idMappingWrapper5 = addParticipantsCommands.mappings;
                    ArrayList arrayList32 = new ArrayList();
                    it = participantIdsFromStringArray2.iterator();
                    while (it.hasNext()) {
                    }
                    ArrayList u03 = j5g.u0((Iterable) randomAccess2, arrayList32);
                    IdMappingWrapper idMappingWrapper22 = addParticipantsCommands.mappings;
                    ArrayList arrayList42 = new ArrayList();
                    it2 = participantIdsFromStringArray.iterator();
                    while (it2.hasNext()) {
                    }
                    ArrayList u022 = j5g.u0((Iterable) randomAccess, arrayList42);
                    IdMappingWrapper idMappingWrapper32 = addParticipantsCommands.mappings;
                    ArrayList arrayList52 = new ArrayList();
                    it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                    }
                    IdMappingWrapper idMappingWrapper42 = addParticipantsCommands.mappings;
                    ArrayList arrayList62 = new ArrayList();
                    it4 = arrayList2.iterator();
                    while (it4.hasNext()) {
                    }
                    izsVar.invoke(new AddParticipantsResult(arrayList52, arrayList62, u022, u03));
                }
            } catch (JSONException e) {
                izs<Throwable, s3q0> izsVar2 = this.onError;
                if (izsVar2 != null) {
                    izsVar2.invoke(new RuntimeException("add.participant.success", e));
                }
            }
        }

        public ListenerAddParticipantsResponse(AddParticipantsCommands addParticipantsCommands, izs izsVar, izs izsVar2, Collection collection, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : izsVar, (i & 2) != 0 ? null : izsVar2, (i & 4) != 0 ? EmptyList.b : collection);
        }
    }
}
