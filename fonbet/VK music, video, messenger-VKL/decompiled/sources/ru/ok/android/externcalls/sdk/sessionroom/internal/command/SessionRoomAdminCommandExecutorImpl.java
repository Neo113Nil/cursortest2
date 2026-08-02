package ru.ok.android.externcalls.sdk.sessionroom.internal.command;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.sessionroom.admin.AssignParticipantsToRoomsParams;
import ru.ok.android.externcalls.sdk.sessionroom.admin.MoveParticipantParams;
import ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomAdminCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.sessionroom.internal.participant.SessionRoomParticipantsDataProviderImpl;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;
import ru.ok.android.externcalls.sdk.signaling.SignalingProviderKt;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import ru.ok.android.webrtc.sessionroom.admin.ActivateRoomsParams;
import ru.ok.android.webrtc.sessionroom.admin.RemoveRoomsParams;
import ru.ok.android.webrtc.sessionroom.admin.SwitchRoomParams;
import ru.ok.android.webrtc.sessionroom.admin.UpdateRoomsParams;
import ru.ok.android.webrtc.signaling.api.Signaling;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.c5g;
import xsna.gzs;
import xsna.izs;
import xsna.s3q0;
import xsna.sps;
import xsna.vui0;
import xsna.wui0;
import xsna.xui0;
import xsna.yui0;

/* compiled from: SessionRoomAdminCommandExecutorImpl.kt */
/* loaded from: classes9.dex */
public final class SessionRoomAdminCommandExecutorImpl extends SessionRoomCommandExecutorBase implements SessionRoomAdminCommandExecutor {
    private final SessionRoomParticipantsDataProviderImpl participantDataProvider;
    private final SignalingProvider signalingProvider;

    public SessionRoomAdminCommandExecutorImpl(SignalingProvider signalingProvider, SessionRoomParticipantsDataProviderImpl sessionRoomParticipantsDataProviderImpl) {
        this.signalingProvider = signalingProvider;
        this.participantDataProvider = sessionRoomParticipantsDataProviderImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void activateRooms$lambda$0(gzs gzsVar, JSONObject jSONObject) {
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    private final UpdateRoomsParams buildUpdateRoomsParams(Map<SessionRoomId.Room, ? extends List<ParticipantId>> map, Map<SessionRoomId.Room, ? extends List<ParticipantId>> map2, Map<ParticipantId, CallParticipant.ParticipantId> map3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashSet<SessionRoomId.Room> linkedHashSet = new LinkedHashSet();
        for (Map.Entry<SessionRoomId.Room, ? extends List<ParticipantId>> entry : map.entrySet()) {
            linkedHashSet.add(entry.getKey());
            Iterator<ParticipantId> it = entry.getValue().iterator();
            while (it.hasNext()) {
                CallParticipant.ParticipantId participantId = map3.get(it.next());
                if (participantId != null) {
                    SessionRoomId.Room key = entry.getKey();
                    Object obj = linkedHashMap.get(key);
                    if (obj == null) {
                        obj = new ArrayList();
                        linkedHashMap.put(key, obj);
                    }
                    ((List) obj).add(participantId);
                }
            }
        }
        for (Map.Entry<SessionRoomId.Room, ? extends List<ParticipantId>> entry2 : map2.entrySet()) {
            linkedHashSet.add(entry2.getKey());
            Iterator<ParticipantId> it2 = entry2.getValue().iterator();
            while (it2.hasNext()) {
                CallParticipant.ParticipantId participantId2 = map3.get(it2.next());
                if (participantId2 != null) {
                    SessionRoomId.Room key2 = entry2.getKey();
                    Object obj2 = linkedHashMap2.get(key2);
                    if (obj2 == null) {
                        obj2 = new ArrayList();
                        linkedHashMap2.put(key2, obj2);
                    }
                    ((List) obj2).add(participantId2);
                }
            }
        }
        UpdateRoomsParams.Builder builder = new UpdateRoomsParams.Builder();
        ArrayList arrayList = new ArrayList(c5g.u(linkedHashSet, 10));
        for (SessionRoomId.Room room : linkedHashSet) {
            UpdateRoomsParams.Room.Builder id = new UpdateRoomsParams.Room.Builder().setId(room);
            List list = (List) linkedHashMap.get(room);
            if (list != null) {
                id.setAddParticipantIds(list);
            }
            List list2 = (List) linkedHashMap2.get(room);
            if (list2 != null) {
                id.setRemoveParticipantIds(list2);
            }
            arrayList.add(id);
        }
        return builder.setRooms(arrayList).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 moveParticipant$lambda$0(SessionRoomAdminCommandExecutorImpl sessionRoomAdminCommandExecutorImpl, MoveParticipantParams moveParticipantParams, gzs gzsVar, izs izsVar, CallParticipant.ParticipantId participantId) {
        sessionRoomAdminCommandExecutorImpl.switchRoom(new SwitchRoomParams.Builder().setToRoomId(moveParticipantParams.getToRoomId()).setParticipantId(participantId).build(), gzsVar, izsVar);
        return s3q0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeRooms$lambda$0(gzs gzsVar, JSONObject jSONObject) {
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void switchRoom$lambda$0(gzs gzsVar, JSONObject jSONObject) {
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateRooms$lambda$0(gzs gzsVar, JSONObject jSONObject) {
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomAdminCommandExecutor
    public void activateRooms(ActivateRoomsParams activateRoomsParams, final gzs<s3q0> gzsVar, final izs<? super Throwable, s3q0> izsVar) {
        Signaling signaling = SignalingProviderKt.get(this.signalingProvider, izsVar);
        if (signaling == null) {
            return;
        }
        signaling.send(SignalingProtocol.createActivateRoomsCommand(activateRoomsParams), new Signaling.Listener() { // from class: xsna.bvi0
            @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
            public final void onResponse(JSONObject jSONObject) {
                SessionRoomAdminCommandExecutorImpl.activateRooms$lambda$0(gzs.this, jSONObject);
            }
        }, new Signaling.Listener() { // from class: xsna.cvi0
            @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
            public final void onResponse(JSONObject jSONObject) {
                SessionRoomAdminCommandExecutorImpl.this.parseErrorResponse("activateRooms", jSONObject, izsVar);
            }
        });
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomAdminCommandExecutor
    public void assignParticipantsToRooms(AssignParticipantsToRoomsParams assignParticipantsToRoomsParams, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        try {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.addAll(c5g.v(assignParticipantsToRoomsParams.getAddParticipantsToRoomsMap().values()));
            linkedHashSet.addAll(c5g.v(assignParticipantsToRoomsParams.getRemoveParticipantsFromRoomsMap().values()));
            updateRooms(buildUpdateRoomsParams(assignParticipantsToRoomsParams.getAddParticipantsToRoomsMap(), assignParticipantsToRoomsParams.getRemoveParticipantsFromRoomsMap(), this.participantDataProvider.getInternalIdsByExternal(linkedHashSet)), gzsVar, izsVar);
        } catch (Throwable th) {
            if (izsVar != null) {
                izsVar.invoke(th);
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomAdminCommandExecutor
    public void moveParticipant(MoveParticipantParams moveParticipantParams, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        ParticipantId participantId = moveParticipantParams.getParticipantId();
        if (participantId != null) {
            this.participantDataProvider.resolveInternalIdByExternal(participantId, new sps(this, moveParticipantParams, gzsVar, izsVar, 3), izsVar);
        } else {
            switchRoom(new SwitchRoomParams.Builder().setToRoomId(moveParticipantParams.getToRoomId()).build(), gzsVar, izsVar);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomAdminCommandExecutor
    public void removeRooms(RemoveRoomsParams removeRoomsParams, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        Signaling signaling = SignalingProviderKt.get(this.signalingProvider, izsVar);
        if (signaling == null) {
            return;
        }
        int i = 0;
        signaling.send(SignalingProtocol.createRemoveRoomsCommand(removeRoomsParams), new vui0(i, gzsVar), new wui0(i, this, izsVar));
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomAdminCommandExecutor
    public void switchRoom(SwitchRoomParams switchRoomParams, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        Signaling signaling = SignalingProviderKt.get(this.signalingProvider, izsVar);
        if (signaling == null) {
            return;
        }
        int i = 0;
        signaling.send(SignalingProtocol.createSwitchRoomCommand(switchRoomParams), new xui0(i, gzsVar), new yui0(i, this, izsVar));
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomAdminCommandExecutor
    public void updateRooms(UpdateRoomsParams updateRoomsParams, final gzs<s3q0> gzsVar, final izs<? super Throwable, s3q0> izsVar) {
        Signaling signaling = SignalingProviderKt.get(this.signalingProvider, izsVar);
        if (signaling == null) {
            return;
        }
        signaling.send(SignalingProtocol.createUpdateRoomsCommand(updateRoomsParams), new Signaling.Listener() { // from class: xsna.zui0
            @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
            public final void onResponse(JSONObject jSONObject) {
                SessionRoomAdminCommandExecutorImpl.updateRooms$lambda$0(gzs.this, jSONObject);
            }
        }, new Signaling.Listener() { // from class: xsna.avi0
            @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
            public final void onResponse(JSONObject jSONObject) {
                SessionRoomAdminCommandExecutorImpl.this.parseErrorResponse("updateRooms", jSONObject, izsVar);
            }
        });
    }
}
