package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.Editable;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.audio.AudioMsgTrackByRecord;
import com.vk.core.apps.BuildInfo;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachAudioMsg;
import com.vk.dto.attaches.AttachImage;
import com.vk.dto.attaches.AttachMarket;
import com.vk.dto.attaches.AttachSyncState;
import com.vk.dto.attaches.AttachWithTranscription;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.hints.HintId;
import com.vk.dto.im.MsgType;
import com.vk.dto.messages.MsgIdType;
import com.vk.dto.messages.MsgTextFormat;
import com.vk.dto.messages.MsgTextFormatItem;
import com.vk.dto.messages.WritePermission;
import com.vk.dto.stickers.StickersDictionaryItem;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.gallerypicker.di.PhotoEditorComponent;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.attaches.AttachChannelMessage;
import com.vk.im.engine.models.attaches.AttachQuestion;
import com.vk.im.engine.models.attaches.AttachVideoMsg;
import com.vk.im.engine.models.attaches.AttachWall;
import com.vk.im.engine.models.conversations.BotButton;
import com.vk.im.engine.models.conversations.BotKeyboard;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.dialogs.TransitionData;
import com.vk.im.engine.models.messages.CnvMsgId;
import com.vk.im.engine.models.messages.DraftMsg;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.messages.MsgSendSource;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.engine.models.typing.ComposingType;
import com.vk.im.engine.models.users.User;
import com.vk.im.ui.components.dialog_header.DialogHeaderController;
import com.vk.im.ui.components.viewcontrollers.msg_send.MsgSendHidePopupsReason;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.im.ui.views.RichEditText;
import com.vk.im.ui.views.WriteBarDisabled;
import com.vk.im.ui.views.WriteBarDisabledMoveToMaxBanner;
import com.vk.metrics.eventtracking.Event;
import com.vk.pending.PendingAudioMessageAttachment;
import com.vk.pending.PendingGraffitiAttachment;
import com.vk.pending.PendingPhotoAttachment;
import com.vk.pending.PendingStoryAttachment;
import com.vk.stickers.ContextUser;
import com.vk.stickers.autosuggest.QuickStickerSuggestState;
import com.vk.stickers.bridge.GiftData;
import com.vk.stickers.keyboard.StickersView;
import com.vk.stickers.keyboard.b;
import com.vk.toggle.features.ImFeatures;
import com.vk.writebar.WriteBar;
import com.vk.writebar.WriteBarPermissionsHolder;
import com.vkontakte.android.R;
import com.vkontakte.android.VKApplication;
import com.vkontakte.android.attachments.FwdMessagesAttachment;
import com.vkontakte.android.attachments.GraffitiAttachment;
import com.vkontakte.android.attachments.StickerAttachment;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.e3m;
import xsna.ezi0;
import xsna.hfr;
import xsna.hg1;
import xsna.ify;
import xsna.p040;
import xsna.qv4;
import xsna.r040;
import xsna.swm;
import xsna.tha0;
import xsna.vu4;
import xsna.xey;
import xsna.xgy;
import xsna.zdw;

/* compiled from: MsgSendVc.kt */
/* loaded from: classes7.dex */
public final class kz30 implements imv, ify.a, xey.a, w8i {
    public static final Object f0 = new Object();
    public View A;
    public RichEditText B;
    public StickersView C;
    public View D;
    public final bpn0 E;
    public View F;
    public TextView G;
    public View H;
    public View I;
    public vu4 J;
    public ChatFragment.k K;
    public xgy L;
    public dii0 M;
    public xgy N;
    public final b O;
    public final Object P;
    public final e4w Q;
    public final Handler R;
    public boolean S;
    public final p040 T;
    public final r040 U;
    public final bpn0 V;
    public final bpn0 W;
    public final int X;
    public boolean Y;
    public final bpn0 Z;
    public boolean a0;
    public final a1w b;
    public List<? extends Attachment> b0;
    public final mxv c;
    public final boolean c0;
    public final u90 d;
    public long d0;
    public long e;
    public final io.reactivex.rxjava3.disposables.c e0;
    public final zdw f;
    public final kkm g;
    public final Activity i;
    public MsgFromUser j;
    public DialogExt k;
    public List<e0l0> m;
    public c n;
    public final io.reactivex.rxjava3.disposables.b o;
    public final e38 p;
    public boolean q;
    public boolean r;
    public ContextUser s;
    public WriteBar t;
    public View u;
    public WriteBarDisabled v;
    public xew w;
    public WriteBarDisabledMoveToMaxBanner x;
    public View y;
    public View z;
    public final f2s h = new f2s(this, 27);
    public Set<UserId> l = new LinkedHashSet();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MsgSendVc.kt */
    public static final class c {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        public static final c CHANNEL;
        public static final c DISABLED;
        public static final c EDITING;
        public static final c KICKED;
        public static final c LEFT;
        public static final c NORMAL;

        static {
            c cVar = new c("NORMAL", 0);
            NORMAL = cVar;
            c cVar2 = new c("EDITING", 1);
            EDITING = cVar2;
            c cVar3 = new c("KICKED", 2);
            KICKED = cVar3;
            c cVar4 = new c("LEFT", 3);
            LEFT = cVar4;
            c cVar5 = new c("CHANNEL", 4);
            CHANNEL = cVar5;
            c cVar6 = new c("DISABLED", 5);
            DISABLED = cVar6;
            c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6};
            $VALUES = cVarArr;
            $ENTRIES = new asp(cVarArr);
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }
    }

    /* compiled from: MsgSendVc.kt */
    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[Peer.Type.values().length];
            try {
                iArr[Peer.Type.USER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Peer.Type.CONTACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Peer.Type.CHAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Peer.Type.GROUP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Peer.Type.CHANNEL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Peer.Type.EMAIL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Peer.Type.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[c.values().length];
            try {
                iArr2[c.DISABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[c.KICKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[c.CHANNEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[c.EDITING.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[WritePermission.State.values().length];
            try {
                iArr3[WritePermission.State.DISABLED_RESTRICTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[WritePermission.State.DISABLED_RESTRICTED_TO_ALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[WritePermission.State.DISABLED_BROADCAST.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[WritePermission.State.DISABLED_MOVED_TO_MAX.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[WritePermission.State.DISABLED_DONUT_EXPIRED.ordinal()] = 5;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[WritePermission.State.DISABLED_SENDER_KICKED.ordinal()] = 6;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[WritePermission.State.DISABLED_SENDER_LEFT.ordinal()] = 7;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[WritePermission.State.DISABLED_SENDER_FORBIDDEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr3[WritePermission.State.DISABLED_RECEIVER_PRIVACY_SETTINGS.ordinal()] = 9;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr3[WritePermission.State.DISABLED_RECEIVER_PERMISSION_REQUIRED.ordinal()] = 10;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr3[WritePermission.State.DISABLED_RECEIVER_ACCESS_DENIED.ordinal()] = 11;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr3[WritePermission.State.DISABLED_RECEIVER_MSG_NOT_ENABLED.ordinal()] = 12;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr3[WritePermission.State.DISABLED_RECEIVER_DELETED.ordinal()] = 13;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr3[WritePermission.State.DISABLED_COMMUNITY_CHAT.ordinal()] = 14;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr3[WritePermission.State.DISABLED_UNAVAILABLE.ordinal()] = 15;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr3[WritePermission.State.DISABLED_UNKNOWN.ordinal()] = 16;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr3[WritePermission.State.DISABLED_DUE_SPAM.ordinal()] = 17;
            } catch (NoSuchFieldError unused28) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* compiled from: MsgSendVc.kt */
    public static final class e {
        public e() {
        }
    }

    /* compiled from: MsgSendVc.kt */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements izs<t140, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(t140 t140Var) {
            t140 t140Var2 = t140Var;
            kz30 kz30Var = (kz30) this.receiver;
            kz30Var.getClass();
            MsgFromUser msgFromUser = (MsgFromUser) j5g.X(t140Var2.a.c.values());
            WriteBar writeBar = kz30Var.t;
            if (writeBar == null) {
                writeBar = null;
            }
            writeBar.Y(msgFromUser, t140Var2.b.Ob(), cdi.A(kz30Var.m, msgFromUser), true);
            kz30Var.E();
            return s3q0.a;
        }
    }

    /* compiled from: MsgSendVc.kt */
    public static final /* synthetic */ class g extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((kz30) this.receiver).getClass();
            com.vk.metrics.eventtracking.b.a.a(th);
            return s3q0.a;
        }
    }

    /* compiled from: MsgSendVc.kt */
    public static final /* synthetic */ class h extends FunctionReferenceImpl implements zzs<String, String, List<? extends Attach>, BotButton, s3q0> {
        @Override // xsna.zzs
        public final s3q0 invoke(String str, String str2, List<? extends Attach> list, BotButton botButton) {
            String str3 = str;
            String str4 = str2;
            List<? extends Attach> list2 = list;
            BotButton botButton2 = botButton;
            ChatFragment.k kVar = ((kz30) this.receiver).K;
            oz30.c(kVar == null ? null : kVar, 0, str3, null, str4, list2, null, new MsgSendSource.a(botButton2, null), null, null, 421);
            return s3q0.a;
        }
    }

    /* compiled from: MsgSendVc.kt */
    public static final class i implements tha0.a {
        public i() {
        }

        @Override // xsna.tha0.a
        public final void a(List list, String str, MsgSendSource msgSendSource) {
            ChatFragment.k kVar = kz30.this.K;
            if (kVar == null) {
                kVar = null;
            }
            ChatFragment.k kVar2 = kVar;
            if (str == null) {
                str = "";
            }
            oz30.c(kVar2, 0, null, null, str, list, null, msgSendSource, null, null, 423);
        }
    }

    public kz30(a1w a1wVar, mxv mxvVar, u90 u90Var, long j, zdw zdwVar, kkm kkmVar, int i2) {
        r040 r040Var;
        p040 p040Var;
        this.b = a1wVar;
        this.c = mxvVar;
        this.d = u90Var;
        this.e = j;
        this.f = zdwVar;
        this.g = kkmVar;
        this.i = e3m.h(u90Var.B());
        this.k = new DialogExt(this.e, (ProfilesInfo) null, 2, (zcl) null);
        EmptyList emptyList = EmptyList.b;
        this.m = emptyList;
        this.n = c.NORMAL;
        this.o = new io.reactivex.rxjava3.disposables.b();
        this.p = zdwVar.d.s();
        this.E = new bpn0(new m1o(this, 21));
        this.O = new b();
        this.P = msy.a(LazyThreadSafetyMode.NONE, new btm(this, 23));
        this.Q = new e4w(zdwVar);
        this.R = new Handler(Looper.getMainLooper());
        zdw.c cVar = zdwVar.l;
        this.T = (cVar == null || (p040Var = cVar.b) == null) ? p040.a.a.getSTUB() : p040Var;
        this.U = (cVar == null || (r040Var = cVar.a) == null) ? r040.a.a.getSTUB() : r040Var;
        this.V = new bpn0(new b010(this, 6));
        this.W = new bpn0(new s1m(this, 26));
        this.X = 100;
        this.Z = new bpn0(new bu0(20));
        this.b0 = emptyList;
        this.c0 = i2 == 2;
        io.reactivex.rxjava3.subjects.d.O0(Boolean.FALSE);
        this.e0 = new io.reactivex.rxjava3.internal.operators.observable.i0(a1wVar.l.a().a0(io.reactivex.rxjava3.android.schedulers.a.b()), new hg1.l2()).U(new hg1.k2()).subscribe(new fs00(new h2s(this, 20), 5), new ca10(new gz30(0), 2));
    }

    public static ArrayList F(MsgTextFormat msgTextFormat) {
        List<MsgTextFormatItem> list = msgTextFormat.c;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (hashSet.add(((MsgTextFormatItem) obj).d)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((MsgTextFormatItem) it.next()).d);
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return arrayList2;
    }

    public static boolean K(xgy xgyVar) {
        if (xgyVar == null || !xgyVar.e()) {
            return false;
        }
        xgyVar.d();
        s3q0 s3q0Var = s3q0.a;
        return true;
    }

    public static boolean M(dii0 dii0Var) {
        if (dii0Var == null || !dii0Var.e) {
            return false;
        }
        dii0Var.a();
        s3q0 s3q0Var = s3q0.a;
        return true;
    }

    public static void S(final kz30 kz30Var, List list, int i2) {
        if ((i2 & 1) != 0) {
            WriteBar writeBar = kz30Var.t;
            if (writeBar == null) {
                writeBar = null;
            }
            list = writeBar.getAttachments();
        }
        final boolean z = (i2 & 2) == 0;
        p040 p040Var = kz30Var.T;
        RichEditText richEditText = kz30Var.B;
        if (richEditText == null) {
            richEditText = null;
        }
        final MsgTextFormat b2 = p040Var.b(richEditText.getEditableText());
        xuo0.a.getClass();
        long a2 = xuo0.a();
        RichEditText richEditText2 = kz30Var.B;
        if (richEditText2 == null) {
            richEditText2 = null;
        }
        String valueOf = String.valueOf(richEditText2.getText());
        WriteBar writeBar2 = kz30Var.t;
        if (writeBar2 == null) {
            writeBar2 = null;
        }
        MsgFromUser replyMessage = writeBar2.getReplyMessage();
        Integer valueOf2 = replyMessage != null ? Integer.valueOf(replyMessage.d) : null;
        List list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (obj instanceof FwdMessagesAttachment) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(b0((FwdMessagesAttachment) it.next()));
        }
        ArrayList v = c5g.v(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            Attach b3 = ca3.b((Attachment) it2.next());
            if (b3 instanceof AttachImage) {
                AttachImage attachImage = (AttachImage) b3;
                if (attachImage.r.Jb()) {
                    attachImage.c = AttachSyncState.UPLOAD_REQUIRED;
                }
            }
            if (b3 != null) {
                arrayList3.add(b3);
            }
        }
        final DraftMsg draftMsg = new DraftMsg(a2, valueOf, b2, arrayList3, valueOf2, v);
        io.reactivex.rxjava3.internal.operators.single.c C = kz30Var.b.C(kz30Var, new swm(kz30Var.k.f, draftMsg, null));
        asu0 asu0Var = asu0.a;
        itg0.k(C.q(asu0Var.c()).m(asu0Var.d()).r(2000L, TimeUnit.MILLISECONDS), new izs() { // from class: xsna.iz30
            @Override // xsna.izs
            public final Object invoke(Object obj2) {
                swm.a aVar = (swm.a) obj2;
                kz30 kz30Var2 = kz30.this;
                DialogExt dialogExt = kz30Var2.k;
                bpn0 bpn0Var = kz30Var2.Z;
                Dialog Cb = dialogExt.Cb();
                if (Cb != null) {
                    Cb.Xc(draftMsg);
                }
                boolean f2 = epx.f(aVar, swm.a.C3697a.a);
                MsgTextFormat msgTextFormat = b2;
                if (f2) {
                    ((k0w) bpn0Var.getValue()).f(kz30Var2.e, kz30.F(msgTextFormat));
                } else if (epx.f(aVar, swm.a.b.a)) {
                    ArrayList F = kz30.F(msgTextFormat);
                    if (z) {
                        ((k0w) bpn0Var.getValue()).e(kz30Var2.e, F);
                    } else {
                        ((k0w) bpn0Var.getValue()).g(kz30Var2.e, F);
                    }
                } else if (!epx.f(aVar, swm.a.c.a) && !epx.f(aVar, swm.a.d.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return s3q0.a;
            }
        }, null, 2);
    }

    public static ArrayList b0(FwdMessagesAttachment fwdMessagesAttachment) {
        List<Integer> list = fwdMessagesAttachment.g;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new CnvMsgId(fwdMessagesAttachment.f, ((Number) it.next()).intValue()));
        }
        return arrayList;
    }

    public static ly30 c0(MsgType msgType) {
        if (epx.f(msgType, MsgType.Silent.b)) {
            return new ly30(null, null, null, 14);
        }
        if (msgType instanceof MsgType.WithTtl) {
            return new ly30(null, Long.valueOf(((MsgType.WithTtl) msgType).b), null, 11);
        }
        if (epx.f(msgType, MsgType.Delayed.b)) {
            return new ly30(null, null, null, 15);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.rnv
    public final void A() {
        WriteBar writeBar = this.t;
        if (writeBar == null) {
            writeBar = null;
        }
        writeBar.G();
    }

    @Override // xsna.rnv
    public final void B(MsgFromUser msgFromUser) {
        MsgFromUser msgFromUser2 = msgFromUser;
        MsgFromUser msgFromUser3 = this.j;
        if (msgFromUser3 == null || msgFromUser3.b != msgFromUser2.b) {
            MsgIdType msgIdType = MsgIdType.LOCAL_ID;
            List singletonList = Collections.singletonList(Integer.valueOf(msgFromUser2.b));
            long j = msgFromUser2.c;
            Serializer.c<Peer> cVar = Peer.CREATOR;
            this.o.b(this.b.F(this, new ej30(msgIdType, singletonList, Peer.a.b(j), Source.CACHE, 48)).subscribe(new lav(new pf8(1, this, kz30.class, "onStartMsgEditLoadSuccess", "onStartMsgEditLoadSuccess(Lcom/vk/im/engine/models/messages/MsgsExt;)V", 0, 8), 8), new bf2(new b95(1, this, kz30.class, "onStartMsgEditLoadError", "onStartMsgEditLoadError(Ljava/lang/Throwable;)V", 0, 7), 28)));
        }
    }

    @Override // xsna.rnv
    public final void C(long j) {
        long j2 = this.d0;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - j2 >= 200) {
            ChatFragment.k kVar = this.K;
            if (kVar == null) {
                kVar = null;
            }
            kVar.getClass();
            ezi0.b bVar = ezi0.d;
            ChatFragment chatFragment = ChatFragment.this;
            ChatFragment.d dVar = ChatFragment.w1;
            bVar.a(chatFragment.io(), chatFragment.no().b, chatFragment.ho(), ComposingType.VIDEO_MSG);
            j2 = currentTimeMillis;
        }
        this.d0 = j2;
        WriteBar writeBar = this.t;
        (writeBar != null ? writeBar : null).setTimeProgress(((int) j) / 1000);
    }

    @Override // xsna.rnv
    public final void D() {
        c cVar = this.n;
        c cVar2 = c.NORMAL;
        if (cVar == cVar2) {
            return;
        }
        this.j = null;
        y();
        R();
        j0(cVar2);
        ChatFragment.k kVar = this.K;
        if (kVar == null) {
            kVar = null;
        }
        ChatFragment chatFragment = ChatFragment.this;
        DialogHeaderController dialogHeaderController = chatFragment.K0;
        if ((dialogHeaderController == null ? null : dialogHeaderController).j == DialogHeaderController.Screen.EDIT) {
            if (dialogHeaderController == null) {
                dialogHeaderController = null;
            }
            dialogHeaderController.r();
        }
        com.vk.im.ui.components.msg_list.a aVar = chatFragment.H0;
        if (aVar == null) {
            aVar = null;
        }
        if (aVar.C1()) {
            com.vk.im.ui.components.msg_list.a aVar2 = chatFragment.H0;
            if (aVar2 == null) {
                aVar2 = null;
            }
            aVar2.O0.k(null);
            aVar2.T.d();
        }
    }

    public final void E() {
        QuickStickerSuggestState quickStickerSuggestState;
        Dialog Cb;
        WriteBar writeBar = this.t;
        if (writeBar == null) {
            writeBar = null;
        }
        MsgFromUser replyMessage = writeBar.getReplyMessage();
        WriteBar writeBar2 = this.t;
        if (writeBar2 == null) {
            writeBar2 = null;
        }
        boolean isEmpty = writeBar2.getAttachments().isEmpty();
        if (replyMessage == null || !isEmpty || (Cb = this.k.Cb()) == null || o25.b(o25.a()) || Cb.tc() || Cb.rc() || Cb.Va() || !Cb.Gb()) {
            quickStickerSuggestState = QuickStickerSuggestState.DISABLED;
        } else {
            a1w a1wVar = this.b;
            a1wVar.getClass();
            cau0 cau0Var = a1wVar.r().h;
            ImFeatures imFeatures = ImFeatures.QUICK_STICKER_SUGGEST_POST;
            imFeatures.getClass();
            quickStickerSuggestState = (com.vk.toggle.b.A.a(imFeatures) && replyMessage.i && replyMessage.F.length() == 0 && replyMessage.R == null && replyMessage.H.size() == 1 && ((j5g.Y(replyMessage.H) instanceof AttachWall) || (j5g.Y(replyMessage.H) instanceof AttachChannelMessage))) ? QuickStickerSuggestState.POSTS : QuickStickerSuggestState.DISABLED;
        }
        WriteBar writeBar3 = this.t;
        (writeBar3 != null ? writeBar3 : null).setQuickStickerSuggestState(quickStickerSuggestState);
    }

    public final d38 G() {
        return (d38) this.V.getValue();
    }

    public final xgy H() {
        xgy xgyVar = this.N;
        if (xgyVar != null) {
            return xgyVar;
        }
        G().n = new e();
        d38 G = G();
        WriteBar writeBar = this.t;
        if (writeBar == null) {
            writeBar = null;
        }
        View D0 = G.D0(this.i, writeBar, null, Bundle.EMPTY);
        this.F = D0;
        View view = this.u;
        xgy xgyVar2 = new xgy(this.i, view == null ? null : view, D0, null, new d810(this, 3), 72);
        xgyVar2.o = this.O;
        this.N = xgyVar2;
        return xgyVar2;
    }

    public final String I() {
        int i2;
        ChatSettings Hb;
        ChatSettings Hb2;
        Context applicationContext = this.i.getApplicationContext();
        Dialog Cb = this.k.Cb();
        boolean z = false;
        if (Cb != null) {
            xuo0.a.getClass();
            if (Cb.Ac(xuo0.a())) {
                z = true;
            }
        }
        Dialog Cb2 = this.k.Cb();
        if (Cb2 != null && (Hb2 = Cb2.Hb()) != null && Hb2.J) {
            return applicationContext.getString(R.string.vkim_msg_write_disabled_chat_deleted);
        }
        if (this.n == c.CHANNEL) {
            Dialog Cb3 = this.k.Cb();
            return applicationContext.getString((Cb3 == null || (Hb = Cb3.Hb()) == null || !Hb.j) ? z ? R.string.vkim_dialogs_list_option_notifications_off : R.string.vkim_dialogs_list_option_notifications_on : R.string.vkim_msg_write_channel_follow);
        }
        Dialog Cb4 = this.k.Cb();
        Object[] objArr = null;
        WritePermission oc = Cb4 != null ? Cb4.oc() : null;
        WritePermission.State state = oc != null ? oc.a : null;
        switch (state == null ? -1 : d.$EnumSwitchMapping$2[state.ordinal()]) {
            case 1:
                long j = oc.b;
                if (j != -1) {
                    Date date = new Date(j * 1000);
                    objArr = new Object[]{new SimpleDateFormat("dd", Locale.getDefault()).format(date), new SimpleDateFormat("MMMM", Locale.getDefault()).format(date), new SimpleDateFormat("HH:mm", Locale.getDefault()).format(date)};
                    i2 = R.string.vkim_msg_write_disabled_restricted;
                    break;
                } else {
                    i2 = R.string.vkim_msg_write_disabled_restricted_forever;
                    break;
                }
            case 2:
                Dialog Cb5 = this.k.Cb();
                ChatSettings Hb3 = Cb5 != null ? Cb5.Hb() : null;
                if (Hb3 != null) {
                    long j2 = Hb3.I;
                    if (j2 >= 1) {
                        Date date2 = new Date(j2 * 1000);
                        objArr = new Object[]{new SimpleDateFormat("dd", Locale.getDefault()).format(date2), new SimpleDateFormat("MMMM", Locale.getDefault()).format(date2), new SimpleDateFormat("HH:mm", Locale.getDefault()).format(date2)};
                        i2 = R.string.vkim_msg_write_disabled_restricted_to_all;
                        break;
                    }
                }
                i2 = R.string.vkim_msg_write_disabled_restricted_to_all_forever;
                break;
            case 3:
                i2 = R.string.vkim_msg_write_disabled_broadcast;
                break;
            case 4:
            case 16:
            default:
                i2 = R.string.vkim_msg_write_disabled_unknown;
                break;
            case 5:
                i2 = R.string.vkim_msg_write_disabled_donut;
                break;
            case 6:
                i2 = R.string.vkim_msg_write_disabled_sender_kicked;
                break;
            case 7:
                i2 = R.string.vkim_msg_write_disabled_sender_left;
                break;
            case 8:
                i2 = R.string.vkim_msg_write_disabled_sender_forbidden;
                break;
            case 9:
                i2 = R.string.vkim_msg_write_disabled_receiver_privacy_settings;
                break;
            case 10:
                i2 = R.string.vkim_msg_write_disabled_receiver_permission_required;
                break;
            case 11:
                i2 = R.string.vkim_msg_write_disabled_receiver_access_denied;
                break;
            case 12:
                i2 = R.string.vkim_msg_write_disabled_receiver_msg_not_enabled;
                break;
            case 13:
                i2 = R.string.vkim_msg_write_disabled_receiver_deleted_or_banned;
                break;
            case 14:
                i2 = R.string.vkim_msg_write_disabled_community_chat;
                break;
            case 15:
                i2 = R.string.vkim_msg_write_disabled_unavailable;
                break;
            case 17:
                i2 = R.string.vkim_msg_write_disabled_due_spam;
                break;
        }
        return objArr == null ? applicationContext.getString(i2) : applicationContext.getString(i2, Arrays.copyOf(objArr, objArr.length));
    }

    public final xgy J() {
        xgy xgyVar = this.L;
        if (xgyVar != null) {
            return xgyVar;
        }
        View view = this.u;
        View view2 = view == null ? null : view;
        StickersView stickersView = this.C;
        xgy xgyVar2 = new xgy(this.i, view2, stickersView == null ? null : stickersView, null, new uf20(this, 3), 88);
        WriteBar writeBar = this.t;
        xgyVar2.a((writeBar != null ? writeBar : null).getEmojiAnchor(), 0);
        xgyVar2.o = this.O;
        this.L = xgyVar2;
        return xgyVar2;
    }

    @Override // xsna.rnv
    public final void L() {
        this.r = false;
        this.Q.a();
        this.R.removeCallbacksAndMessages(null);
        G().H0();
        vu4 vu4Var = this.J;
        if (vu4Var == null) {
            vu4Var = null;
        }
        vu4Var.H0();
        vu4 vu4Var2 = this.J;
        if (vu4Var2 == null) {
            vu4Var2 = null;
        }
        vu4Var2.G0();
        this.o.e();
        int i2 = ify.a;
        ify.g(this);
        ChatFragment.k kVar = this.K;
        if (kVar == null) {
            kVar = null;
        }
        ChatFragment chatFragment = ChatFragment.this;
        ChatFragment.d dVar = ChatFragment.w1;
        if (chatFragment.mo().l()) {
            xey xeyVar = chatFragment.t1;
            if (xeyVar == null) {
                xeyVar = null;
            }
            xeyVar.i.remove(this);
        }
        WriteBar writeBar = this.t;
        (writeBar != null ? writeBar : null).N();
    }

    public final void N() {
        xgy xgyVar = this.N;
        if (xgyVar != null && xgyVar.e()) {
            View view = this.F;
            if (view != null) {
                view.setVisibility(4);
            }
            ChatFragment.k kVar = this.K;
            if (kVar == null) {
                kVar = null;
            }
            kVar.e(xgyVar.f.getHeight());
        }
        xgy xgyVar2 = this.L;
        if (xgyVar2 == null || !xgyVar2.e()) {
            return;
        }
        RichEditText richEditText = this.B;
        if (richEditText == null) {
            richEditText = null;
        }
        richEditText.requestFocus();
        StickersView stickersView = this.C;
        if (stickersView == null) {
            stickersView = null;
        }
        stickersView.setVisibility(4);
        ChatFragment.k kVar2 = this.K;
        (kVar2 != null ? kVar2 : null).f();
    }

    public final boolean O() {
        jhu0 jhu0Var = ((fj9) ij9.a.a.getValue()).a;
        return (jhu0Var != null ? jhu0Var.m() : false) && !this.c0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0213, code lost:
    
        if (r5.Ab(com.vk.dto.common.Peer.Type.GROUP) == false) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0363  */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P(oz30 oz30Var, View view, Bundle bundle) {
        b.c cVar;
        b.c c1798c;
        StickersView stickersView;
        StickersView stickersView2;
        WriteBar writeBar;
        WriteBar writeBar2;
        WriteBar writeBar3;
        WriteBar writeBar4;
        WriteBar writeBar5;
        WriteBar writeBar6;
        WriteBar writeBar7;
        WriteBar writeBar8;
        WriteBar writeBar9;
        WriteBar writeBar10;
        ChatFragment.k kVar;
        ChatFragment chatFragment;
        wtb wtbVar = (wtb) oz30Var;
        this.K = (ChatFragment.k) wtbVar;
        this.u = view;
        boolean z = true;
        LayoutInflater.from(view.getContext()).inflate(R.layout.im_include_write_bar, (ViewGroup) view.findViewById(R.id.write_area), true);
        WriteBarDisabled writeBarDisabled = (WriteBarDisabled) view.findViewById(R.id.write_bar_disabled);
        kkm kkmVar = this.g;
        writeBarDisabled.setThemeBinder(kkmVar);
        this.v = writeBarDisabled;
        this.w = new xew((ViewStub) view.findViewById(R.id.write_bar_disabled_cell_stub));
        WriteBar writeBar11 = (WriteBar) view.findViewById(R.id.write_bar);
        this.t = writeBar11;
        writeBar11.setHidePopup(true);
        WriteBar writeBar12 = this.t;
        if (writeBar12 == null) {
            writeBar12 = null;
        }
        this.y = writeBar12.findViewById(R.id.writebar_send);
        WriteBar writeBar13 = this.t;
        if (writeBar13 == null) {
            writeBar13 = null;
        }
        this.B = (RichEditText) writeBar13.findViewById(R.id.writebar_edit);
        WriteBar writeBar14 = this.t;
        if (writeBar14 == null) {
            writeBar14 = null;
        }
        this.A = writeBar14.findViewById(R.id.writebar_bot_keyboard);
        WriteBar writeBar15 = this.t;
        if (writeBar15 == null) {
            writeBar15 = null;
        }
        this.z = writeBar15.findViewById(R.id.writebar_emoji);
        this.D = view.findViewById(R.id.keyboard_background);
        this.J = new vu4(this.i, new jj3(view, 2), new hz30(view, 0), new a(), this.c, this.e, kkmVar, false, kkmVar.f(R.attr.vk_ui_text_subhead), kkmVar.f(R.attr.vk_ui_background_modal), e3m.a(R.dimen.writebar_audio_area_height, view.getContext()), vu4.G);
        WriteBar writeBar16 = this.t;
        if (writeBar16 == null) {
            writeBar16 = null;
        }
        writeBar16.setDialogId(this.e);
        WriteBar writeBar17 = this.t;
        if (writeBar17 == null) {
            writeBar17 = null;
        }
        writeBar17.setResultFragment(wtbVar.a());
        WriteBar writeBar18 = this.t;
        if (writeBar18 == null) {
            writeBar18 = null;
        }
        writeBar18.setThemeBinder(kkmVar);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.bottom_sheet_container);
        if (viewGroup != null) {
            WriteBar writeBar19 = this.t;
            if (writeBar19 == null) {
                writeBar19 = null;
            }
            writeBar19.setBottomSheetContainer(viewGroup);
        }
        com.vk.movika.sdk.base.asset.b bVar = new com.vk.movika.sdk.base.asset.b(this);
        e7a0 Ab = ((PhotoEditorComponent) ((k7m) m7m.f(this)).a(fpf0.a(PhotoEditorComponent.class))).Ab();
        m130 m130Var = new m130(this, 4);
        a1w a1wVar = this.b;
        swv swvVar = new swv(a1wVar, bVar, Ab, m130Var);
        WriteBar writeBar20 = this.t;
        if (writeBar20 == null) {
            writeBar20 = null;
        }
        writeBar20.setAttachUploader(swvVar);
        boolean z2 = !o25.b(o25.a());
        boolean K = o25.a().K(this.e);
        boolean z3 = this.c0;
        boolean z4 = K && !z3;
        WriteBar writeBar21 = this.t;
        if (writeBar21 == null) {
            writeBar21 = null;
        }
        writeBar21.setMoneySendAllowed(z4);
        WriteBar writeBar22 = this.t;
        if (writeBar22 == null) {
            writeBar22 = null;
        }
        writeBar22.setMoneyRequestAllowed(z4);
        WriteBar writeBar23 = this.t;
        if (writeBar23 == null) {
            writeBar23 = null;
        }
        writeBar23.setPhotoVideoFromVkAllowed(z2);
        WriteBar writeBar24 = this.t;
        if (writeBar24 == null) {
            writeBar24 = null;
        }
        writeBar24.setDocumentsSearchAllowed(z2);
        WriteBar writeBar25 = this.t;
        if (writeBar25 == null) {
            writeBar25 = null;
        }
        writeBar25.setGraffitiAllowed(true);
        WriteBar writeBar26 = this.t;
        if (writeBar26 == null) {
            writeBar26 = null;
        }
        writeBar26.b(o25.a().c(), false);
        WriteBar writeBar27 = this.t;
        if (writeBar27 == null) {
            writeBar27 = null;
        }
        writeBar27.setOwnerId(com.vk.dto.common.a.b(a1wVar.q()));
        g760 k4 = ((PhotoEditorComponent) ((k7m) m7m.f(this)).a(fpf0.a(PhotoEditorComponent.class))).k4();
        WriteBar writeBar28 = this.t;
        if (writeBar28 == null) {
            writeBar28 = null;
        }
        com.vk.writebar.c cVar2 = writeBar28.C;
        cVar2.o = k4;
        cVar2.p = "messenger";
        if (cVar2.h.isInitialized()) {
            cVar2.c().setNewEditorScreenFactory(k4);
        }
        WriteBar writeBar29 = this.t;
        if (writeBar29 == null) {
            writeBar29 = null;
        }
        Activity activity = this.i;
        writeBar29.S(activity, null);
        WriteBar writeBar30 = this.t;
        if (writeBar30 == null) {
            writeBar30 = null;
        }
        int i2 = this.X;
        writeBar30.setAttachLimits(i2);
        WriteBar writeBar31 = this.t;
        if (writeBar31 == null) {
            writeBar31 = null;
        }
        a1wVar.r().getClass();
        writeBar31.setAttachLimitHintEnabled(i2 > 10);
        WriteBar writeBar32 = this.t;
        if (writeBar32 == null) {
            writeBar32 = null;
        }
        writeBar32.setVideoMsgRecordingAllowed(O());
        WriteBar writeBar33 = this.t;
        if (writeBar33 == null) {
            writeBar33 = null;
        }
        if (!z3) {
            Peer q = a1wVar.q();
            q.getClass();
        }
        z = false;
        writeBar33.setAudioMsgRecordingAllowed(z);
        WriteBar writeBar34 = this.t;
        if (writeBar34 == null) {
            writeBar34 = null;
        }
        View findViewById = writeBar34.findViewById(R.id.writebar_record_video);
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        if (!findViewById.isLaidOut()) {
            findViewById.addOnLayoutChangeListener(new mz30(findViewById, this));
        } else if (bwt0.K(findViewById)) {
            this.Q.c(findViewById);
        }
        RichEditText richEditText = this.B;
        if (richEditText == null) {
            richEditText = null;
        }
        richEditText.setImeOptions(268435456);
        this.C = new StickersView(activity, (StickersView.c) null, 6);
        n(bundle, this.e);
        UserId userId = new UserId(this.e);
        Dialog Cb = this.k.Cb();
        Peer.Type bc = Cb != null ? Cb.bc() : null;
        switch (bc == null ? -1 : d.$EnumSwitchMapping$0[bc.ordinal()]) {
            case -1:
                cVar = b.c.C1799b.a;
                stickersView = this.C;
                if (stickersView == null) {
                    stickersView = null;
                }
                stickersView.setStickersKeyboardContext(cVar);
                lz30 lz30Var = new lz30(this);
                stickersView2 = this.C;
                if (stickersView2 == null) {
                    stickersView2 = null;
                }
                stickersView2.setListener(lz30Var);
                writeBar = this.t;
                if (writeBar == null) {
                    writeBar = null;
                }
                writeBar.setAutoSuggestPopupListener(lz30Var);
                writeBar2 = this.t;
                if (writeBar2 == null) {
                    writeBar2 = null;
                }
                int i3 = 3;
                writeBar2.setCanPinAttachmentProvider(new ag20(this, i3));
                writeBar3 = this.t;
                if (writeBar3 == null) {
                    writeBar3 = null;
                }
                writeBar3.setWriteBarSendListener(new tsu(this));
                writeBar4 = this.t;
                if (writeBar4 == null) {
                    writeBar4 = null;
                }
                writeBar4.setTemplatesButtonClick(new q130(this, i3));
                writeBar5 = this.t;
                if (writeBar5 == null) {
                    writeBar5 = null;
                }
                writeBar5.setWriteBarAttachesListener(new vob(this));
                writeBar6 = this.t;
                if (writeBar6 == null) {
                    writeBar6 = null;
                }
                int i4 = 27;
                writeBar6.setOnBotKeyboardButtonClick(new kdn(this, i4));
                writeBar7 = this.t;
                if (writeBar7 == null) {
                    writeBar7 = null;
                }
                writeBar7.setWriteBarInputListener(new com.vk.movika.sdk.base.data.converter.c(this));
                writeBar8 = this.t;
                if (writeBar8 == null) {
                    writeBar8 = null;
                }
                writeBar8.setWriteBarReplyMessageListener(new kf3(this, i4));
                writeBar9 = this.t;
                if (writeBar9 == null) {
                    writeBar9 = null;
                }
                writeBar9.setWriteBarStickersListener(new eml(this));
                writeBar10 = this.t;
                if (writeBar10 == null) {
                    writeBar10 = null;
                }
                writeBar10.setWriteBarMediaListener(new yxu(this));
                int i5 = ify.a;
                ify.a(this);
                kVar = this.K;
                if (kVar == null) {
                    kVar = null;
                }
                chatFragment = ChatFragment.this;
                ChatFragment.d dVar = ChatFragment.w1;
                if (chatFragment.mo().l()) {
                    xey xeyVar = chatFragment.t1;
                    if (xeyVar == null) {
                        xeyVar = null;
                    }
                    xeyVar.D(this);
                }
                RichEditText richEditText2 = this.B;
                this.T.a(richEditText2 != null ? richEditText2 : null);
                return;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                c1798c = new b.c.a.C1798c(userId);
                cVar = c1798c;
                stickersView = this.C;
                if (stickersView == null) {
                }
                stickersView.setStickersKeyboardContext(cVar);
                lz30 lz30Var2 = new lz30(this);
                stickersView2 = this.C;
                if (stickersView2 == null) {
                }
                stickersView2.setListener(lz30Var2);
                writeBar = this.t;
                if (writeBar == null) {
                }
                writeBar.setAutoSuggestPopupListener(lz30Var2);
                writeBar2 = this.t;
                if (writeBar2 == null) {
                }
                int i32 = 3;
                writeBar2.setCanPinAttachmentProvider(new ag20(this, i32));
                writeBar3 = this.t;
                if (writeBar3 == null) {
                }
                writeBar3.setWriteBarSendListener(new tsu(this));
                writeBar4 = this.t;
                if (writeBar4 == null) {
                }
                writeBar4.setTemplatesButtonClick(new q130(this, i32));
                writeBar5 = this.t;
                if (writeBar5 == null) {
                }
                writeBar5.setWriteBarAttachesListener(new vob(this));
                writeBar6 = this.t;
                if (writeBar6 == null) {
                }
                int i42 = 27;
                writeBar6.setOnBotKeyboardButtonClick(new kdn(this, i42));
                writeBar7 = this.t;
                if (writeBar7 == null) {
                }
                writeBar7.setWriteBarInputListener(new com.vk.movika.sdk.base.data.converter.c(this));
                writeBar8 = this.t;
                if (writeBar8 == null) {
                }
                writeBar8.setWriteBarReplyMessageListener(new kf3(this, i42));
                writeBar9 = this.t;
                if (writeBar9 == null) {
                }
                writeBar9.setWriteBarStickersListener(new eml(this));
                writeBar10 = this.t;
                if (writeBar10 == null) {
                }
                writeBar10.setWriteBarMediaListener(new yxu(this));
                int i52 = ify.a;
                ify.a(this);
                kVar = this.K;
                if (kVar == null) {
                }
                chatFragment = ChatFragment.this;
                ChatFragment.d dVar2 = ChatFragment.w1;
                if (chatFragment.mo().l()) {
                }
                RichEditText richEditText22 = this.B;
                this.T.a(richEditText22 != null ? richEditText22 : null);
                return;
            case 2:
                c1798c = new b.c.a.C1798c(userId);
                cVar = c1798c;
                stickersView = this.C;
                if (stickersView == null) {
                }
                stickersView.setStickersKeyboardContext(cVar);
                lz30 lz30Var22 = new lz30(this);
                stickersView2 = this.C;
                if (stickersView2 == null) {
                }
                stickersView2.setListener(lz30Var22);
                writeBar = this.t;
                if (writeBar == null) {
                }
                writeBar.setAutoSuggestPopupListener(lz30Var22);
                writeBar2 = this.t;
                if (writeBar2 == null) {
                }
                int i322 = 3;
                writeBar2.setCanPinAttachmentProvider(new ag20(this, i322));
                writeBar3 = this.t;
                if (writeBar3 == null) {
                }
                writeBar3.setWriteBarSendListener(new tsu(this));
                writeBar4 = this.t;
                if (writeBar4 == null) {
                }
                writeBar4.setTemplatesButtonClick(new q130(this, i322));
                writeBar5 = this.t;
                if (writeBar5 == null) {
                }
                writeBar5.setWriteBarAttachesListener(new vob(this));
                writeBar6 = this.t;
                if (writeBar6 == null) {
                }
                int i422 = 27;
                writeBar6.setOnBotKeyboardButtonClick(new kdn(this, i422));
                writeBar7 = this.t;
                if (writeBar7 == null) {
                }
                writeBar7.setWriteBarInputListener(new com.vk.movika.sdk.base.data.converter.c(this));
                writeBar8 = this.t;
                if (writeBar8 == null) {
                }
                writeBar8.setWriteBarReplyMessageListener(new kf3(this, i422));
                writeBar9 = this.t;
                if (writeBar9 == null) {
                }
                writeBar9.setWriteBarStickersListener(new eml(this));
                writeBar10 = this.t;
                if (writeBar10 == null) {
                }
                writeBar10.setWriteBarMediaListener(new yxu(this));
                int i522 = ify.a;
                ify.a(this);
                kVar = this.K;
                if (kVar == null) {
                }
                chatFragment = ChatFragment.this;
                ChatFragment.d dVar22 = ChatFragment.w1;
                if (chatFragment.mo().l()) {
                }
                RichEditText richEditText222 = this.B;
                this.T.a(richEditText222 != null ? richEditText222 : null);
                return;
            case 3:
                c1798c = new b.c.a.C1796a(userId);
                cVar = c1798c;
                stickersView = this.C;
                if (stickersView == null) {
                }
                stickersView.setStickersKeyboardContext(cVar);
                lz30 lz30Var222 = new lz30(this);
                stickersView2 = this.C;
                if (stickersView2 == null) {
                }
                stickersView2.setListener(lz30Var222);
                writeBar = this.t;
                if (writeBar == null) {
                }
                writeBar.setAutoSuggestPopupListener(lz30Var222);
                writeBar2 = this.t;
                if (writeBar2 == null) {
                }
                int i3222 = 3;
                writeBar2.setCanPinAttachmentProvider(new ag20(this, i3222));
                writeBar3 = this.t;
                if (writeBar3 == null) {
                }
                writeBar3.setWriteBarSendListener(new tsu(this));
                writeBar4 = this.t;
                if (writeBar4 == null) {
                }
                writeBar4.setTemplatesButtonClick(new q130(this, i3222));
                writeBar5 = this.t;
                if (writeBar5 == null) {
                }
                writeBar5.setWriteBarAttachesListener(new vob(this));
                writeBar6 = this.t;
                if (writeBar6 == null) {
                }
                int i4222 = 27;
                writeBar6.setOnBotKeyboardButtonClick(new kdn(this, i4222));
                writeBar7 = this.t;
                if (writeBar7 == null) {
                }
                writeBar7.setWriteBarInputListener(new com.vk.movika.sdk.base.data.converter.c(this));
                writeBar8 = this.t;
                if (writeBar8 == null) {
                }
                writeBar8.setWriteBarReplyMessageListener(new kf3(this, i4222));
                writeBar9 = this.t;
                if (writeBar9 == null) {
                }
                writeBar9.setWriteBarStickersListener(new eml(this));
                writeBar10 = this.t;
                if (writeBar10 == null) {
                }
                writeBar10.setWriteBarMediaListener(new yxu(this));
                int i5222 = ify.a;
                ify.a(this);
                kVar = this.K;
                if (kVar == null) {
                }
                chatFragment = ChatFragment.this;
                ChatFragment.d dVar222 = ChatFragment.w1;
                if (chatFragment.mo().l()) {
                }
                RichEditText richEditText2222 = this.B;
                this.T.a(richEditText2222 != null ? richEditText2222 : null);
                return;
            case 4:
                c1798c = new b.c.a.C1797b(userId);
                cVar = c1798c;
                stickersView = this.C;
                if (stickersView == null) {
                }
                stickersView.setStickersKeyboardContext(cVar);
                lz30 lz30Var2222 = new lz30(this);
                stickersView2 = this.C;
                if (stickersView2 == null) {
                }
                stickersView2.setListener(lz30Var2222);
                writeBar = this.t;
                if (writeBar == null) {
                }
                writeBar.setAutoSuggestPopupListener(lz30Var2222);
                writeBar2 = this.t;
                if (writeBar2 == null) {
                }
                int i32222 = 3;
                writeBar2.setCanPinAttachmentProvider(new ag20(this, i32222));
                writeBar3 = this.t;
                if (writeBar3 == null) {
                }
                writeBar3.setWriteBarSendListener(new tsu(this));
                writeBar4 = this.t;
                if (writeBar4 == null) {
                }
                writeBar4.setTemplatesButtonClick(new q130(this, i32222));
                writeBar5 = this.t;
                if (writeBar5 == null) {
                }
                writeBar5.setWriteBarAttachesListener(new vob(this));
                writeBar6 = this.t;
                if (writeBar6 == null) {
                }
                int i42222 = 27;
                writeBar6.setOnBotKeyboardButtonClick(new kdn(this, i42222));
                writeBar7 = this.t;
                if (writeBar7 == null) {
                }
                writeBar7.setWriteBarInputListener(new com.vk.movika.sdk.base.data.converter.c(this));
                writeBar8 = this.t;
                if (writeBar8 == null) {
                }
                writeBar8.setWriteBarReplyMessageListener(new kf3(this, i42222));
                writeBar9 = this.t;
                if (writeBar9 == null) {
                }
                writeBar9.setWriteBarStickersListener(new eml(this));
                writeBar10 = this.t;
                if (writeBar10 == null) {
                }
                writeBar10.setWriteBarMediaListener(new yxu(this));
                int i52222 = ify.a;
                ify.a(this);
                kVar = this.K;
                if (kVar == null) {
                }
                chatFragment = ChatFragment.this;
                ChatFragment.d dVar2222 = ChatFragment.w1;
                if (chatFragment.mo().l()) {
                }
                RichEditText richEditText22222 = this.B;
                this.T.a(richEditText22222 != null ? richEditText22222 : null);
                return;
            case 5:
                cVar = b.c.C1799b.a;
                stickersView = this.C;
                if (stickersView == null) {
                }
                stickersView.setStickersKeyboardContext(cVar);
                lz30 lz30Var22222 = new lz30(this);
                stickersView2 = this.C;
                if (stickersView2 == null) {
                }
                stickersView2.setListener(lz30Var22222);
                writeBar = this.t;
                if (writeBar == null) {
                }
                writeBar.setAutoSuggestPopupListener(lz30Var22222);
                writeBar2 = this.t;
                if (writeBar2 == null) {
                }
                int i322222 = 3;
                writeBar2.setCanPinAttachmentProvider(new ag20(this, i322222));
                writeBar3 = this.t;
                if (writeBar3 == null) {
                }
                writeBar3.setWriteBarSendListener(new tsu(this));
                writeBar4 = this.t;
                if (writeBar4 == null) {
                }
                writeBar4.setTemplatesButtonClick(new q130(this, i322222));
                writeBar5 = this.t;
                if (writeBar5 == null) {
                }
                writeBar5.setWriteBarAttachesListener(new vob(this));
                writeBar6 = this.t;
                if (writeBar6 == null) {
                }
                int i422222 = 27;
                writeBar6.setOnBotKeyboardButtonClick(new kdn(this, i422222));
                writeBar7 = this.t;
                if (writeBar7 == null) {
                }
                writeBar7.setWriteBarInputListener(new com.vk.movika.sdk.base.data.converter.c(this));
                writeBar8 = this.t;
                if (writeBar8 == null) {
                }
                writeBar8.setWriteBarReplyMessageListener(new kf3(this, i422222));
                writeBar9 = this.t;
                if (writeBar9 == null) {
                }
                writeBar9.setWriteBarStickersListener(new eml(this));
                writeBar10 = this.t;
                if (writeBar10 == null) {
                }
                writeBar10.setWriteBarMediaListener(new yxu(this));
                int i522222 = ify.a;
                ify.a(this);
                kVar = this.K;
                if (kVar == null) {
                }
                chatFragment = ChatFragment.this;
                ChatFragment.d dVar22222 = ChatFragment.w1;
                if (chatFragment.mo().l()) {
                }
                RichEditText richEditText222222 = this.B;
                this.T.a(richEditText222222 != null ? richEditText222222 : null);
                return;
            case 6:
                cVar = b.c.C1799b.a;
                stickersView = this.C;
                if (stickersView == null) {
                }
                stickersView.setStickersKeyboardContext(cVar);
                lz30 lz30Var222222 = new lz30(this);
                stickersView2 = this.C;
                if (stickersView2 == null) {
                }
                stickersView2.setListener(lz30Var222222);
                writeBar = this.t;
                if (writeBar == null) {
                }
                writeBar.setAutoSuggestPopupListener(lz30Var222222);
                writeBar2 = this.t;
                if (writeBar2 == null) {
                }
                int i3222222 = 3;
                writeBar2.setCanPinAttachmentProvider(new ag20(this, i3222222));
                writeBar3 = this.t;
                if (writeBar3 == null) {
                }
                writeBar3.setWriteBarSendListener(new tsu(this));
                writeBar4 = this.t;
                if (writeBar4 == null) {
                }
                writeBar4.setTemplatesButtonClick(new q130(this, i3222222));
                writeBar5 = this.t;
                if (writeBar5 == null) {
                }
                writeBar5.setWriteBarAttachesListener(new vob(this));
                writeBar6 = this.t;
                if (writeBar6 == null) {
                }
                int i4222222 = 27;
                writeBar6.setOnBotKeyboardButtonClick(new kdn(this, i4222222));
                writeBar7 = this.t;
                if (writeBar7 == null) {
                }
                writeBar7.setWriteBarInputListener(new com.vk.movika.sdk.base.data.converter.c(this));
                writeBar8 = this.t;
                if (writeBar8 == null) {
                }
                writeBar8.setWriteBarReplyMessageListener(new kf3(this, i4222222));
                writeBar9 = this.t;
                if (writeBar9 == null) {
                }
                writeBar9.setWriteBarStickersListener(new eml(this));
                writeBar10 = this.t;
                if (writeBar10 == null) {
                }
                writeBar10.setWriteBarMediaListener(new yxu(this));
                int i5222222 = ify.a;
                ify.a(this);
                kVar = this.K;
                if (kVar == null) {
                }
                chatFragment = ChatFragment.this;
                ChatFragment.d dVar222222 = ChatFragment.w1;
                if (chatFragment.mo().l()) {
                }
                RichEditText richEditText2222222 = this.B;
                this.T.a(richEditText2222222 != null ? richEditText2222222 : null);
                return;
            case 7:
                cVar = b.c.C1799b.a;
                stickersView = this.C;
                if (stickersView == null) {
                }
                stickersView.setStickersKeyboardContext(cVar);
                lz30 lz30Var2222222 = new lz30(this);
                stickersView2 = this.C;
                if (stickersView2 == null) {
                }
                stickersView2.setListener(lz30Var2222222);
                writeBar = this.t;
                if (writeBar == null) {
                }
                writeBar.setAutoSuggestPopupListener(lz30Var2222222);
                writeBar2 = this.t;
                if (writeBar2 == null) {
                }
                int i32222222 = 3;
                writeBar2.setCanPinAttachmentProvider(new ag20(this, i32222222));
                writeBar3 = this.t;
                if (writeBar3 == null) {
                }
                writeBar3.setWriteBarSendListener(new tsu(this));
                writeBar4 = this.t;
                if (writeBar4 == null) {
                }
                writeBar4.setTemplatesButtonClick(new q130(this, i32222222));
                writeBar5 = this.t;
                if (writeBar5 == null) {
                }
                writeBar5.setWriteBarAttachesListener(new vob(this));
                writeBar6 = this.t;
                if (writeBar6 == null) {
                }
                int i42222222 = 27;
                writeBar6.setOnBotKeyboardButtonClick(new kdn(this, i42222222));
                writeBar7 = this.t;
                if (writeBar7 == null) {
                }
                writeBar7.setWriteBarInputListener(new com.vk.movika.sdk.base.data.converter.c(this));
                writeBar8 = this.t;
                if (writeBar8 == null) {
                }
                writeBar8.setWriteBarReplyMessageListener(new kf3(this, i42222222));
                writeBar9 = this.t;
                if (writeBar9 == null) {
                }
                writeBar9.setWriteBarStickersListener(new eml(this));
                writeBar10 = this.t;
                if (writeBar10 == null) {
                }
                writeBar10.setWriteBarMediaListener(new yxu(this));
                int i52222222 = ify.a;
                ify.a(this);
                kVar = this.K;
                if (kVar == null) {
                }
                chatFragment = ChatFragment.this;
                ChatFragment.d dVar2222222 = ChatFragment.w1;
                if (chatFragment.mo().l()) {
                }
                RichEditText richEditText22222222 = this.B;
                this.T.a(richEditText22222222 != null ? richEditText22222222 : null);
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean Q(izs<? super MsgType, s3q0> izsVar) {
        if (this.j != null) {
            return false;
        }
        Dialog Cb = this.k.Cb();
        if (Cb != null && Cb.sc()) {
            return false;
        }
        WriteBar writeBar = this.t;
        if (writeBar == null) {
            writeBar = null;
        }
        MsgFromUser replyMessage = writeBar.getReplyMessage();
        boolean Lb = replyMessage != null ? replyMessage.Lb() : true;
        this.c.getClass();
        e140 e140Var = (e140) this.P.getValue();
        View view = this.y;
        e140Var.b(view != null ? view : null, Lb, this.g.f(R.attr.vk_ui_text_accent), izsVar);
        return true;
    }

    public final void R() {
        WriteBar writeBar = this.t;
        if (writeBar == null) {
            writeBar = null;
        }
        if (writeBar.getAttachments().isEmpty()) {
            WriteBar writeBar2 = this.t;
            if ((writeBar2 != null ? writeBar2 : null).getText().length() > 0) {
                return;
            }
            this.r = true;
            io.reactivex.rxjava3.internal.operators.single.b0 E = this.b.E(this, new vqm(this.e));
            asu0 asu0Var = asu0.a;
            io.reactivex.rxjava3.internal.operators.single.b0 m = E.q(asu0Var.c()).m(asu0Var.d());
            pv2 pv2Var = new pv2(new j4x(this, 16), 28);
            int i2 = kwg0.a;
            this.o.b(m.subscribe(pv2Var, new jwg0("")));
        }
    }

    public final void T(MsgSendSource.b bVar) {
        String str;
        ChatSettings Hb;
        BotButton botButton = bVar.a;
        if (botButton instanceof BotButton.Text) {
            ChatFragment.k kVar = this.K;
            if (kVar == null) {
                kVar = null;
            }
            BotButton.Text text = (BotButton.Text) botButton;
            oz30.c(kVar, 0, text.j, null, text.h, null, null, bVar, null, null, 437);
            return;
        }
        if (botButton instanceof BotButton.Link) {
            U(bVar);
            return;
        }
        boolean z = botButton instanceof BotButton.VkPay;
        mxv mxvVar = this.c;
        Activity activity = this.i;
        e38 e38Var = this.p;
        if (z) {
            e38Var.a(this.e, bVar);
            mxvVar.k();
            hf3.f(activity, ((BotButton.VkPay) botButton).j);
            return;
        }
        if (botButton instanceof BotButton.VkApps) {
            e38Var.a(this.e, bVar);
            BotButton.VkApps vkApps = (BotButton.VkApps) botButton;
            iwv.f(mxvVar.k(), this.i, vkApps.j, vkApps.l, "bot_keyboard", vkApps.k, null, 32);
            return;
        }
        if (botButton instanceof BotButton.Location) {
            tha0 tha0Var = new tha0(activity, mxvVar, this.d, this.g);
            tha0Var.m = new i();
            tha0Var.Y0(((BotButton.Location) botButton).h, bVar);
            return;
        }
        if (botButton instanceof BotButton.Callback) {
            this.b.D(this, new q28(bVar.a()));
            return;
        }
        if (!(botButton instanceof BotButton.ModalView)) {
            if (!(botButton instanceof BotButton.Unsupported)) {
                throw new NoWhenBranchMatchedException();
            }
            enj.q(R.string.unavailable, 0, activity);
        } else {
            if (!mbw.a.a()) {
                U(bVar);
                return;
            }
            e38Var.a(this.e, bVar);
            Dialog Cb = this.k.Cb();
            if (Cb == null || (Hb = Cb.Hb()) == null || (str = Hb.b) == null) {
                str = "";
            }
            new kix0(activity, str, ((BotButton.ModalView) botButton).k).a();
        }
    }

    public final void U(MsgSendSource.b bVar) {
        String str;
        BotButton botButton = bVar.a;
        if (botButton instanceof BotButton.Link) {
            str = ((BotButton.Link) botButton).k;
        } else if (!(botButton instanceof BotButton.ModalView)) {
            return;
        } else {
            str = ((BotButton.ModalView) botButton).k;
        }
        this.p.a(this.e, bVar);
        this.c.k().b(this.d.B(), str);
    }

    public final boolean V(Attachment attachment, ly30 ly30Var) {
        if (!(attachment instanceof StickerAttachment) && !(attachment instanceof PendingGraffitiAttachment) && !(attachment instanceof PendingStoryAttachment) && !(attachment instanceof GraffitiAttachment) && !(attachment instanceof PendingAudioMessageAttachment)) {
            return false;
        }
        Attach b2 = ca3.b(attachment);
        if (b2 != null) {
            WriteBar writeBar = this.t;
            if (writeBar == null) {
                writeBar = null;
            }
            MsgFromUser replyMessage = writeBar.getReplyMessage();
            Integer valueOf = replyMessage != null ? Integer.valueOf(replyMessage.d) : null;
            ChatFragment.k kVar = this.K;
            oz30.c(kVar == null ? null : kVar, 0, null, null, null, Collections.singletonList(b2), valueOf, null, null, ly30Var, 207);
            WriteBar writeBar2 = this.t;
            if (writeBar2 == null) {
                writeBar2 = null;
            }
            writeBar2.L();
        }
        WriteBar writeBar3 = this.t;
        (writeBar3 != null ? writeBar3 : null).K();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0244  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W(ly30 ly30Var) {
        c9s c9sVar;
        Object obj;
        boolean z;
        AttachVideoMsg D6;
        AttachAudioMsg a7;
        int i2;
        String obj2;
        WriteBar writeBar = this.t;
        if (writeBar == null) {
            writeBar = null;
        }
        ArrayList<Attachment> attachments = writeBar.getAttachments();
        RichEditText richEditText = this.B;
        if (richEditText == null) {
            richEditText = null;
        }
        Editable editableText = richEditText.getEditableText();
        String str = "";
        if (editableText == null || editableText.length() == 0) {
            c9sVar = new c9s("", MsgTextFormat.d);
        } else {
            bpn0 bpn0Var = yh30.a;
            CharSequence a2 = yh30.a(drm0.p0(editableText));
            Editable editable = a2 instanceof Editable ? (Editable) a2 : null;
            MsgTextFormat b2 = this.T.b(editable);
            if (editable != null && (obj2 = editable.toString()) != null) {
                str = obj2;
            }
            c9sVar = new c9s(str, b2);
        }
        String obj3 = c9sVar.a.toString();
        List B = rli0.B(rli0.m(new ulp0(rli0.j(new i5g(attachments), new wh1(24)), new juz(3))));
        int i3 = 2;
        Set C = rli0.C(new ulp0(rli0.p(rli0.j(new i5g(attachments), new bws(i3)), new f1s(this, 10)), new am0(17)));
        WriteBar writeBar2 = this.t;
        if (writeBar2 == null) {
            writeBar2 = null;
        }
        MsgFromUser replyMessage = writeBar2.getReplyMessage();
        Integer valueOf = replyMessage != null ? Integer.valueOf(replyMessage.d) : null;
        hfr.a aVar = new hfr.a(rli0.j(new i5g(attachments), new jz30(0)));
        while (aVar.hasNext()) {
            Attachment attachment = (Attachment) aVar.next();
            ChatFragment.k kVar = this.K;
            if (kVar == null) {
                kVar = null;
            }
            Attach b3 = ca3.b(attachment);
            kVar.getClass();
            if (b3 instanceof AttachMarket) {
                com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
                el3 el3Var = Event.b;
                Event.a b4 = h5s.b("market_contact");
                StringBuilder sb = new StringBuilder();
                AttachMarket attachMarket = (AttachMarket) b3;
                sb.append(attachMarket.d);
                sb.append('_');
                i2 = i3;
                sb.append(attachMarket.e);
                b4.c("item_id", sb.toString());
                b4.c("action", "write");
                b4.i("StatlogTracker");
                bVar.k(b4.e());
            } else {
                i2 = i3;
            }
            i3 = i2;
        }
        int i4 = i3;
        c cVar = this.n;
        c cVar2 = c.EDITING;
        MsgTextFormat msgTextFormat = c9sVar.b;
        if (cVar == cVar2) {
            if (drm0.p0(obj3).toString().length() == 0) {
                if (!((ArrayList) B).isEmpty() && !B.isEmpty()) {
                    Iterator it = B.iterator();
                    while (it.hasNext()) {
                        if (!(((Attach) it.next()) instanceof AttachQuestion)) {
                            break;
                        }
                    }
                }
                if (C.isEmpty()) {
                    ChatFragment.k kVar2 = this.K;
                    if (kVar2 == null) {
                        kVar2 = null;
                    }
                    MsgFromUser msgFromUser = this.j;
                    v3n v3nVar = new v3n(this, 18);
                    if (msgFromUser == null) {
                        kVar2.getClass();
                        return;
                    }
                    com.vk.im.ui.components.msg_list.a aVar2 = ChatFragment.this.H0;
                    com.vk.im.ui.components.msg_list.a aVar3 = aVar2 != null ? aVar2 : null;
                    vm30 vm30Var = aVar3.o;
                    if (vm30Var != null) {
                        boolean z1 = aVar3.z1(Collections.singletonList(msgFromUser));
                        l5v0 l5v0Var = aVar3.O0.e;
                        vm30Var.e0.e(new ki30(1, vm30Var.q, z1, ((Boolean) l5v0Var.i.getValue(l5v0Var, l5v0.s[i4])).booleanValue()), new z63(vm30Var, msgFromUser, v3nVar, 7));
                        return;
                    }
                    return;
                }
            }
            MsgFromUser msgFromUser2 = this.j;
            Set C2 = rli0.C(new ulp0(rli0.j(new i5g(msgFromUser2.I), new z410(6)), new j0r(9)));
            Iterator<T> it2 = msgFromUser2.I.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it2.next();
                    if (((NestedMsg) obj).b == NestedMsg.Type.REPLY) {
                        break;
                    }
                }
            }
            NestedMsg nestedMsg = (NestedMsg) obj;
            Integer valueOf2 = nestedMsg != null ? Integer.valueOf(nestedMsg.d) : null;
            if (epx.f(msgFromUser2.F, obj3) && epx.f(msgFromUser2.G, msgTextFormat)) {
                List<? extends Attachment> list = this.b0;
                WriteBar writeBar3 = this.t;
                if (writeBar3 == null) {
                    writeBar3 = null;
                }
                if (epx.f(list, j5g.O0(writeBar3.getAttachments())) && epx.f(C, C2) && epx.f(valueOf, valueOf2)) {
                    z = true;
                    this.b0 = EmptyList.b;
                    if (!z) {
                        D();
                        return;
                    }
                    MsgFromUser msgFromUser3 = this.j;
                    if (msgFromUser3 != null && (a7 = msgFromUser3.a7()) != null) {
                        ((ArrayList) B).add(a7);
                    }
                    MsgFromUser msgFromUser4 = this.j;
                    if (msgFromUser4 != null && (D6 = msgFromUser4.D6()) != null) {
                        ((ArrayList) B).add(D6);
                    }
                }
            }
            z = false;
            this.b0 = EmptyList.b;
            if (!z) {
            }
        }
        y();
        ChatFragment.k kVar3 = this.K;
        ChatFragment.k kVar4 = kVar3 == null ? null : kVar3;
        MsgFromUser msgFromUser5 = this.j;
        oz30.c(kVar4, msgFromUser5 != null ? msgFromUser5.b : 0, obj3, msgTextFormat, null, B, valueOf, null, C, ly30Var, 72);
        S(this, null, 1);
        D();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cc  */
    /* JADX WARN: Type inference failed for: r7v20, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X(Dialog dialog) {
        Integer num;
        WriteBarDisabled writeBarDisabled;
        WriteBarDisabled writeBarDisabled2;
        WritePermission oc;
        TransitionData jc;
        WritePermission oc2;
        WritePermission.State state = (dialog == null || (oc2 = dialog.oc()) == null) ? null : oc2.a;
        int i2 = state == null ? -1 : d.$EnumSwitchMapping$2[state.ordinal()];
        if (i2 != 1 && i2 != 2 && i2 != 3) {
            if (i2 != 4) {
                num = Integer.valueOf(R.drawable.vk_icon_error_circle_outline_32);
                writeBarDisabled = this.v;
                if (writeBarDisabled == null) {
                    writeBarDisabled = null;
                }
                String I = I();
                Dialog Cb = this.k.Cb();
                WritePermission.State state2 = (Cb != null || (oc = Cb.oc()) == null) ? null : oc.a;
                writeBarDisabled.b(I, num, (state2 != null ? d.$EnumSwitchMapping$2[state2.ordinal()] : -1) != 3 ? WriteBarDisabled.Reason.INFO : WriteBarDisabled.Reason.WARNING);
                writeBarDisabled2 = this.v;
                if (writeBarDisabled2 == null) {
                    writeBarDisabled2 = null;
                }
                writeBarDisabled2.setOnClickListener(null);
            }
            if (this.x == null) {
                View view = this.u;
                if (view == null) {
                    view = null;
                }
                WriteBarDisabledMoveToMaxBanner writeBarDisabledMoveToMaxBanner = (WriteBarDisabledMoveToMaxBanner) ((ViewStub) view.findViewById(R.id.write_bar_disabled_max_stub)).inflate();
                this.x = writeBarDisabledMoveToMaxBanner;
                if (writeBarDisabledMoveToMaxBanner != null) {
                    writeBarDisabledMoveToMaxBanner.setActionBridge(this.c.k());
                }
                WriteBarDisabledMoveToMaxBanner writeBarDisabledMoveToMaxBanner2 = this.x;
                if (writeBarDisabledMoveToMaxBanner2 != null) {
                    writeBarDisabledMoveToMaxBanner2.setScreen(WriteBarDisabledMoveToMaxBanner.Screen.CHAT);
                }
            }
            WriteBarDisabledMoveToMaxBanner writeBarDisabledMoveToMaxBanner3 = this.x;
            if (writeBarDisabledMoveToMaxBanner3 != null) {
                Dialog Cb2 = this.k.Cb();
                writeBarDisabledMoveToMaxBanner3.setLink((Cb2 == null || (jc = Cb2.jc()) == null) ? null : jc.c);
            }
            WriteBarDisabledMoveToMaxBanner writeBarDisabledMoveToMaxBanner4 = this.x;
            if (writeBarDisabledMoveToMaxBanner4 != null) {
                writeBarDisabledMoveToMaxBanner4.setVisibility(0);
            }
            WriteBarDisabled writeBarDisabled3 = this.v;
            if (writeBarDisabled3 == null) {
                writeBarDisabled3 = null;
            }
            writeBarDisabled3.setVisibility(8);
            WriteBar writeBar = this.t;
            if (writeBar == null) {
                writeBar = null;
            }
            writeBar.setVisibility(8);
            xew xewVar = this.w;
            if (xewVar == null) {
                xewVar = null;
            }
            bwt0.p0((VkCell) xewVar.a.getValue(), false);
        }
        num = null;
        writeBarDisabled = this.v;
        if (writeBarDisabled == null) {
        }
        String I2 = I();
        Dialog Cb3 = this.k.Cb();
        if (Cb3 != null) {
        }
        writeBarDisabled.b(I2, num, (state2 != null ? d.$EnumSwitchMapping$2[state2.ordinal()] : -1) != 3 ? WriteBarDisabled.Reason.INFO : WriteBarDisabled.Reason.WARNING);
        writeBarDisabled2 = this.v;
        if (writeBarDisabled2 == null) {
        }
        writeBarDisabled2.setOnClickListener(null);
    }

    public final void Y(MsgFromUser msgFromUser) {
        String str;
        AttachWithTranscription bc = msgFromUser.bc();
        j0(c.EDITING);
        WriteBar writeBar = this.t;
        if (writeBar == null) {
            writeBar = null;
        }
        writeBar.setAddAttachAllowed(false);
        WriteBar writeBar2 = this.t;
        if (writeBar2 == null) {
            writeBar2 = null;
        }
        writeBar2.setEmojiAllowed(false);
        WriteBar writeBar3 = this.t;
        if (writeBar3 == null) {
            writeBar3 = null;
        }
        if (bc == null || (str = bc.Y4()) == null) {
            str = "";
        }
        writeBar3.setText(str);
        RichEditText richEditText = this.B;
        if (richEditText == null) {
            richEditText = null;
        }
        richEditText.requestFocus();
        RichEditText richEditText2 = this.B;
        RichEditText richEditText3 = richEditText2 == null ? null : richEditText2;
        if (richEditText2 == null) {
            richEditText2 = null;
        }
        Editable text = richEditText2.getText();
        richEditText3.setSelection(text != null ? text.length() : 0);
        RichEditText richEditText4 = this.B;
        if (richEditText4 == null) {
            richEditText4 = null;
        }
        mhy.j(richEditText4);
        ChatFragment.k kVar = this.K;
        (kVar != null ? kVar : null).i(this.j);
    }

    @Override // xsna.ify.a
    public final void Y0() {
        xgy xgyVar;
        if (!this.S || (xgyVar = this.N) == null) {
            return;
        }
        int i2 = xgy.F;
        xgyVar.h(null);
        ChatFragment.k kVar = this.K;
        (kVar != null ? kVar : null).e(xgyVar.f.getHeight());
    }

    public final void Z(CharSequence charSequence, ArrayList arrayList, ArrayList arrayList2, MsgFromUser msgFromUser, ProfilesSimpleInfo profilesSimpleInfo) {
        j0(c.EDITING);
        WriteBar writeBar = this.t;
        if (writeBar == null) {
            writeBar = null;
        }
        writeBar.setText(charSequence);
        RichEditText richEditText = this.B;
        if (richEditText == null) {
            richEditText = null;
        }
        richEditText.requestFocus();
        RichEditText richEditText2 = this.B;
        RichEditText richEditText3 = richEditText2 == null ? null : richEditText2;
        if (richEditText2 == null) {
            richEditText2 = null;
        }
        Editable text = richEditText2.getText();
        richEditText3.setSelection(text != null ? text.length() : 0);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Attachment attachment = (Attachment) it.next();
            WriteBar writeBar2 = this.t;
            if (writeBar2 == null) {
                writeBar2 = null;
            }
            writeBar2.A1(attachment);
        }
        this.b0 = arrayList;
        if (!arrayList2.isEmpty()) {
            WriteBar writeBar3 = this.t;
            if (writeBar3 == null) {
                writeBar3 = null;
            }
            writeBar3.x(arrayList2);
        }
        if (msgFromUser != null && profilesSimpleInfo != null) {
            WriteBar writeBar4 = this.t;
            if (writeBar4 == null) {
                writeBar4 = null;
            }
            writeBar4.Y(msgFromUser, profilesSimpleInfo, cdi.A(this.m, msgFromUser), true);
        }
        RichEditText richEditText4 = this.B;
        if (richEditText4 == null) {
            richEditText4 = null;
        }
        mhy.j(richEditText4);
        ChatFragment.k kVar = this.K;
        (kVar != null ? kVar : null).i(this.j);
    }

    @Override // xsna.rnv
    public final void a(MsgSendSource.b bVar) {
        T(bVar);
    }

    @Override // xsna.rnv
    public final boolean a0() {
        WriteBar writeBar = this.t;
        if (writeBar == null) {
            writeBar = null;
        }
        writeBar.n(false);
        return K(this.L) || K(this.N) || M(this.M);
    }

    @Override // xsna.rnv
    public final void b(Bundle bundle) {
        n34.w(bundle, this.k, null);
        bundle.putParcelableArrayList("users", new ArrayList<>(this.l));
        if (this.n != c.EDITING) {
            return;
        }
        WriteBar writeBar = this.t;
        if (writeBar == null) {
            writeBar = null;
        }
        ArrayList E = g5g.E(writeBar.getAttachments(), FwdMessagesAttachment.class);
        ArrayList arrayList = new ArrayList();
        Iterator it = E.iterator();
        while (it.hasNext()) {
            g5g.y(b0((FwdMessagesAttachment) it.next()), arrayList);
        }
        bundle.putParcelableArrayList("fwd_messages", new ArrayList<>(arrayList));
        bundle.putParcelable("edit_msg_id", this.j);
        WriteBar writeBar2 = this.t;
        if (writeBar2 == null) {
            writeBar2 = null;
        }
        bundle.putString("body", writeBar2.getText().toString());
        WriteBar writeBar3 = this.t;
        if (writeBar3 == null) {
            writeBar3 = null;
        }
        bundle.putParcelableArrayList("attachments", writeBar3.getAttachments());
        WriteBar writeBar4 = this.t;
        if (writeBar4 == null) {
            writeBar4 = null;
        }
        ArrayList<Attachment> attachments = writeBar4.getAttachments();
        ArrayList arrayList2 = new ArrayList(c5g.u(attachments, 10));
        Iterator<T> it2 = attachments.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf(((Attachment) it2.next()).c));
        }
        bundle.putIntegerArrayList("attachments_ids", new ArrayList<>(arrayList2));
        WriteBar writeBar5 = this.t;
        if (writeBar5 == null) {
            writeBar5 = null;
        }
        bundle.putParcelable("reply_msg", writeBar5.getReplyMessage());
        WriteBar writeBar6 = this.t;
        if (writeBar6 == null) {
            writeBar6 = null;
        }
        bundle.putParcelable("profiles", writeBar6.getReplyMsgMembers());
        p040 p040Var = this.T;
        RichEditText richEditText = this.B;
        bundle.putParcelable("body_format", p040Var.b((richEditText != null ? richEditText : null).getEditableText()));
    }

    @Override // xsna.xey.a
    public final void c() {
        View view = this.A;
        if (view == null) {
            view = null;
        }
        view.setClickable(false);
        View view2 = this.z;
        (view2 != null ? view2 : null).setClickable(false);
    }

    @Override // xsna.xey.a
    public final void d() {
        this.a0 = false;
        View view = this.D;
        if (view == null) {
            view = null;
        }
        view.setVisibility(8);
        ChatFragment.k kVar = this.K;
        if (kVar == null) {
            kVar = null;
        }
        kVar.j(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        View view2 = this.A;
        if (view2 == null) {
            view2 = null;
        }
        view2.setClickable(true);
        View view3 = this.z;
        (view3 != null ? view3 : null).setClickable(true);
    }

    @Override // xsna.xey.a
    public final void e() {
        xgy.a aVar;
        if (this.a0) {
            return;
        }
        if (this.S) {
            ChatFragment.k kVar = this.K;
            if (kVar == null) {
                kVar = null;
            }
            xgy xgyVar = this.N;
            kVar.j((xgyVar == null || (aVar = xgyVar.f) == null) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : aVar.getHeight());
        }
        View view = this.D;
        (view != null ? view : null).setVisibility(0);
    }

    public final boolean f() {
        BotKeyboard V2;
        ArrayList arrayList;
        if (this.n != c.NORMAL) {
            return false;
        }
        RichEditText richEditText = this.B;
        if (richEditText == null) {
            richEditText = null;
        }
        Editable text = richEditText.getText();
        if (text != null && text.length() != 0) {
            return false;
        }
        d38 G = G();
        Dialog Cb = this.k.Cb();
        G.getClass();
        return Cb != null && Cb.Gb() && (V2 = Cb.V2()) != null && (arrayList = V2.g) != null && (arrayList.isEmpty() ^ true) && this.q;
    }

    @Override // xsna.rnv
    public final void g(Bundle bundle) {
        if (bundle.containsKey("dialog_ext_state")) {
            Bundle bundle2 = bundle.getBundle("dialog_ext_state");
            Peer peer = (Peer) bundle2.getParcelable("dialog_id");
            long j = peer != null ? peer.b : 0L;
            DialogExt dialogExt = (DialogExt) com.vk.core.util.state.a.b(DialogExt.class, bundle2, bundle2.getString("dialog_ext_state_key"));
            if (dialogExt == null) {
                dialogExt = new DialogExt(j, (ProfilesInfo) null, 2, (zcl) null);
            }
            this.k = dialogExt;
            this.l = new HashSet(bundle.getParcelableArrayList("users"));
            if (bundle.get("edit_msg_id") == null) {
                return;
            }
            this.j = (MsgFromUser) bundle.getParcelable("edit_msg_id");
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("attachments");
            if (parcelableArrayList == null) {
                return;
            }
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("attachments_ids");
            int size = parcelableArrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((Attachment) parcelableArrayList.get(i2)).c = (integerArrayList != null ? integerArrayList.get(i2) : null).intValue();
            }
            MsgFromUser msgFromUser = this.j;
            if (msgFromUser == null) {
                return;
            }
            if (msgFromUser.da()) {
                Y(msgFromUser);
                return;
            }
            cvk cvkVar = s420.a;
            CharSequence a2 = s420.a(bundle.getString("body"));
            MsgTextFormat msgTextFormat = (MsgTextFormat) bundle.getParcelable("body_format");
            if (msgTextFormat == null) {
                msgTextFormat = MsgTextFormat.d;
            }
            Z(this.U.a(a2, msgTextFormat), parcelableArrayList, bundle.getParcelableArrayList("fwd_messages"), (MsgFromUser) bundle.getParcelable("reply_msg"), (ProfilesSimpleInfo) bundle.getParcelable("profiles"));
        }
    }

    @Override // xsna.rnv
    public final String getText() {
        RichEditText richEditText = this.B;
        if (richEditText == null) {
            richEditText = null;
        }
        return String.valueOf(richEditText.getText());
    }

    @Override // xsna.rnv
    public final void h(MsgSendHidePopupsReason msgSendHidePopupsReason) {
        K(this.L);
        M(this.M);
        if (msgSendHidePopupsReason != MsgSendHidePopupsReason.SCROLL) {
            this.S = false;
            K(this.N);
        }
        WriteBar writeBar = this.t;
        if (writeBar == null) {
            writeBar = null;
        }
        writeBar.n(false);
    }

    @Override // xsna.rnv
    public final void i(List<e0l0> list) {
        this.m = list;
    }

    @Override // xsna.rnv
    public final void j(boolean z) {
        this.q = z;
        Dialog Cb = this.k.Cb();
        if (Cb != null) {
            boolean f2 = f();
            WriteBar writeBar = this.t;
            if (writeBar == null) {
                writeBar = null;
            }
            writeBar.setBotKeyboardAllowed(f2);
            if (f2 && Cb.Tb()) {
                nz30 nz30Var = nz30.b;
                this.R.removeCallbacksAndMessages(f0);
                nz30Var.invoke(H());
                K(this.L);
                M(this.M);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:325:0x0478, code lost:
    
        if (r1.t1() == true) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x0482, code lost:
    
        if (r1.E8() == r5) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0484, code lost:
    
        if (r3 == false) goto L406;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0486, code lost:
    
        r3 = r18.v;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0488, code lost:
    
        if (r3 != null) goto L372;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x048a, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x048b, code lost:
    
        r3.setVisibility(8);
        r3 = r18.x;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0490, code lost:
    
        if (r3 == null) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0492, code lost:
    
        r3.setVisibility(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0495, code lost:
    
        r3 = r18.w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x0497, code lost:
    
        if (r3 != null) goto L378;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x0499, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x049a, code lost:
    
        r4 = r18.k;
        r3.getClass();
        r3 = r3.a;
        r5 = r4.b.Bb(r4.f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x04ab, code lost:
    
        if ((r5 instanceof com.vk.im.engine.models.users.User) == false) goto L381;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x04ad, code lost:
    
        r5 = (com.vk.im.engine.models.users.User) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x04b1, code lost:
    
        if (r5 == null) goto L394;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x04b5, code lost:
    
        if (r5.z != 3) goto L387;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x04b7, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x04bc, code lost:
    
        if (r2 != true) goto L394;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x04be, code lost:
    
        r2 = r4.Cb();
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x04c2, code lost:
    
        if (r2 == null) goto L394;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x04c8, code lost:
    
        if (r2.Pb() != true) goto L394;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x04ca, code lost:
    
        xsna.bwt0.p0((com.vk.core.view.components.cell.VkCell) r3.getValue(), true);
        ((com.vk.core.view.components.cell.VkCell) r3.getValue()).setLeft(new com.vk.core.view.components.cell.VkCell.Left.b(new com.vk.core.view.components.cell.VkCell.Left.Main.c(new xsna.gko(com.vkontakte.android.R.drawable.vk_icon_error_circle_outline_24), com.vk.core.view.components.cell.VkCell.Left.Main.Size.Small, new xsna.k1u0.a(new xsna.x7g(com.vkontakte.android.R.attr.vk_ui_icon_warning)), r6), null));
        ((com.vk.core.view.components.cell.VkCell) r3.getValue()).setMiddle(new com.vk.core.view.components.cell.VkCell.Middle.b(new com.vk.core.view.components.cell.VkCell.Middle.e(xsna.tq.h(xsna.tlo0.Companion, com.vkontakte.android.R.string.vkim_msg_write_disabled_cell_receiver_privacy_settings), 0, (android.text.TextUtils.TruncateAt) null, (com.vk.core.view.components.cell.VkCell.Middle.e.b) null, (com.vk.core.view.components.cell.VkCell.Middle.e.b) null, 62), (com.vk.core.view.components.cell.VkCell.Middle.d) null, (com.vk.core.view.components.cell.VkCell.Middle.c) null, (com.vk.core.view.components.cell.VkCell.Middle.Size) (0 == true ? 1 : 0), 14));
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x04ba, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x0525, code lost:
    
        xsna.bwt0.p0((com.vk.core.view.components.cell.VkCell) r3.getValue(), false);
        r2 = com.vk.toggle.features.ImFeatures.CHAT_FOOTER_BAN_VISIBILITY;
        r2.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x053b, code lost:
    
        if (com.vk.toggle.b.A.a(r2) != false) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x053d, code lost:
    
        r2 = r4.Cb();
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0541, code lost:
    
        if (r2 == null) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x0548, code lost:
    
        if (r2.Pb() != true) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x054a, code lost:
    
        r2 = r18.v;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x054c, code lost:
    
        if (r2 != null) goto L404;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x054e, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x0553, code lost:
    
        r8.setVisibility(0);
        X(r1);
        r1 = xsna.s3q0.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x0551, code lost:
    
        r8 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x04b0, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0218 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0227 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0236 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02e4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0154 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0190 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r3v32, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j0(c cVar) {
        boolean z;
        Dialog Cb;
        boolean z2;
        boolean z3;
        WriteBar writeBar;
        WriteBar writeBar2;
        WriteBar writeBar3;
        WriteBar writeBar4;
        WriteBar writeBar5;
        WriteBar writeBar6;
        WriteBar writeBar7;
        WriteBar writeBar8;
        WriteBar writeBar9;
        WriteBar writeBar10;
        boolean z4;
        WriteBar writeBar11;
        WriteBar writeBar12;
        WriteBar writeBar13;
        WriteBar writeBar14;
        WriteBar writeBar15;
        WriteBar writeBar16;
        WriteBar writeBar17;
        WriteBar writeBar18;
        StickersView stickersView;
        WriteBar writeBar19;
        WriteBar writeBar20;
        WriteBar writeBar21;
        WriteBar writeBar22;
        WriteBar writeBar23;
        WriteBar writeBar24;
        int i2;
        WriteBar writeBar25;
        WriteBar writeBar26;
        WriteBarDisabled writeBarDisabled;
        c cVar2;
        c cVar3;
        WritePermission oc;
        WritePermission oc2;
        WritePermission oc3;
        int i3;
        ChatSettings Hb;
        ChatSettings Hb2;
        boolean z5;
        VerifyInfo verifyInfo;
        Set<UserId> set;
        Iterator<T> it;
        boolean z6;
        ChatSettings Hb3;
        Peer peer;
        this.n = cVar;
        boolean contains = rl3.y0(new c[]{c.NORMAL, c.LEFT}).contains(cVar);
        boolean b2 = o25.b(o25.a());
        boolean z7 = !b2;
        a1w a1wVar = this.b;
        Peer q = a1wVar.q();
        q.getClass();
        Peer.Type type = Peer.Type.GROUP;
        boolean Ab = q.Ab(type);
        if (!Ab) {
            Dialog Cb2 = this.k.Cb();
            if ((Cb2 != null ? Cb2.Ed() : null) != type) {
                Dialog Cb3 = this.k.Cb();
                if (!((Cb3 == null || (Hb3 = Cb3.Hb()) == null || (peer = Hb3.d) == null) ? false : peer.Ab(type))) {
                    z = false;
                    boolean K = o25.a().K(this.e);
                    Dialog Cb4 = this.k.Cb();
                    boolean Fb = Cb4 == null ? Cb4.Fb() & z7 : K;
                    Cb = this.k.Cb();
                    if (Cb != null) {
                        K = Cb.Eb() & z7;
                    }
                    if (!b2 && !this.l.isEmpty()) {
                        set = this.l;
                        if ((set instanceof Collection) || !set.isEmpty()) {
                            it = set.iterator();
                            while (it.hasNext()) {
                                if (com.vk.dto.common.b.a(((UserId) it.next()).b)) {
                                    z6 = true;
                                    break;
                                }
                            }
                        }
                        z6 = false;
                        if (!z6) {
                            Dialog Cb5 = this.k.Cb();
                            if (((Cb5 == null || Cb5.Jc()) ? false : true) && !z) {
                                z2 = true;
                                Dialog Cb6 = this.k.Cb();
                                boolean z8 = !(Cb6 == null && Cb6.uc());
                                boolean f2 = f();
                                Dialog Cb7 = this.k.Cb();
                                boolean z9 = Cb7 == null && Cb7.uc();
                                boolean z10 = (o25.b(o25.a()) || (verifyInfo = o25.a().o().l) == null || !verifyInfo.b) ? false : true;
                                boolean z11 = !z;
                                if (Ab) {
                                    Dialog Cb8 = this.k.Cb();
                                    if ((Cb8 == null || Cb8.uc()) ? false : true) {
                                        ImFeatures imFeatures = ImFeatures.GROUPS_MESSENGER_DISABLED;
                                        imFeatures.getClass();
                                        if (!com.vk.toggle.b.A.a(imFeatures)) {
                                            z3 = true;
                                            writeBar = this.t;
                                            if (writeBar == null) {
                                                writeBar = null;
                                            }
                                            writeBar.setStickersSuggestEnabled(contains);
                                            writeBar2 = this.t;
                                            if (writeBar2 == null) {
                                                writeBar2 = null;
                                            }
                                            Set<UserId> set2 = this.l;
                                            boolean z12 = !contains && z2;
                                            boolean z13 = z;
                                            Dialog Cb9 = this.k.Cb();
                                            writeBar2.X(set2, z12, Cb9 == null ? Cb9.Db() : false, z8);
                                            writeBar3 = this.t;
                                            if (writeBar3 == null) {
                                                writeBar3 = null;
                                            }
                                            writeBar3.y.a(WriteBarPermissionsHolder.Permission.APPS, z11);
                                            writeBar3.getState().e = z8;
                                            writeBar4 = this.t;
                                            if (writeBar4 == null) {
                                                writeBar4 = null;
                                            }
                                            writeBar4.setTemplatesAvailable(z3);
                                            writeBar5 = this.t;
                                            if (writeBar5 == null) {
                                                writeBar5 = null;
                                            }
                                            boolean z14 = this.c0;
                                            writeBar5.setMoneySendAllowed((contains || !Fb || z14) ? false : true);
                                            writeBar6 = this.t;
                                            if (writeBar6 == null) {
                                                writeBar6 = null;
                                            }
                                            writeBar6.setMoneyRequestAllowed((contains || !K || z14) ? false : true);
                                            writeBar7 = this.t;
                                            if (writeBar7 == null) {
                                                writeBar7 = null;
                                            }
                                            writeBar7.setPhotoVideoFromVkAllowed(z7);
                                            writeBar8 = this.t;
                                            if (writeBar8 == null) {
                                                writeBar8 = null;
                                            }
                                            writeBar8.setDocumentsSearchAllowed(z7);
                                            writeBar9 = this.t;
                                            if (writeBar9 == null) {
                                                writeBar9 = null;
                                            }
                                            writeBar9.setGraffitiAllowed((contains || z13) ? false : true);
                                            writeBar10 = this.t;
                                            if (writeBar10 == null) {
                                                writeBar10 = null;
                                            }
                                            if (contains) {
                                                if (!z14) {
                                                    Peer q2 = a1wVar.q();
                                                    q2.getClass();
                                                    if (!q2.Ab(Peer.Type.GROUP)) {
                                                        z5 = true;
                                                        if (z5) {
                                                            z4 = true;
                                                            writeBar10.setAudioMsgRecordingAllowed(z4);
                                                            writeBar11 = this.t;
                                                            if (writeBar11 == null) {
                                                                writeBar11 = null;
                                                            }
                                                            writeBar11.setVideoMsgRecordingAllowed(!contains && O());
                                                            writeBar12 = this.t;
                                                            if (writeBar12 == null) {
                                                                writeBar12 = null;
                                                            }
                                                            writeBar12.I();
                                                            writeBar13 = this.t;
                                                            if (writeBar13 == null) {
                                                                writeBar13 = null;
                                                            }
                                                            writeBar13.setStoriesAllowed(false);
                                                            writeBar14 = this.t;
                                                            if (writeBar14 == null) {
                                                                writeBar14 = null;
                                                            }
                                                            writeBar14.setBotKeyboardAllowed(!contains && f2);
                                                            writeBar15 = this.t;
                                                            if (writeBar15 == null) {
                                                                writeBar15 = null;
                                                            }
                                                            writeBar15.setPollAllowed(!contains && z9);
                                                            writeBar16 = this.t;
                                                            if (writeBar16 == null) {
                                                                writeBar16 = null;
                                                            }
                                                            writeBar16.setAchievementsAllowed(!contains && z10);
                                                            writeBar17 = this.t;
                                                            if (writeBar17 == null) {
                                                                writeBar17 = null;
                                                            }
                                                            Dialog Cb10 = this.k.Cb();
                                                            writeBar17.setDialogId(Cb10 != null ? Cb10.Sb().longValue() : this.e);
                                                            writeBar18 = this.t;
                                                            if (writeBar18 == null) {
                                                                writeBar18 = null;
                                                            }
                                                            Dialog Cb11 = this.k.Cb();
                                                            writeBar18.setDialogTitle((Cb11 != null || (Hb2 = Cb11.Hb()) == null) ? null : Hb2.b);
                                                            stickersView = this.C;
                                                            if (stickersView == null) {
                                                                stickersView = null;
                                                            }
                                                            stickersView.setStickersEnabled(contains);
                                                            writeBar19 = this.t;
                                                            if (writeBar19 == null) {
                                                                writeBar19 = null;
                                                            }
                                                            int i4 = this.X;
                                                            writeBar19.setAttachLimits(i4);
                                                            writeBar20 = this.t;
                                                            if (writeBar20 == null) {
                                                                writeBar20 = null;
                                                            }
                                                            a1wVar.r().getClass();
                                                            int i5 = 10;
                                                            writeBar20.setAttachLimitHintEnabled(i4 > 10);
                                                            writeBar21 = this.t;
                                                            if (writeBar21 == null) {
                                                                writeBar21 = null;
                                                            }
                                                            writeBar21.setAddAttachAllowed(true);
                                                            writeBar22 = this.t;
                                                            if (writeBar22 == null) {
                                                                writeBar22 = null;
                                                            }
                                                            writeBar22.setEmojiAllowed(true);
                                                            writeBar23 = this.t;
                                                            if (writeBar23 == null) {
                                                                writeBar23 = null;
                                                            }
                                                            writeBar23.setAttachNewDot(pla.e().b().m(HintId.INFO_SUPERAPP_IM_INTEGRATION_PICKER_TOOLTIP));
                                                            boolean z15 = this.n != c.EDITING;
                                                            writeBar24 = this.t;
                                                            if (writeBar24 == null) {
                                                                writeBar24 = null;
                                                            }
                                                            writeBar24.setShowPhotoEditorEntryPoints(z15);
                                                            i2 = d.$EnumSwitchMapping$1[this.n.ordinal()];
                                                            int i6 = 2;
                                                            int i7 = 8;
                                                            if (i2 != 1 || i2 == 2 || i2 == 3) {
                                                                writeBar25 = this.t;
                                                                if (writeBar25 == null) {
                                                                    writeBar25 = null;
                                                                }
                                                                writeBar25.F();
                                                                writeBar26 = this.t;
                                                                if (writeBar26 == null) {
                                                                    writeBar26 = null;
                                                                }
                                                                writeBar26.setVisibility(8);
                                                                writeBarDisabled = this.v;
                                                                if (writeBarDisabled == null) {
                                                                    writeBarDisabled = null;
                                                                }
                                                                writeBarDisabled.setVisibility(0);
                                                                cVar2 = this.n;
                                                                cVar3 = c.CHANNEL;
                                                                Activity activity = this.i;
                                                                if (cVar2 == cVar3) {
                                                                    Dialog Cb12 = this.k.Cb();
                                                                    boolean z16 = (Cb12 == null || (Hb = Cb12.Hb()) == null || !Hb.j) ? false : true;
                                                                    if (z16) {
                                                                        i3 = R.drawable.vk_icon_add_24;
                                                                    } else {
                                                                        Dialog Cb13 = this.k.Cb();
                                                                        i3 = (Cb13 != null ? Cb13.notificationsDisabledUntil : 0L) < 0 ? R.drawable.vk_icon_volume_24 : R.drawable.vk_icon_mute_24;
                                                                    }
                                                                    WriteBarDisabled writeBarDisabled2 = this.v;
                                                                    if (writeBarDisabled2 == null) {
                                                                        writeBarDisabled2 = null;
                                                                    }
                                                                    writeBarDisabled2.a(i3, I());
                                                                    WriteBarDisabled writeBarDisabled3 = this.v;
                                                                    bwt0.i0(writeBarDisabled3 == null ? null : writeBarDisabled3, new mt2(z16, this, i6));
                                                                } else {
                                                                    Dialog Cb14 = this.k.Cb();
                                                                    WritePermission.State state = (Cb14 == null || (oc3 = Cb14.oc()) == null) ? null : oc3.a;
                                                                    if ((state == null ? -1 : d.$EnumSwitchMapping$2[state.ordinal()]) == 5) {
                                                                        WriteBarDisabled writeBarDisabled4 = this.v;
                                                                        if (writeBarDisabled4 == null) {
                                                                            writeBarDisabled4 = null;
                                                                        }
                                                                        String I = I();
                                                                        Context applicationContext = activity.getApplicationContext();
                                                                        Dialog Cb15 = this.k.Cb();
                                                                        WritePermission.State state2 = (Cb15 == null || (oc2 = Cb15.oc()) == null) ? null : oc2.a;
                                                                        writeBarDisabled4.c(I, (state2 != null ? d.$EnumSwitchMapping$2[state2.ordinal()] : -1) == 5 ? applicationContext.getString(R.string.vkim_msg_write_disabled_button_donut) : null, new f9(this, i5));
                                                                    } else {
                                                                        Dialog Cb16 = this.k.Cb();
                                                                        boolean z17 = ((Cb16 == null || (oc = Cb16.oc()) == null) ? null : oc.a) == WritePermission.State.DISABLED_RECEIVER_PRIVACY_SETTINGS;
                                                                        boolean z18 = Cb16 != null ? true : true;
                                                                        if (Cb16 != null) {
                                                                        }
                                                                        X(Cb16);
                                                                    }
                                                                }
                                                                mhy.b(activity);
                                                                s3q0 s3q0Var = s3q0.a;
                                                            }
                                                            if (i2 != 4) {
                                                                WriteBar writeBar27 = this.t;
                                                                if (writeBar27 == null) {
                                                                    writeBar27 = null;
                                                                }
                                                                writeBar27.setVisibility(0);
                                                                WriteBarDisabled writeBarDisabled5 = this.v;
                                                                if (writeBarDisabled5 == null) {
                                                                    writeBarDisabled5 = null;
                                                                }
                                                                writeBarDisabled5.setVisibility(8);
                                                                WriteBarDisabledMoveToMaxBanner writeBarDisabledMoveToMaxBanner = this.x;
                                                                if (writeBarDisabledMoveToMaxBanner != null) {
                                                                    writeBarDisabledMoveToMaxBanner.setVisibility(8);
                                                                    s3q0 s3q0Var2 = s3q0.a;
                                                                }
                                                                RichEditText richEditText = this.B;
                                                                if (richEditText == null) {
                                                                    richEditText = null;
                                                                }
                                                                richEditText.setFilters(new InputFilter[0]);
                                                                WriteBar writeBar28 = this.t;
                                                                if (writeBar28 == null) {
                                                                    writeBar28 = null;
                                                                }
                                                                writeBar28.Z();
                                                                WriteBar writeBar29 = this.t;
                                                                (writeBar29 == null ? null : writeBar29).setIsSendButtonAlwaysEnabled(false);
                                                                s3q0 s3q0Var3 = s3q0.a;
                                                                return;
                                                            }
                                                            WriteBar writeBar30 = this.t;
                                                            if (writeBar30 == null) {
                                                                writeBar30 = null;
                                                            }
                                                            writeBar30.setVisibility(0);
                                                            WriteBarDisabled writeBarDisabled6 = this.v;
                                                            if (writeBarDisabled6 == null) {
                                                                writeBarDisabled6 = null;
                                                            }
                                                            writeBarDisabled6.setVisibility(8);
                                                            RichEditText richEditText2 = this.B;
                                                            if (richEditText2 == null) {
                                                                richEditText2 = null;
                                                            }
                                                            a1wVar.a.getClass();
                                                            richEditText2.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(4000)});
                                                            WriteBar writeBar31 = this.t;
                                                            if (writeBar31 == null) {
                                                                writeBar31 = null;
                                                            }
                                                            writeBar31.W();
                                                            WriteBar writeBar32 = this.t;
                                                            if (writeBar32 == null) {
                                                                writeBar32 = null;
                                                            }
                                                            writeBar32.setIsSendButtonAlwaysEnabled(true);
                                                            WriteBar writeBar33 = this.t;
                                                            if (writeBar33 == null) {
                                                                writeBar33 = null;
                                                            }
                                                            a1wVar.r().getClass();
                                                            writeBar33.setAttachLimits(10);
                                                            WriteBar writeBar34 = this.t;
                                                            (writeBar34 == null ? null : writeBar34).setAttachLimitHintEnabled(false);
                                                            s3q0 s3q0Var4 = s3q0.a;
                                                            return;
                                                        }
                                                    }
                                                }
                                                z5 = false;
                                                if (z5) {
                                                }
                                            }
                                            z4 = false;
                                            writeBar10.setAudioMsgRecordingAllowed(z4);
                                            writeBar11 = this.t;
                                            if (writeBar11 == null) {
                                            }
                                            writeBar11.setVideoMsgRecordingAllowed(!contains && O());
                                            writeBar12 = this.t;
                                            if (writeBar12 == null) {
                                            }
                                            writeBar12.I();
                                            writeBar13 = this.t;
                                            if (writeBar13 == null) {
                                            }
                                            writeBar13.setStoriesAllowed(false);
                                            writeBar14 = this.t;
                                            if (writeBar14 == null) {
                                            }
                                            writeBar14.setBotKeyboardAllowed(!contains && f2);
                                            writeBar15 = this.t;
                                            if (writeBar15 == null) {
                                            }
                                            writeBar15.setPollAllowed(!contains && z9);
                                            writeBar16 = this.t;
                                            if (writeBar16 == null) {
                                            }
                                            writeBar16.setAchievementsAllowed(!contains && z10);
                                            writeBar17 = this.t;
                                            if (writeBar17 == null) {
                                            }
                                            Dialog Cb102 = this.k.Cb();
                                            writeBar17.setDialogId(Cb102 != null ? Cb102.Sb().longValue() : this.e);
                                            writeBar18 = this.t;
                                            if (writeBar18 == null) {
                                            }
                                            Dialog Cb112 = this.k.Cb();
                                            writeBar18.setDialogTitle((Cb112 != null || (Hb2 = Cb112.Hb()) == null) ? null : Hb2.b);
                                            stickersView = this.C;
                                            if (stickersView == null) {
                                            }
                                            stickersView.setStickersEnabled(contains);
                                            writeBar19 = this.t;
                                            if (writeBar19 == null) {
                                            }
                                            int i42 = this.X;
                                            writeBar19.setAttachLimits(i42);
                                            writeBar20 = this.t;
                                            if (writeBar20 == null) {
                                            }
                                            a1wVar.r().getClass();
                                            int i52 = 10;
                                            writeBar20.setAttachLimitHintEnabled(i42 > 10);
                                            writeBar21 = this.t;
                                            if (writeBar21 == null) {
                                            }
                                            writeBar21.setAddAttachAllowed(true);
                                            writeBar22 = this.t;
                                            if (writeBar22 == null) {
                                            }
                                            writeBar22.setEmojiAllowed(true);
                                            writeBar23 = this.t;
                                            if (writeBar23 == null) {
                                            }
                                            writeBar23.setAttachNewDot(pla.e().b().m(HintId.INFO_SUPERAPP_IM_INTEGRATION_PICKER_TOOLTIP));
                                            if (this.n != c.EDITING) {
                                            }
                                            writeBar24 = this.t;
                                            if (writeBar24 == null) {
                                            }
                                            writeBar24.setShowPhotoEditorEntryPoints(z15);
                                            i2 = d.$EnumSwitchMapping$1[this.n.ordinal()];
                                            int i62 = 2;
                                            int i72 = 8;
                                            if (i2 != 1) {
                                            }
                                            writeBar25 = this.t;
                                            if (writeBar25 == null) {
                                            }
                                            writeBar25.F();
                                            writeBar26 = this.t;
                                            if (writeBar26 == null) {
                                            }
                                            writeBar26.setVisibility(8);
                                            writeBarDisabled = this.v;
                                            if (writeBarDisabled == null) {
                                            }
                                            writeBarDisabled.setVisibility(0);
                                            cVar2 = this.n;
                                            cVar3 = c.CHANNEL;
                                            Activity activity2 = this.i;
                                            if (cVar2 == cVar3) {
                                            }
                                            mhy.b(activity2);
                                            s3q0 s3q0Var5 = s3q0.a;
                                        }
                                    }
                                }
                                z3 = false;
                                writeBar = this.t;
                                if (writeBar == null) {
                                }
                                writeBar.setStickersSuggestEnabled(contains);
                                writeBar2 = this.t;
                                if (writeBar2 == null) {
                                }
                                Set<UserId> set22 = this.l;
                                if (contains) {
                                }
                                boolean z132 = z;
                                Dialog Cb92 = this.k.Cb();
                                writeBar2.X(set22, z12, Cb92 == null ? Cb92.Db() : false, z8);
                                writeBar3 = this.t;
                                if (writeBar3 == null) {
                                }
                                writeBar3.y.a(WriteBarPermissionsHolder.Permission.APPS, z11);
                                writeBar3.getState().e = z8;
                                writeBar4 = this.t;
                                if (writeBar4 == null) {
                                }
                                writeBar4.setTemplatesAvailable(z3);
                                writeBar5 = this.t;
                                if (writeBar5 == null) {
                                }
                                boolean z142 = this.c0;
                                writeBar5.setMoneySendAllowed((contains || !Fb || z142) ? false : true);
                                writeBar6 = this.t;
                                if (writeBar6 == null) {
                                }
                                writeBar6.setMoneyRequestAllowed((contains || !K || z142) ? false : true);
                                writeBar7 = this.t;
                                if (writeBar7 == null) {
                                }
                                writeBar7.setPhotoVideoFromVkAllowed(z7);
                                writeBar8 = this.t;
                                if (writeBar8 == null) {
                                }
                                writeBar8.setDocumentsSearchAllowed(z7);
                                writeBar9 = this.t;
                                if (writeBar9 == null) {
                                }
                                writeBar9.setGraffitiAllowed((contains || z132) ? false : true);
                                writeBar10 = this.t;
                                if (writeBar10 == null) {
                                }
                                if (contains) {
                                }
                                z4 = false;
                                writeBar10.setAudioMsgRecordingAllowed(z4);
                                writeBar11 = this.t;
                                if (writeBar11 == null) {
                                }
                                writeBar11.setVideoMsgRecordingAllowed(!contains && O());
                                writeBar12 = this.t;
                                if (writeBar12 == null) {
                                }
                                writeBar12.I();
                                writeBar13 = this.t;
                                if (writeBar13 == null) {
                                }
                                writeBar13.setStoriesAllowed(false);
                                writeBar14 = this.t;
                                if (writeBar14 == null) {
                                }
                                writeBar14.setBotKeyboardAllowed(!contains && f2);
                                writeBar15 = this.t;
                                if (writeBar15 == null) {
                                }
                                writeBar15.setPollAllowed(!contains && z9);
                                writeBar16 = this.t;
                                if (writeBar16 == null) {
                                }
                                writeBar16.setAchievementsAllowed(!contains && z10);
                                writeBar17 = this.t;
                                if (writeBar17 == null) {
                                }
                                Dialog Cb1022 = this.k.Cb();
                                writeBar17.setDialogId(Cb1022 != null ? Cb1022.Sb().longValue() : this.e);
                                writeBar18 = this.t;
                                if (writeBar18 == null) {
                                }
                                Dialog Cb1122 = this.k.Cb();
                                writeBar18.setDialogTitle((Cb1122 != null || (Hb2 = Cb1122.Hb()) == null) ? null : Hb2.b);
                                stickersView = this.C;
                                if (stickersView == null) {
                                }
                                stickersView.setStickersEnabled(contains);
                                writeBar19 = this.t;
                                if (writeBar19 == null) {
                                }
                                int i422 = this.X;
                                writeBar19.setAttachLimits(i422);
                                writeBar20 = this.t;
                                if (writeBar20 == null) {
                                }
                                a1wVar.r().getClass();
                                int i522 = 10;
                                writeBar20.setAttachLimitHintEnabled(i422 > 10);
                                writeBar21 = this.t;
                                if (writeBar21 == null) {
                                }
                                writeBar21.setAddAttachAllowed(true);
                                writeBar22 = this.t;
                                if (writeBar22 == null) {
                                }
                                writeBar22.setEmojiAllowed(true);
                                writeBar23 = this.t;
                                if (writeBar23 == null) {
                                }
                                writeBar23.setAttachNewDot(pla.e().b().m(HintId.INFO_SUPERAPP_IM_INTEGRATION_PICKER_TOOLTIP));
                                if (this.n != c.EDITING) {
                                }
                                writeBar24 = this.t;
                                if (writeBar24 == null) {
                                }
                                writeBar24.setShowPhotoEditorEntryPoints(z15);
                                i2 = d.$EnumSwitchMapping$1[this.n.ordinal()];
                                int i622 = 2;
                                int i722 = 8;
                                if (i2 != 1) {
                                }
                                writeBar25 = this.t;
                                if (writeBar25 == null) {
                                }
                                writeBar25.F();
                                writeBar26 = this.t;
                                if (writeBar26 == null) {
                                }
                                writeBar26.setVisibility(8);
                                writeBarDisabled = this.v;
                                if (writeBarDisabled == null) {
                                }
                                writeBarDisabled.setVisibility(0);
                                cVar2 = this.n;
                                cVar3 = c.CHANNEL;
                                Activity activity22 = this.i;
                                if (cVar2 == cVar3) {
                                }
                                mhy.b(activity22);
                                s3q0 s3q0Var52 = s3q0.a;
                            }
                        }
                    }
                    z2 = false;
                    Dialog Cb62 = this.k.Cb();
                    boolean z82 = !(Cb62 == null && Cb62.uc());
                    boolean f22 = f();
                    Dialog Cb72 = this.k.Cb();
                    if (Cb72 == null) {
                    }
                    if (o25.b(o25.a())) {
                    }
                    boolean z112 = !z;
                    if (Ab) {
                    }
                    z3 = false;
                    writeBar = this.t;
                    if (writeBar == null) {
                    }
                    writeBar.setStickersSuggestEnabled(contains);
                    writeBar2 = this.t;
                    if (writeBar2 == null) {
                    }
                    Set<UserId> set222 = this.l;
                    if (contains) {
                    }
                    boolean z1322 = z;
                    Dialog Cb922 = this.k.Cb();
                    writeBar2.X(set222, z12, Cb922 == null ? Cb922.Db() : false, z82);
                    writeBar3 = this.t;
                    if (writeBar3 == null) {
                    }
                    writeBar3.y.a(WriteBarPermissionsHolder.Permission.APPS, z112);
                    writeBar3.getState().e = z82;
                    writeBar4 = this.t;
                    if (writeBar4 == null) {
                    }
                    writeBar4.setTemplatesAvailable(z3);
                    writeBar5 = this.t;
                    if (writeBar5 == null) {
                    }
                    boolean z1422 = this.c0;
                    writeBar5.setMoneySendAllowed((contains || !Fb || z1422) ? false : true);
                    writeBar6 = this.t;
                    if (writeBar6 == null) {
                    }
                    writeBar6.setMoneyRequestAllowed((contains || !K || z1422) ? false : true);
                    writeBar7 = this.t;
                    if (writeBar7 == null) {
                    }
                    writeBar7.setPhotoVideoFromVkAllowed(z7);
                    writeBar8 = this.t;
                    if (writeBar8 == null) {
                    }
                    writeBar8.setDocumentsSearchAllowed(z7);
                    writeBar9 = this.t;
                    if (writeBar9 == null) {
                    }
                    writeBar9.setGraffitiAllowed((contains || z1322) ? false : true);
                    writeBar10 = this.t;
                    if (writeBar10 == null) {
                    }
                    if (contains) {
                    }
                    z4 = false;
                    writeBar10.setAudioMsgRecordingAllowed(z4);
                    writeBar11 = this.t;
                    if (writeBar11 == null) {
                    }
                    writeBar11.setVideoMsgRecordingAllowed(!contains && O());
                    writeBar12 = this.t;
                    if (writeBar12 == null) {
                    }
                    writeBar12.I();
                    writeBar13 = this.t;
                    if (writeBar13 == null) {
                    }
                    writeBar13.setStoriesAllowed(false);
                    writeBar14 = this.t;
                    if (writeBar14 == null) {
                    }
                    writeBar14.setBotKeyboardAllowed(!contains && f22);
                    writeBar15 = this.t;
                    if (writeBar15 == null) {
                    }
                    writeBar15.setPollAllowed(!contains && z9);
                    writeBar16 = this.t;
                    if (writeBar16 == null) {
                    }
                    writeBar16.setAchievementsAllowed(!contains && z10);
                    writeBar17 = this.t;
                    if (writeBar17 == null) {
                    }
                    Dialog Cb10222 = this.k.Cb();
                    writeBar17.setDialogId(Cb10222 != null ? Cb10222.Sb().longValue() : this.e);
                    writeBar18 = this.t;
                    if (writeBar18 == null) {
                    }
                    Dialog Cb11222 = this.k.Cb();
                    writeBar18.setDialogTitle((Cb11222 != null || (Hb2 = Cb11222.Hb()) == null) ? null : Hb2.b);
                    stickersView = this.C;
                    if (stickersView == null) {
                    }
                    stickersView.setStickersEnabled(contains);
                    writeBar19 = this.t;
                    if (writeBar19 == null) {
                    }
                    int i4222 = this.X;
                    writeBar19.setAttachLimits(i4222);
                    writeBar20 = this.t;
                    if (writeBar20 == null) {
                    }
                    a1wVar.r().getClass();
                    int i5222 = 10;
                    writeBar20.setAttachLimitHintEnabled(i4222 > 10);
                    writeBar21 = this.t;
                    if (writeBar21 == null) {
                    }
                    writeBar21.setAddAttachAllowed(true);
                    writeBar22 = this.t;
                    if (writeBar22 == null) {
                    }
                    writeBar22.setEmojiAllowed(true);
                    writeBar23 = this.t;
                    if (writeBar23 == null) {
                    }
                    writeBar23.setAttachNewDot(pla.e().b().m(HintId.INFO_SUPERAPP_IM_INTEGRATION_PICKER_TOOLTIP));
                    if (this.n != c.EDITING) {
                    }
                    writeBar24 = this.t;
                    if (writeBar24 == null) {
                    }
                    writeBar24.setShowPhotoEditorEntryPoints(z15);
                    i2 = d.$EnumSwitchMapping$1[this.n.ordinal()];
                    int i6222 = 2;
                    int i7222 = 8;
                    if (i2 != 1) {
                    }
                    writeBar25 = this.t;
                    if (writeBar25 == null) {
                    }
                    writeBar25.F();
                    writeBar26 = this.t;
                    if (writeBar26 == null) {
                    }
                    writeBar26.setVisibility(8);
                    writeBarDisabled = this.v;
                    if (writeBarDisabled == null) {
                    }
                    writeBarDisabled.setVisibility(0);
                    cVar2 = this.n;
                    cVar3 = c.CHANNEL;
                    Activity activity222 = this.i;
                    if (cVar2 == cVar3) {
                    }
                    mhy.b(activity222);
                    s3q0 s3q0Var522 = s3q0.a;
                }
            }
        }
        z = true;
        boolean K2 = o25.a().K(this.e);
        Dialog Cb42 = this.k.Cb();
        if (Cb42 == null) {
        }
        Cb = this.k.Cb();
        if (Cb != null) {
        }
        if (!b2) {
            set = this.l;
            if (set instanceof Collection) {
            }
            it = set.iterator();
            while (it.hasNext()) {
            }
            z6 = false;
            if (!z6) {
            }
        }
        z2 = false;
        Dialog Cb622 = this.k.Cb();
        boolean z822 = !(Cb622 == null && Cb622.uc());
        boolean f222 = f();
        Dialog Cb722 = this.k.Cb();
        if (Cb722 == null) {
        }
        if (o25.b(o25.a())) {
        }
        boolean z1122 = !z;
        if (Ab) {
        }
        z3 = false;
        writeBar = this.t;
        if (writeBar == null) {
        }
        writeBar.setStickersSuggestEnabled(contains);
        writeBar2 = this.t;
        if (writeBar2 == null) {
        }
        Set<UserId> set2222 = this.l;
        if (contains) {
        }
        boolean z13222 = z;
        Dialog Cb9222 = this.k.Cb();
        writeBar2.X(set2222, z12, Cb9222 == null ? Cb9222.Db() : false, z822);
        writeBar3 = this.t;
        if (writeBar3 == null) {
        }
        writeBar3.y.a(WriteBarPermissionsHolder.Permission.APPS, z1122);
        writeBar3.getState().e = z822;
        writeBar4 = this.t;
        if (writeBar4 == null) {
        }
        writeBar4.setTemplatesAvailable(z3);
        writeBar5 = this.t;
        if (writeBar5 == null) {
        }
        boolean z14222 = this.c0;
        writeBar5.setMoneySendAllowed((contains || !Fb || z14222) ? false : true);
        writeBar6 = this.t;
        if (writeBar6 == null) {
        }
        writeBar6.setMoneyRequestAllowed((contains || !K2 || z14222) ? false : true);
        writeBar7 = this.t;
        if (writeBar7 == null) {
        }
        writeBar7.setPhotoVideoFromVkAllowed(z7);
        writeBar8 = this.t;
        if (writeBar8 == null) {
        }
        writeBar8.setDocumentsSearchAllowed(z7);
        writeBar9 = this.t;
        if (writeBar9 == null) {
        }
        writeBar9.setGraffitiAllowed((contains || z13222) ? false : true);
        writeBar10 = this.t;
        if (writeBar10 == null) {
        }
        if (contains) {
        }
        z4 = false;
        writeBar10.setAudioMsgRecordingAllowed(z4);
        writeBar11 = this.t;
        if (writeBar11 == null) {
        }
        writeBar11.setVideoMsgRecordingAllowed(!contains && O());
        writeBar12 = this.t;
        if (writeBar12 == null) {
        }
        writeBar12.I();
        writeBar13 = this.t;
        if (writeBar13 == null) {
        }
        writeBar13.setStoriesAllowed(false);
        writeBar14 = this.t;
        if (writeBar14 == null) {
        }
        writeBar14.setBotKeyboardAllowed(!contains && f222);
        writeBar15 = this.t;
        if (writeBar15 == null) {
        }
        writeBar15.setPollAllowed(!contains && z9);
        writeBar16 = this.t;
        if (writeBar16 == null) {
        }
        writeBar16.setAchievementsAllowed(!contains && z10);
        writeBar17 = this.t;
        if (writeBar17 == null) {
        }
        Dialog Cb102222 = this.k.Cb();
        writeBar17.setDialogId(Cb102222 != null ? Cb102222.Sb().longValue() : this.e);
        writeBar18 = this.t;
        if (writeBar18 == null) {
        }
        Dialog Cb112222 = this.k.Cb();
        writeBar18.setDialogTitle((Cb112222 != null || (Hb2 = Cb112222.Hb()) == null) ? null : Hb2.b);
        stickersView = this.C;
        if (stickersView == null) {
        }
        stickersView.setStickersEnabled(contains);
        writeBar19 = this.t;
        if (writeBar19 == null) {
        }
        int i42222 = this.X;
        writeBar19.setAttachLimits(i42222);
        writeBar20 = this.t;
        if (writeBar20 == null) {
        }
        a1wVar.r().getClass();
        int i52222 = 10;
        writeBar20.setAttachLimitHintEnabled(i42222 > 10);
        writeBar21 = this.t;
        if (writeBar21 == null) {
        }
        writeBar21.setAddAttachAllowed(true);
        writeBar22 = this.t;
        if (writeBar22 == null) {
        }
        writeBar22.setEmojiAllowed(true);
        writeBar23 = this.t;
        if (writeBar23 == null) {
        }
        writeBar23.setAttachNewDot(pla.e().b().m(HintId.INFO_SUPERAPP_IM_INTEGRATION_PICKER_TOOLTIP));
        if (this.n != c.EDITING) {
        }
        writeBar24 = this.t;
        if (writeBar24 == null) {
        }
        writeBar24.setShowPhotoEditorEntryPoints(z15);
        i2 = d.$EnumSwitchMapping$1[this.n.ordinal()];
        int i62222 = 2;
        int i72222 = 8;
        if (i2 != 1) {
        }
        writeBar25 = this.t;
        if (writeBar25 == null) {
        }
        writeBar25.F();
        writeBar26 = this.t;
        if (writeBar26 == null) {
        }
        writeBar26.setVisibility(8);
        writeBarDisabled = this.v;
        if (writeBarDisabled == null) {
        }
        writeBarDisabled.setVisibility(0);
        cVar2 = this.n;
        cVar3 = c.CHANNEL;
        Activity activity2222 = this.i;
        if (cVar2 == cVar3) {
        }
        mhy.b(activity2222);
        s3q0 s3q0Var5222 = s3q0.a;
    }

    @Override // xsna.rnv
    public final void k(long j, UserId userId) {
        if (this.n == c.NORMAL) {
            xgy xgyVar = this.N;
            if (xgyVar != null) {
                xgyVar.d();
            }
            M(this.M);
            xgy J = J();
            int i2 = xgy.F;
            J.h(null);
            StickersView stickersView = this.C;
            StickersView stickersView2 = stickersView != null ? stickersView : null;
            if (stickersView2.F) {
                stickersView2.f(j, userId);
                return;
            }
            stickersView2.A = -7;
            stickersView2.B = userId;
            stickersView2.C = j;
        }
    }

    @Override // xsna.rnv
    public final void l(long j) {
        this.l = izi0.i(new UserId(j));
        j0(this.n);
    }

    @Override // xsna.rnv
    public final void m() {
        WriteBar writeBar = this.t;
        if (writeBar == null) {
            writeBar = null;
        }
        writeBar.B.f = false;
        writeBar.R();
    }

    @Override // xsna.rnv
    public final void n(Bundle bundle, final long j) {
        long j2;
        ArrayList parcelableArrayList;
        ArrayList parcelableArrayList2;
        if (this.e != j) {
            this.e = j;
            S(this, null, 3);
            y();
            WriteBar writeBar = this.t;
            if (writeBar == null) {
                writeBar = null;
            }
            writeBar.setDialogId(j);
            final d38 G = G();
            G.o = j;
            G.m.dispose();
            G.m = new io.reactivex.rxjava3.disposables.b();
            a1w a1wVar = G.i;
            Serializer.c<Peer> cVar = Peer.CREATOR;
            G.m.b(a1wVar.E(G, new tqm(Peer.a.b(j), Source.CACHE)).subscribe(new io.reactivex.rxjava3.functions.f() { // from class: xsna.c38
                @Override // io.reactivex.rxjava3.functions.f
                public final void accept(Object obj) {
                    Dialog dialog = (Dialog) ((wpp) obj).c.get(Long.valueOf(j));
                    if (dialog == null) {
                        return;
                    }
                    G.X0(dialog);
                }
            }, kwg0.b()));
            R();
        }
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey("fwd_ids") && (parcelableArrayList2 = bundle.getParcelableArrayList("fwd_ids")) != null && !parcelableArrayList2.isEmpty()) {
            WriteBar writeBar2 = this.t;
            if (writeBar2 == null) {
                writeBar2 = null;
            }
            writeBar2.x(parcelableArrayList2);
        }
        if (bundle.containsKey("text")) {
            WriteBar writeBar3 = this.t;
            if (writeBar3 == null) {
                writeBar3 = null;
            }
            writeBar3.setText(bundle.getString("text"));
        }
        if (bundle.containsKey("post")) {
            Parcelable parcelable = bundle.getParcelable("post");
            Parcelable parcelable2 = parcelable instanceof NewsEntry ? (NewsEntry) parcelable : null;
            Attachment R1 = parcelable2 instanceof fsx0 ? ((fsx0) parcelable2).R1() : null;
            if (R1 != null) {
                WriteBar writeBar4 = this.t;
                if (writeBar4 == null) {
                    writeBar4 = null;
                }
                writeBar4.A1(R1);
            }
        }
        if (bundle.containsKey("photos")) {
            Iterator<String> it = bundle.getStringArrayList("photos").iterator();
            while (it.hasNext()) {
                String next = it.next();
                WriteBar writeBar5 = this.t;
                if (writeBar5 == null) {
                    writeBar5 = null;
                }
                writeBar5.A1(new PendingPhotoAttachment(next));
            }
        }
        if (bundle.containsKey("attachments")) {
            for (Parcelable parcelable3 : bundle.getParcelableArray("attachments")) {
                WriteBar writeBar6 = this.t;
                if (writeBar6 == null) {
                    writeBar6 = null;
                }
                writeBar6.A1((Attachment) parcelable3);
            }
        }
        if (bundle.containsKey("dialog_ext_state")) {
            Bundle bundle2 = bundle.getBundle("dialog_ext_state");
            Peer peer = (Peer) bundle2.getParcelable("dialog_id");
            long j3 = peer != null ? peer.b : 0L;
            DialogExt dialogExt = (DialogExt) com.vk.core.util.state.a.b(DialogExt.class, bundle2, bundle2.getString("dialog_ext_state_key"));
            if (dialogExt == null) {
                dialogExt = new DialogExt(j3, (ProfilesInfo) null, 2, (zcl) null);
            }
            u(dialogExt);
            j2 = j;
        } else {
            j2 = j;
            u(new DialogExt(j2, (ProfilesInfo) null, 2, (zcl) null));
        }
        if (bundle.containsKey("arguments")) {
            n(bundle.getBundle("arguments"), j2);
        }
        h hVar = new h(4, this, kz30.class, "onInlineButtonSendMsg", "onInlineButtonSendMsg(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/vk/im/engine/models/conversations/BotButton;)V", 0);
        BotButton botButton = (BotButton) bundle.getParcelable("inline_button");
        if (botButton != null) {
            String string = bundle.getString("inline_button_msg_text", "");
            String string2 = bundle.getString("payload", "");
            ArrayList parcelableArrayList3 = bundle.getParcelableArrayList("attaches");
            if (parcelableArrayList3 == null) {
                parcelableArrayList3 = new ArrayList(0);
            }
            hVar.invoke(string, string2, parcelableArrayList3, botButton);
        } else if (bundle.containsKey("attaches") && (parcelableArrayList = bundle.getParcelableArrayList("attaches")) != null) {
            int size = parcelableArrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                Attachment b2 = wdw.b((Attach) parcelableArrayList.get(i2), null, false, 6);
                if (b2 != null) {
                    WriteBar writeBar7 = this.t;
                    if (writeBar7 == null) {
                        writeBar7 = null;
                    }
                    writeBar7.A1(b2);
                }
            }
        }
        if (bundle.getBoolean("open_keyboard", false)) {
            this.R.postDelayed(new wd2(this, 8), 200L);
        }
    }

    @Override // xsna.rnv
    public final void o(boolean z) {
        WriteBar writeBar = this.t;
        if (writeBar == null) {
            writeBar = null;
        }
        writeBar.setStickersSuggestEnabled(z);
    }

    @Override // xsna.rnv
    public final void onActivityResult(int i2, int i3, Intent intent) {
        ArrayList arrayList;
        Bundle bundleExtra;
        Peer peer;
        long j = (intent == null || (peer = (Peer) intent.getParcelableExtra("dialog_id")) == null) ? 0L : peer.b;
        if (intent == null || (bundleExtra = intent.getBundleExtra("arguments")) == null || (arrayList = bundleExtra.getParcelableArrayList("fwd_ids")) == null) {
            arrayList = new ArrayList();
        }
        if (i2 > 10000) {
            WriteBar writeBar = this.t;
            (writeBar != null ? writeBar : null).onActivityResult(i2, i3, intent);
            return;
        }
        if (i2 != 201 || i3 != -1 || intent == null || j == 0) {
            return;
        }
        if (j != this.e || arrayList.size() <= 0) {
            o0w.x(this.c.b(), this.i, Long.valueOf(this.b.q().b), j, null, null, null, false, null, null, arrayList, null, null, null, "share", null, null, null, false, null, null, null, null, null, 1073733112);
        } else {
            WriteBar writeBar2 = this.t;
            (writeBar2 != null ? writeBar2 : null).x(new ArrayList(arrayList));
        }
    }

    @Override // xsna.rnv
    public final void onPause() {
        vu4 vu4Var = this.J;
        if (vu4Var == null) {
            vu4Var = null;
        }
        vu4Var.W0();
        BuildInfo.Client client = BuildInfo.a;
        VKApplication vKApplication = com.vk.core.apps.a.a;
        if (this.n == c.NORMAL) {
            vu4 vu4Var2 = this.J;
            if (vu4Var2 == null) {
                vu4Var2 = null;
            }
            if (!(vu4Var2.D.b() instanceof qv4.b)) {
                S(this, null, 3);
            }
        }
        this.Q.a();
        WriteBar writeBar = this.t;
        (writeBar != null ? writeBar : null).getState().f = false;
    }

    @Override // xsna.rnv
    public final void onResume() {
        if (this.n == c.NORMAL) {
            R();
        }
        WriteBar writeBar = this.t;
        if (writeBar == null) {
            writeBar = null;
        }
        writeBar.getState().f = true;
        vu4 vu4Var = this.J;
        if (vu4Var == null) {
            vu4Var = null;
        }
        vu4Var.V0();
        xq4 xq4Var = xq4.C;
        AudioMsgTrackByRecord audioMsgTrackByRecord = xq4Var != null ? (AudioMsgTrackByRecord) xq4Var.c.get(Long.valueOf(this.e)) : null;
        ChatFragment.k kVar = this.K;
        if (kVar == null) {
            kVar = null;
        }
        boolean z = audioMsgTrackByRecord != null;
        ChatFragment chatFragment = ChatFragment.this;
        DialogHeaderController dialogHeaderController = chatFragment.K0;
        if (dialogHeaderController == null) {
            dialogHeaderController = null;
        }
        boolean z2 = !z;
        mem memVar = dialogHeaderController.h;
        memVar.r.i = z2;
        memVar.b1();
        DialogHeaderController dialogHeaderController2 = chatFragment.K0;
        if (dialogHeaderController2 == null) {
            dialogHeaderController2 = null;
        }
        mem memVar2 = dialogHeaderController2.h;
        memVar2.r.g = z2;
        memVar2.b1();
        DialogHeaderController dialogHeaderController3 = chatFragment.K0;
        if (dialogHeaderController3 == null) {
            dialogHeaderController3 = null;
        }
        mem memVar3 = dialogHeaderController3.h;
        memVar3.r.h = z2;
        memVar3.b1();
        com.vk.im.ui.components.msg_list.a aVar = chatFragment.H0;
        (aVar == null ? null : aVar).r = z2;
        (aVar != null ? aVar : null).q = z2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.rnv
    public final void onStart() {
        ?? r0 = this.P;
        if (r0.isInitialized()) {
            ((e140) r0.getValue()).e();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.rnv
    public final void onStop() {
        ?? r0 = this.P;
        if (r0.isInitialized()) {
            ((e140) r0.getValue()).e();
        }
    }

    @Override // xsna.rnv
    public final void p() {
        Set set;
        int i2 = xgy.F;
        Window window = this.i.getWindow();
        if (window == null) {
            set = EmptySet.b;
        } else {
            Object tag = window.getDecorView().getTag(R.id.keyboard_popup_tag);
            set = tag instanceof Set ? (Set) tag : null;
            if (set == null) {
                set = EmptySet.b;
            }
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            dhr0.W((View) it.next());
        }
    }

    @Override // xsna.rnv
    public final void q() {
        WriteBar writeBar = this.t;
        if (writeBar == null) {
            writeBar = null;
        }
        Activity activity = this.i;
        String string = activity.getString(R.string.vkim_birthday_suggest_party);
        y1y0 y1y0Var = writeBar.E;
        StickersDictionaryItem a2 = y1y0Var.m.a(string, y1y0Var.p);
        y1y0Var.a().w(a2);
        if (a2 != null) {
            return;
        }
        WriteBar writeBar2 = this.t;
        (writeBar2 != null ? writeBar2 : null).setText(activity.getString(R.string.vkim_birthday_suggest_cake));
    }

    @Override // xsna.rnv
    public final List<e0l0> r() {
        return this.m;
    }

    @Override // xsna.rnv
    public final boolean s() {
        return this.r;
    }

    @Override // xsna.rnv
    public final void t(Msg msg) {
        if (this.n == c.EDITING) {
            WriteBar writeBar = this.t;
            (writeBar != null ? writeBar : null).performHapticFeedback(17);
            return;
        }
        if (msg != null && !msg.H6()) {
            MsgIdType msgIdType = MsgIdType.LOCAL_ID;
            List singletonList = Collections.singletonList(Integer.valueOf(msg.b));
            long j = msg.c;
            Serializer.c<Peer> cVar = Peer.CREATOR;
            this.o.b(this.b.F(this, new ej30(msgIdType, singletonList, Peer.a.b(j), Source.CACHE, 48)).subscribe(new ez(new f(1, this, kz30.class, "onMsgToReplyLoadSuccess", "onMsgToReplyLoadSuccess(Lcom/vk/im/engine/models/messages/MsgsExt;)V", 0), 28), new iu1(new g(1, this, kz30.class, "onMsgToReplyLoadError", "onMsgToReplyLoadError(Ljava/lang/Throwable;)V", 0), 24)));
            return;
        }
        WriteBar writeBar2 = this.t;
        if (writeBar2 == null) {
            writeBar2 = null;
        }
        writeBar2.Y(null, null, null, false);
        WriteBar writeBar3 = this.t;
        (writeBar3 != null ? writeBar3 : null).setQuickStickerSuggestState(QuickStickerSuggestState.DISABLED);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d6  */
    @Override // xsna.rnv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(DialogExt dialogExt) {
        c cVar;
        Object obj;
        ContextUser contextUser;
        WriteBar writeBar;
        View view;
        Context context;
        xgy xgyVar;
        DraftMsg Kb;
        Dialog Cb;
        Dialog Cb2 = this.k.Cb();
        Dialog Cb3 = dialogExt.Cb();
        if (Cb3 == null) {
            return;
        }
        this.k = dialogExt;
        WritePermission.State state = Cb3.oc().a;
        ChatSettings Hb = Cb3.Hb();
        boolean z = true;
        if (Hb != null && Hb.J) {
            cVar = c.DISABLED;
        } else if (state == WritePermission.State.ENABLED) {
            cVar = this.j == null ? c.NORMAL : c.EDITING;
        } else {
            ChatSettings Hb2 = Cb3.Hb();
            cVar = (Hb2 == null || !Hb2.h) ? state == WritePermission.State.DISABLED_SENDER_LEFT ? c.LEFT : state == WritePermission.State.DISABLED_SENDER_KICKED ? c.KICKED : c.DISABLED : c.CHANNEL;
        }
        j0(cVar);
        if (com.vk.dto.common.b.d(this.e) && !o25.a().a(new UserId(this.e))) {
            Iterator it = dialogExt.b.b.c.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((User) obj).b == this.e) {
                        break;
                    }
                }
            }
            User user = (User) obj;
            if (user != null) {
                contextUser = new ContextUser(new UserId(user.b), user.s, user.h.Hb(h9l0.j), null, 8, null);
                this.s = contextUser;
                writeBar = this.t;
                if (writeBar == null) {
                    writeBar = null;
                }
                writeBar.setContextUser(contextUser);
                view = this.u;
                if (view == null) {
                    view = null;
                }
                context = view.getContext();
                if (context != null && (Cb = this.k.Cb()) != null) {
                    mxv mxvVar = this.c;
                    mxvVar.getClass();
                    if (Cb.sc()) {
                        s3v0 i2 = mxvVar.k().i(context);
                        i2.d.getClass();
                        if (!cew.h().getBoolean("pref_cfg_casper_chat_info_dialog_shown", false)) {
                            cew.h().edit().putBoolean("pref_cfg_casper_chat_info_dialog_shown", true).apply();
                            s3v0.g(i2, i2.a(null, "casper_chat"), null, 6);
                        }
                        bwt0.p0((ViewGroup) view.findViewById(R.id.write_area), false);
                        if (this.G == null) {
                            this.G = (TextView) ((ViewStub) view.findViewById(R.id.install_vk_me_btn_stub)).inflate().findViewById(R.id.install_vk_me_btn);
                        }
                        TextView textView = this.G;
                        if (textView != null) {
                            textView.setText(R.string.vkim_vkme_promo_casper_btn_unavailable);
                        }
                        TextView textView2 = this.G;
                        if (textView2 != null) {
                            textView2.setOnClickListener(new bd0(i2, 10));
                        }
                        e3m.a aVar = e3m.a;
                        Drawable a2 = m33.a(R.drawable.vk_icon_logo_vkme_icon_28, context);
                        TextView textView3 = this.G;
                        if (textView3 != null) {
                            textView3.setCompoundDrawablesRelativeWithIntrinsicBounds(a2, (Drawable) null, (Drawable) null, (Drawable) null);
                        }
                        View view2 = this.H;
                        if (view2 == null) {
                            view2 = view.findViewById(R.id.divider);
                        }
                        this.H = view2;
                        if (view2 != null) {
                            ((RelativeLayout.LayoutParams) view2.getLayoutParams()).addRule(2, R.id.install_btn_container);
                        }
                        View view3 = this.I;
                        if (view3 == null) {
                            view3 = view.findViewById(R.id.messages_list_container);
                        }
                        this.I = view3;
                        ((RelativeLayout.LayoutParams) (view3 != null ? view3.getLayoutParams() : null)).addRule(2, R.id.install_btn_container);
                    }
                }
                d38 G = G();
                G.X0(Cb3);
                G.p = Cb3;
                Object obj2 = f0;
                Handler handler = this.R;
                if (Cb2 != null) {
                    boolean f2 = f();
                    WriteBar writeBar2 = this.t;
                    if (writeBar2 == null) {
                        writeBar2 = null;
                    }
                    writeBar2.setBotKeyboardAllowed(f2);
                    if (f2 && Cb3.Tb()) {
                        nz30 nz30Var = nz30.b;
                        handler.removeCallbacksAndMessages(obj2);
                        nz30Var.invoke(H());
                        K(this.L);
                        M(this.M);
                    }
                } else {
                    BotKeyboard V2 = Cb2.V2();
                    BotKeyboard V22 = Cb3.V2();
                    boolean Tb = Cb2.Tb();
                    boolean Tb2 = Cb3.Tb();
                    if (epx.f(V2, V22) && Tb == Tb2) {
                        z = false;
                    }
                    if (f() && z && Tb2) {
                        int i3 = ify.a;
                        if (ify.e(ify.c)) {
                            handler.postAtTime(new m67(this, 7), obj2, SystemClock.uptimeMillis() + 350);
                        } else {
                            handler.removeCallbacksAndMessages(obj2);
                            H().h(null);
                            s3q0 s3q0Var = s3q0.a;
                            K(this.L);
                            M(this.M);
                        }
                    }
                }
                xgyVar = this.N;
                if (xgyVar != null) {
                    xgyVar.f();
                }
                Kb = Cb2 != null ? Cb2.Kb() : null;
                DraftMsg Kb2 = Cb3.Kb();
                if (Kb == null && Kb.d() && Kb2.isEmpty()) {
                    y();
                }
                return;
            }
        }
        contextUser = null;
        this.s = contextUser;
        writeBar = this.t;
        if (writeBar == null) {
        }
        writeBar.setContextUser(contextUser);
        view = this.u;
        if (view == null) {
        }
        context = view.getContext();
        if (context != null) {
            mxv mxvVar2 = this.c;
            mxvVar2.getClass();
            if (Cb.sc()) {
            }
        }
        d38 G2 = G();
        G2.X0(Cb3);
        G2.p = Cb3;
        Object obj22 = f0;
        Handler handler2 = this.R;
        if (Cb2 != null) {
        }
        xgyVar = this.N;
        if (xgyVar != null) {
        }
        if (Cb2 != null) {
        }
        DraftMsg Kb22 = Cb3.Kb();
        if (Kb == null) {
            return;
        }
        y();
    }

    @Override // xsna.rnv
    public final Integer v() {
        WriteBar writeBar = this.t;
        if (writeBar == null) {
            writeBar = null;
        }
        MsgFromUser replyMessage = writeBar.getReplyMessage();
        if (replyMessage != null) {
            return Integer.valueOf(replyMessage.d);
        }
        return null;
    }

    @Override // xsna.rnv
    public final void w(HashSet hashSet) {
        ArrayList arrayList = new ArrayList(c5g.u(hashSet, 10));
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            dq.h(((Number) it.next()).longValue(), arrayList);
        }
        this.l = new HashSet(arrayList);
        j0(this.n);
    }

    @Override // xsna.rnv
    public final void x(int i2) {
        if (this.n != c.NORMAL) {
            this.c.getClass();
            g2v.d().a().j(this.i, i2, GiftData.d, null, "message");
            return;
        }
        xgy xgyVar = this.N;
        if (xgyVar != null) {
            xgyVar.d();
        }
        M(this.M);
        xgy J = J();
        int i3 = xgy.F;
        J.h(null);
        StickersView stickersView = this.C;
        (stickersView != null ? stickersView : null).g(i2);
    }

    @Override // xsna.ify.a
    public final void x0(int i2) {
        StickersView stickersView = this.C;
        if (stickersView == null) {
            stickersView = null;
        }
        stickersView.setVisibility(0);
        View view = this.F;
        if (view != null) {
            view.setVisibility(0);
        }
        K(this.L);
        M(this.M);
        this.S = K(this.N);
        ChatFragment.k kVar = this.K;
        (kVar != null ? kVar : null).e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // xsna.rnv
    public final void y() {
        WriteBar writeBar = this.t;
        if (writeBar == null) {
            writeBar = null;
        }
        writeBar.setText("");
        WriteBar writeBar2 = this.t;
        if (writeBar2 == null) {
            writeBar2 = null;
        }
        writeBar2.F();
        WriteBar writeBar3 = this.t;
        if (writeBar3 == null) {
            writeBar3 = null;
        }
        writeBar3.E.a().i();
        WriteBar writeBar4 = this.t;
        if (writeBar4 == null) {
            writeBar4 = null;
        }
        writeBar4.L();
        WriteBar writeBar5 = this.t;
        (writeBar5 != null ? writeBar5 : null).setQuickStickerSuggestState(QuickStickerSuggestState.DISABLED);
    }

    @Override // xsna.rnv
    public final void z() {
        xgy xgyVar = this.N;
        if (xgyVar != null) {
            xgyVar.d();
        }
        WriteBar writeBar = this.t;
        if (writeBar == null) {
            writeBar = null;
        }
        writeBar.setBotKeyboardAllowed(false);
    }

    /* compiled from: MsgSendVc.kt */
    public final class a implements vu4.a {
        public InputFilter[] b = new InputFilter[0];

        public a() {
        }

        @Override // xsna.vu4.a
        public final void I() {
            kz30 kz30Var = kz30.this;
            RichEditText richEditText = kz30Var.B;
            if (richEditText == null) {
                richEditText = null;
            }
            this.b = richEditText.getFilters();
            RichEditText richEditText2 = kz30Var.B;
            if (richEditText2 == null) {
                richEditText2 = null;
            }
            richEditText2.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(0)});
            ChatFragment.k kVar = kz30Var.K;
            if (kVar == null) {
                kVar = null;
            }
            kVar.g(true);
            WriteBar writeBar = kz30Var.t;
            (writeBar != null ? writeBar : null).setQuickStickerSuggestState(QuickStickerSuggestState.DISABLED);
        }

        @Override // xsna.vu4.a
        public final void Z() {
            ChatFragment.k kVar = kz30.this.K;
            if (kVar == null) {
                kVar = null;
            }
            kVar.getClass();
            ezi0.b bVar = ezi0.d;
            ChatFragment chatFragment = ChatFragment.this;
            ChatFragment.d dVar = ChatFragment.w1;
            bVar.a(chatFragment.io(), chatFragment.no().b, chatFragment.ho(), ComposingType.AUDIO);
        }

        @Override // xsna.vu4.a
        public final boolean a0() {
            return false;
        }

        @Override // xsna.vu4.a
        public final void i1(AttachAudioMsg attachAudioMsg) {
            kz30.this.V((PendingAudioMessageAttachment) wdw.b(attachAudioMsg, null, false, 6), ly30.f);
        }

        @Override // xsna.vu4.a
        public final void onDismiss() {
            kz30 kz30Var = kz30.this;
            RichEditText richEditText = kz30Var.B;
            if (richEditText == null) {
                richEditText = null;
            }
            richEditText.setFilters(this.b);
            ChatFragment.k kVar = kz30Var.K;
            (kVar != null ? kVar : null).g(false);
            kz30Var.E();
        }

        @Override // xsna.vu4.a
        public final void r1(AttachAudioMsg attachAudioMsg) {
            kz30.S(kz30.this, Collections.singletonList((PendingAudioMessageAttachment) wdw.b(attachAudioMsg, null, false, 6)), 2);
        }

        @Override // xsna.vu4.a
        public final void s2(AttachAudioMsg attachAudioMsg, qc qcVar) {
            kz30 kz30Var = kz30.this;
            kz30Var.Q(new nn4(kz30Var, attachAudioMsg, qcVar, 5));
        }

        @Override // xsna.vu4.a
        public final void g() {
        }

        @Override // xsna.vu4.a
        public final void h1() {
        }

        @Override // xsna.vu4.a
        public final void p0() {
        }
    }

    /* compiled from: MsgSendVc.kt */
    public final class b implements xgy.b {
        public Long b;

        public b() {
        }

        @Override // xsna.xgy.b
        public final void E(boolean z, xgy xgyVar) {
            kz30 kz30Var = kz30.this;
            if (xgyVar.equals(kz30Var.L)) {
                this.b = Long.valueOf(SystemClock.uptimeMillis());
                WriteBar writeBar = kz30Var.t;
                if (writeBar == null) {
                    writeBar = null;
                }
                writeBar.o0(kz30Var.g.f(R.attr.vk_ui_text_accent));
                WriteBar writeBar2 = kz30Var.t;
                (writeBar2 != null ? writeBar2 : null).z.c(R.id.writebar_bot_keyboard, R.attr.im_ic_bot_keyboard, a());
                return;
            }
            if (xgyVar.equals(kz30Var.N)) {
                WriteBar writeBar3 = kz30Var.t;
                if (writeBar3 == null) {
                    writeBar3 = null;
                }
                writeBar3.z.c(R.id.writebar_bot_keyboard, R.attr.im_ic_bot_keyboard, kz30Var.g.f(R.attr.vk_ui_text_accent));
                WriteBar writeBar4 = kz30Var.t;
                (writeBar4 != null ? writeBar4 : null).o0(a());
            }
        }

        public final int a() {
            boolean M = dhr0.M();
            kz30 kz30Var = kz30.this;
            if (M) {
                WriteBar writeBar = kz30Var.t;
                return (writeBar != null ? writeBar : null).getContext().getColor(R.color.vk_gray_400);
            }
            WriteBar writeBar2 = kz30Var.t;
            return (writeBar2 != null ? writeBar2 : null).getContext().getColor(R.color.vk_steel_gray_300);
        }

        @Override // xsna.xgy.b
        public final void q(xgy xgyVar) {
            kz30 kz30Var = kz30.this;
            if (xgyVar.equals(kz30Var.L)) {
                WriteBar writeBar = kz30Var.t;
                if (writeBar == null) {
                    writeBar = null;
                }
                writeBar.o0(a());
                Long l = this.b;
                if (l != null) {
                    ((k0w) kz30Var.Z.getValue()).l(kz30Var.e, SystemClock.uptimeMillis() - l.longValue());
                }
                this.b = null;
            }
            if (xgyVar.equals(kz30Var.N)) {
                WriteBar writeBar2 = kz30Var.t;
                if (writeBar2 == null) {
                    writeBar2 = null;
                }
                writeBar2.z.c(R.id.writebar_bot_keyboard, R.attr.im_ic_bot_keyboard, a());
            }
            ChatFragment.k kVar = kz30Var.K;
            if (kVar == null) {
                kVar = null;
            }
            kVar.e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            WriteBar writeBar3 = kz30Var.t;
            (writeBar3 != null ? writeBar3 : null).n(false);
        }

        @Override // xsna.xgy.b
        public final void D() {
        }
    }
}
