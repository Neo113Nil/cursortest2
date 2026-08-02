package xsna;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.method.KeyListener;
import android.view.View;
import android.view.Window;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.messages.MsgTextFormat;
import com.vk.dto.messages.WritePermission;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.users.User;
import com.vk.im.ui.components.viewcontrollers.msg_send.MsgSendHidePopupsReason;
import com.vk.im.ui.views.RichEditText;
import com.vk.im.ui.views.WriteBarDisabled;
import com.vk.im.ui.views.avatars.ImAvatarView;
import com.vk.stickers.ContextUser;
import com.vk.stickers.autosuggest.QuickStickerSuggestState;
import com.vk.stickers.bridge.GiftData;
import com.vk.stickers.keyboard.StickersView;
import com.vk.stickers.keyboard.b;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.ify;
import xsna.xey;
import xsna.xgy;

/* compiled from: ChatClipsMsgSendVc.kt */
/* loaded from: classes2.dex */
public final class oob implements rnv<MsgFromUser, ly30, oz30<MsgFromUser, ly30>>, ify.a, xey.a {
    public static final int N = iah0.a(110);
    public xgy A;
    public final e4w D;
    public com.vk.movika.sdk.base.ui.f G;
    public TextUtils.TruncateAt H;
    public KeyListener I;
    public boolean L;
    public boolean M;
    public final a1w b;
    public final mxv c;
    public final bc6 d;
    public final Window e;
    public final long f;
    public final zdw g;
    public final kkm h;
    public boolean j;
    public final Activity k;
    public DialogExt l;
    public ContextUser p;
    public WriteBar q;
    public View r;
    public WriteBarDisabled s;
    public View t;
    public View u;
    public RichEditText v;
    public StickersView w;
    public ImAvatarView x;
    public View y;
    public tob z;
    public final tb i = new tb(this, 25);
    public final LinkedHashSet m = new LinkedHashSet();
    public b n = b.NORMAL;
    public final io.reactivex.rxjava3.disposables.b o = new io.reactivex.rxjava3.disposables.b();
    public final a B = new a();
    public final Object C = msy.a(LazyThreadSafetyMode.NONE, new defpackage.i(this, 16));
    public final Handler E = new Handler(Looper.getMainLooper());
    public final bpn0 F = new bpn0(new defpackage.j(this, 14));
    public final bpn0 J = new bpn0(new defpackage.k(this, 10));
    public final bpn0 K = new bpn0(new com.vk.movika.sdk.android.defaultplayer.interactive.a(this, 15));

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ChatClipsMsgSendVc.kt */
    public static final class b {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b DISABLED;
        public static final b KICKED;
        public static final b LEFT;
        public static final b NORMAL;

        static {
            b bVar = new b("NORMAL", 0);
            NORMAL = bVar;
            b bVar2 = new b("KICKED", 1);
            KICKED = bVar2;
            b bVar3 = new b("LEFT", 2);
            LEFT = bVar3;
            b bVar4 = new b("DISABLED", 3);
            DISABLED = bVar4;
            b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
            $VALUES = bVarArr;
            $ENTRIES = new asp(bVarArr);
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    /* compiled from: ChatClipsMsgSendVc.kt */
    public static final /* synthetic */ class c {
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
                iArr[Peer.Type.EMAIL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Peer.Type.CHANNEL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Peer.Type.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[WritePermission.State.values().length];
            try {
                iArr2[WritePermission.State.DISABLED_RESTRICTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[WritePermission.State.DISABLED_RESTRICTED_TO_ALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[WritePermission.State.DISABLED_BROADCAST.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[WritePermission.State.DISABLED_SENDER_KICKED.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[WritePermission.State.DISABLED_SENDER_LEFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[WritePermission.State.DISABLED_SENDER_FORBIDDEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[WritePermission.State.DISABLED_RECEIVER_PRIVACY_SETTINGS.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[WritePermission.State.DISABLED_RECEIVER_PERMISSION_REQUIRED.ordinal()] = 8;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[WritePermission.State.DISABLED_RECEIVER_ACCESS_DENIED.ordinal()] = 9;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[WritePermission.State.DISABLED_RECEIVER_MSG_NOT_ENABLED.ordinal()] = 10;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[WritePermission.State.DISABLED_RECEIVER_DELETED.ordinal()] = 11;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[WritePermission.State.DISABLED_UNAVAILABLE.ordinal()] = 12;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[WritePermission.State.DISABLED_UNKNOWN.ordinal()] = 13;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[WritePermission.State.DISABLED_DUE_SPAM.ordinal()] = 14;
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[b.values().length];
            try {
                iArr3[b.DISABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr3[b.KICKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public oob(a1w a1wVar, mxv mxvVar, bc6 bc6Var, Window window, long j, zdw zdwVar, kkm kkmVar) {
        this.b = a1wVar;
        this.c = mxvVar;
        this.d = bc6Var;
        this.e = window;
        this.f = j;
        this.g = zdwVar;
        this.h = kkmVar;
        this.k = e3m.h(bc6Var.a);
        this.l = new DialogExt(j, (ProfilesInfo) null, 2, (zcl) null);
        this.D = new e4w(zdwVar);
    }

    public final xgy E() {
        xgy xgyVar = this.A;
        if (xgyVar != null) {
            return xgyVar;
        }
        View view = this.r;
        View view2 = view == null ? null : view;
        StickersView stickersView = this.w;
        StickersView stickersView2 = stickersView == null ? null : stickersView;
        Window window = this.e;
        Activity activity = this.k;
        xgy xgyVar2 = new xgy(activity, view2, stickersView2, window == null ? activity.getWindow() : window, new z8(this, 2), 80);
        WriteBar writeBar = this.q;
        if (writeBar == null) {
            writeBar = null;
        }
        xgyVar2.a(writeBar.getEmojiAnchor(), 0);
        xgyVar2.o = this.B;
        this.A = xgyVar2;
        View decorView = window != null ? window.getDecorView() : null;
        xgy xgyVar3 = this.A;
        if (decorView != null && xgyVar3 != null) {
            this.h.getClass();
            dhr0.W(decorView);
        }
        return xgyVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F() {
        com.vk.stickers.keyboard.b bVar;
        com.vk.stickers.keyboard.b c1798c;
        UserId userId = new UserId(this.f);
        Dialog Cb = this.l.Cb();
        Peer.Type bc = Cb != null ? Cb.bc() : null;
        switch (bc == null ? -1 : c.$EnumSwitchMapping$0[bc.ordinal()]) {
            case -1:
                bVar = b.c.C1799b.a;
                StickersView stickersView = this.w;
                (stickersView != null ? stickersView : null).setStickersKeyboardContext(bVar);
                return;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                c1798c = new b.c.a.C1798c(userId);
                bVar = c1798c;
                StickersView stickersView2 = this.w;
                (stickersView2 != null ? stickersView2 : null).setStickersKeyboardContext(bVar);
                return;
            case 2:
                c1798c = new b.c.a.C1798c(userId);
                bVar = c1798c;
                StickersView stickersView22 = this.w;
                (stickersView22 != null ? stickersView22 : null).setStickersKeyboardContext(bVar);
                return;
            case 3:
                c1798c = new b.c.a.C1796a(userId);
                bVar = c1798c;
                StickersView stickersView222 = this.w;
                (stickersView222 != null ? stickersView222 : null).setStickersKeyboardContext(bVar);
                return;
            case 4:
                c1798c = new b.c.a.C1797b(userId);
                bVar = c1798c;
                StickersView stickersView2222 = this.w;
                (stickersView2222 != null ? stickersView2222 : null).setStickersKeyboardContext(bVar);
                return;
            case 5:
                bVar = b.c.C1799b.a;
                StickersView stickersView22222 = this.w;
                (stickersView22222 != null ? stickersView22222 : null).setStickersKeyboardContext(bVar);
                return;
            case 6:
                bVar = b.c.C1799b.a;
                StickersView stickersView222222 = this.w;
                (stickersView222222 != null ? stickersView222222 : null).setStickersKeyboardContext(bVar);
                return;
            case 7:
                bVar = b.c.C1799b.a;
                StickersView stickersView2222222 = this.w;
                (stickersView2222222 != null ? stickersView2222222 : null).setStickersKeyboardContext(bVar);
                return;
        }
    }

    public final void G(ly30 ly30Var) {
        RichEditText richEditText = this.v;
        if (richEditText == null) {
            richEditText = null;
        }
        c9s f = f(richEditText.getEditableText());
        String obj = f.a.toString();
        MsgTextFormat msgTextFormat = f.b;
        WriteBar writeBar = this.q;
        if (writeBar == null) {
            writeBar = null;
        }
        writeBar.setStickersSuggestEnabled(false);
        y();
        tob tobVar = this.z;
        oz30.c(tobVar == null ? null : tobVar, 0, obj, msgTextFormat, null, null, null, null, null, ly30Var, 249);
    }

    public final void H(String str, MsgTextFormat msgTextFormat) {
        CharSequence a2 = s420.a(str);
        r040 r040Var = (r040) this.K.getValue();
        if (msgTextFormat == null) {
            msgTextFormat = MsgTextFormat.d;
        }
        CharSequence a3 = r040Var.a(a2, msgTextFormat);
        WriteBar writeBar = this.q;
        if (writeBar == null) {
            writeBar = null;
        }
        writeBar.setText(a3);
        RichEditText richEditText = this.v;
        RichEditText richEditText2 = richEditText == null ? null : richEditText;
        Editable text = (richEditText != null ? richEditText : null).getText();
        richEditText2.setSelection(text != null ? text.length() : 0);
    }

    public final void I() {
        sob sobVar = new sob(this);
        StickersView stickersView = this.w;
        if (stickersView == null) {
            stickersView = null;
        }
        stickersView.setListener(sobVar);
        WriteBar writeBar = this.q;
        if (writeBar == null) {
            writeBar = null;
        }
        writeBar.setAutoSuggestPopupListener(sobVar);
        WriteBar writeBar2 = this.q;
        if (writeBar2 == null) {
            writeBar2 = null;
        }
        writeBar2.setWriteBarSendListener(new qob(this));
        WriteBar writeBar3 = this.q;
        if (writeBar3 == null) {
            writeBar3 = null;
        }
        writeBar3.setWriteBarInputListener(new rob(this));
        WriteBar writeBar4 = this.q;
        if (writeBar4 == null) {
            writeBar4 = null;
        }
        writeBar4.setWriteBarStickersListener(new ezt0(this));
        WriteBar writeBar5 = this.q;
        if (writeBar5 == null) {
            writeBar5 = null;
        }
        writeBar5.setWriteBarAttachesListener(new xla(this));
        int i = ify.a;
        ify.a(this);
        tob tobVar = this.z;
        (tobVar != null ? tobVar : null).getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J(b bVar) {
        boolean z;
        WriteBar writeBar;
        WriteBar writeBar2;
        WriteBar writeBar3;
        WriteBar writeBar4;
        StickersView stickersView;
        WriteBar writeBar5;
        int i;
        WriteBar writeBar6;
        WriteBarDisabled writeBarDisabled;
        WriteBarDisabled writeBarDisabled2;
        Context applicationContext;
        Dialog Cb;
        WritePermission.State state;
        WriteBarDisabled writeBarDisabled3;
        Object[] objArr;
        int i2;
        String string;
        WriteBarDisabled writeBarDisabled4;
        WritePermission oc;
        ChatSettings Hb;
        WritePermission oc2;
        ChatSettings Hb2;
        this.n = bVar;
        boolean contains = rl3.y0(new b[]{b.NORMAL, b.LEFT}).contains(bVar);
        boolean b2 = o25.b(o25.a());
        LinkedHashSet linkedHashSet = this.m;
        if (!b2 && !linkedHashSet.isEmpty()) {
            if (!linkedHashSet.isEmpty()) {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    if (com.vk.dto.common.b.a(((UserId) it.next()).b)) {
                        break;
                    }
                }
            }
            Dialog Cb2 = this.l.Cb();
            if (Cb2 != null && !Cb2.Jc()) {
                z = true;
                writeBar = this.q;
                if (writeBar == null) {
                    writeBar = null;
                }
                writeBar.setStickersSuggestEnabled(contains);
                writeBar2 = this.q;
                if (writeBar2 == null) {
                    writeBar2 = null;
                }
                boolean z2 = !contains && z;
                Dialog Cb3 = this.l.Cb();
                boolean z3 = Cb3 == null && Cb3.Db();
                Dialog Cb4 = this.l.Cb();
                writeBar2.X(linkedHashSet, z2, z3, Cb4 == null && Cb4.t1());
                writeBar3 = this.q;
                if (writeBar3 == null) {
                    writeBar3 = null;
                }
                Dialog Cb5 = this.l.Cb();
                writeBar3.setDialogId(Cb5 == null ? Cb5.Sb().longValue() : this.f);
                writeBar4 = this.q;
                if (writeBar4 == null) {
                    writeBar4 = null;
                }
                Dialog Cb6 = this.l.Cb();
                writeBar4.setDialogTitle((Cb6 != null || (Hb2 = Cb6.Hb()) == null) ? null : Hb2.b);
                stickersView = this.w;
                if (stickersView == null) {
                    stickersView = null;
                }
                stickersView.setStickersEnabled(contains);
                writeBar5 = this.q;
                if (writeBar5 == null) {
                    writeBar5 = null;
                }
                writeBar5.setQuickStickerSuggestState(QuickStickerSuggestState.DISABLED);
                i = c.$EnumSwitchMapping$2[this.n.ordinal()];
                if (i == 1 && i != 2) {
                    WriteBar writeBar7 = this.q;
                    if (writeBar7 == null) {
                        writeBar7 = null;
                    }
                    writeBar7.setVisibility(0);
                    WriteBarDisabled writeBarDisabled5 = this.s;
                    if (writeBarDisabled5 == null) {
                        writeBarDisabled5 = null;
                    }
                    writeBarDisabled5.setVisibility(8);
                    RichEditText richEditText = this.v;
                    if (richEditText == null) {
                        richEditText = null;
                    }
                    richEditText.setFilters(new InputFilter[0]);
                    WriteBar writeBar8 = this.q;
                    if (writeBar8 == null) {
                        writeBar8 = null;
                    }
                    writeBar8.Z();
                    WriteBar writeBar9 = this.q;
                    (writeBar9 != null ? writeBar9 : null).setIsSendButtonAlwaysEnabled(false);
                    return;
                }
                writeBar6 = this.q;
                if (writeBar6 == null) {
                    writeBar6 = null;
                }
                writeBar6.setVisibility(8);
                writeBarDisabled = this.s;
                if (writeBarDisabled == null) {
                    writeBarDisabled = null;
                }
                writeBarDisabled.setVisibility(0);
                Dialog Cb7 = this.l.Cb();
                WritePermission.State state2 = (Cb7 != null || (oc2 = Cb7.oc()) == null) ? null : oc2.a;
                int i3 = state2 != null ? -1 : c.$EnumSwitchMapping$1[state2.ordinal()];
                Integer valueOf = (i3 != 1 || i3 == 2 || i3 == 3) ? null : Integer.valueOf(R.drawable.vk_icon_error_circle_outline_32);
                writeBarDisabled2 = this.s;
                if (writeBarDisabled2 == null) {
                    writeBarDisabled2 = null;
                }
                Activity activity = this.k;
                applicationContext = activity.getApplicationContext();
                Cb = this.l.Cb();
                if (Cb == null && (Hb = Cb.Hb()) != null && Hb.J) {
                    string = applicationContext.getString(R.string.vkim_msg_write_disabled_chat_deleted);
                    writeBarDisabled3 = writeBarDisabled2;
                } else {
                    Dialog Cb8 = this.l.Cb();
                    WritePermission oc3 = Cb8 == null ? Cb8.oc() : null;
                    state = oc3 == null ? oc3.a : null;
                    switch (state != null ? -1 : c.$EnumSwitchMapping$1[state.ordinal()]) {
                        case 1:
                            writeBarDisabled3 = writeBarDisabled2;
                            long j = oc3.b;
                            if (j != -1) {
                                Date date = new Date(j * 1000);
                                objArr = new Object[]{new SimpleDateFormat("dd", Locale.getDefault()).format(date), new SimpleDateFormat("MMMM", Locale.getDefault()).format(date), new SimpleDateFormat("HH:mm", Locale.getDefault()).format(date)};
                                i2 = R.string.vkim_msg_write_disabled_restricted;
                                break;
                            } else {
                                i2 = R.string.vkim_msg_write_disabled_restricted_forever;
                                objArr = null;
                                break;
                            }
                        case 2:
                            Dialog Cb9 = this.l.Cb();
                            ChatSettings Hb3 = Cb9 != null ? Cb9.Hb() : null;
                            if (Hb3 != null) {
                                long j2 = Hb3.I;
                                if (j2 >= 1) {
                                    writeBarDisabled3 = writeBarDisabled2;
                                    Date date2 = new Date(j2 * 1000);
                                    objArr = new Object[]{new SimpleDateFormat("dd", Locale.getDefault()).format(date2), new SimpleDateFormat("MMMM", Locale.getDefault()).format(date2), new SimpleDateFormat("HH:mm", Locale.getDefault()).format(date2)};
                                    i2 = R.string.vkim_msg_write_disabled_restricted_to_all;
                                    break;
                                }
                            }
                            writeBarDisabled3 = writeBarDisabled2;
                            i2 = R.string.vkim_msg_write_disabled_restricted_to_all_forever;
                            objArr = null;
                            break;
                        case 3:
                        case 13:
                        default:
                            i2 = R.string.vkim_msg_write_disabled_unknown;
                            writeBarDisabled3 = writeBarDisabled2;
                            objArr = null;
                            break;
                        case 4:
                            i2 = R.string.vkim_msg_write_disabled_sender_kicked;
                            writeBarDisabled3 = writeBarDisabled2;
                            objArr = null;
                            break;
                        case 5:
                            i2 = R.string.vkim_msg_write_disabled_sender_left;
                            writeBarDisabled3 = writeBarDisabled2;
                            objArr = null;
                            break;
                        case 6:
                            i2 = R.string.vkim_msg_write_disabled_sender_forbidden;
                            writeBarDisabled3 = writeBarDisabled2;
                            objArr = null;
                            break;
                        case 7:
                            i2 = R.string.vkim_msg_write_disabled_receiver_privacy_settings;
                            writeBarDisabled3 = writeBarDisabled2;
                            objArr = null;
                            break;
                        case 8:
                            i2 = R.string.vkim_msg_write_disabled_receiver_permission_required;
                            writeBarDisabled3 = writeBarDisabled2;
                            objArr = null;
                            break;
                        case 9:
                            i2 = R.string.vkim_msg_write_disabled_receiver_access_denied;
                            writeBarDisabled3 = writeBarDisabled2;
                            objArr = null;
                            break;
                        case 10:
                            i2 = R.string.vkim_msg_write_disabled_receiver_msg_not_enabled;
                            writeBarDisabled3 = writeBarDisabled2;
                            objArr = null;
                            break;
                        case 11:
                            i2 = R.string.vkim_msg_write_disabled_receiver_deleted_or_banned;
                            writeBarDisabled3 = writeBarDisabled2;
                            objArr = null;
                            break;
                        case 12:
                            i2 = R.string.vkim_msg_write_disabled_unavailable;
                            writeBarDisabled3 = writeBarDisabled2;
                            objArr = null;
                            break;
                        case 14:
                            i2 = R.string.vkim_msg_write_disabled_due_spam;
                            writeBarDisabled3 = writeBarDisabled2;
                            objArr = null;
                            break;
                    }
                    string = objArr != null ? applicationContext.getString(i2) : applicationContext.getString(i2, Arrays.copyOf(objArr, objArr.length));
                }
                Dialog Cb10 = this.l.Cb();
                WritePermission.State state3 = (Cb10 != null || (oc = Cb10.oc()) == null) ? null : oc.a;
                writeBarDisabled3.b(string, valueOf, (state3 != null ? -1 : c.$EnumSwitchMapping$1[state3.ordinal()]) != 3 ? WriteBarDisabled.Reason.INFO : WriteBarDisabled.Reason.WARNING);
                writeBarDisabled4 = this.s;
                if (writeBarDisabled4 == null) {
                    writeBarDisabled4 = null;
                }
                writeBarDisabled4.setOnClickListener(null);
                mhy.b(activity);
            }
        }
        z = false;
        writeBar = this.q;
        if (writeBar == null) {
        }
        writeBar.setStickersSuggestEnabled(contains);
        writeBar2 = this.q;
        if (writeBar2 == null) {
        }
        if (contains) {
        }
        Dialog Cb32 = this.l.Cb();
        if (Cb32 == null) {
        }
        Dialog Cb42 = this.l.Cb();
        writeBar2.X(linkedHashSet, z2, z3, Cb42 == null && Cb42.t1());
        writeBar3 = this.q;
        if (writeBar3 == null) {
        }
        Dialog Cb52 = this.l.Cb();
        writeBar3.setDialogId(Cb52 == null ? Cb52.Sb().longValue() : this.f);
        writeBar4 = this.q;
        if (writeBar4 == null) {
        }
        Dialog Cb62 = this.l.Cb();
        writeBar4.setDialogTitle((Cb62 != null || (Hb2 = Cb62.Hb()) == null) ? null : Hb2.b);
        stickersView = this.w;
        if (stickersView == null) {
        }
        stickersView.setStickersEnabled(contains);
        writeBar5 = this.q;
        if (writeBar5 == null) {
        }
        writeBar5.setQuickStickerSuggestState(QuickStickerSuggestState.DISABLED);
        i = c.$EnumSwitchMapping$2[this.n.ordinal()];
        if (i == 1) {
        }
        writeBar6 = this.q;
        if (writeBar6 == null) {
        }
        writeBar6.setVisibility(8);
        writeBarDisabled = this.s;
        if (writeBarDisabled == null) {
        }
        writeBarDisabled.setVisibility(0);
        Dialog Cb72 = this.l.Cb();
        if (Cb72 != null) {
        }
        if (state2 != null) {
        }
        if (i3 != 1) {
        }
        writeBarDisabled2 = this.s;
        if (writeBarDisabled2 == null) {
        }
        Activity activity2 = this.k;
        applicationContext = activity2.getApplicationContext();
        Cb = this.l.Cb();
        if (Cb == null) {
        }
        Dialog Cb82 = this.l.Cb();
        if (Cb82 == null) {
        }
        if (oc3 == null) {
        }
        switch (state != null ? -1 : c.$EnumSwitchMapping$1[state.ordinal()]) {
        }
        string = objArr != null ? applicationContext.getString(i2) : applicationContext.getString(i2, Arrays.copyOf(objArr, objArr.length));
        Dialog Cb102 = this.l.Cb();
        if (Cb102 != null) {
        }
        writeBarDisabled3.b(string, valueOf, (state3 != null ? -1 : c.$EnumSwitchMapping$1[state3.ordinal()]) != 3 ? WriteBarDisabled.Reason.INFO : WriteBarDisabled.Reason.WARNING);
        writeBarDisabled4 = this.s;
        if (writeBarDisabled4 == null) {
        }
        writeBarDisabled4.setOnClickListener(null);
        mhy.b(activity2);
    }

    @Override // xsna.rnv
    public final void L() {
        this.D.a();
        this.E.removeCallbacksAndMessages(null);
        this.o.e();
        int i = ify.a;
        ify.g(this);
        tob tobVar = this.z;
        (tobVar != null ? tobVar : null).getClass();
    }

    @Override // xsna.xey.a
    public final void c() {
        View view = this.u;
        if (view == null) {
            view = null;
        }
        view.setClickable(false);
    }

    @Override // xsna.xey.a
    public final void d() {
        this.M = false;
        View view = this.y;
        if (view != null) {
            view.setVisibility(8);
        }
        tob tobVar = this.z;
        if (tobVar == null) {
            tobVar = null;
        }
        tobVar.getClass();
        View view2 = this.u;
        (view2 != null ? view2 : null).setClickable(true);
    }

    @Override // xsna.xey.a
    public final void e() {
        View view;
        if (this.M || (view = this.y) == null) {
            return;
        }
        view.setVisibility(0);
    }

    public final c9s f(Editable editable) {
        String str;
        if (editable == null) {
            RichEditText richEditText = this.v;
            return new c9s(drm0.p0((richEditText != null ? richEditText : null).getEditableText()), MsgTextFormat.d);
        }
        CharSequence a2 = yh30.a(editable);
        Editable editable2 = a2 instanceof Editable ? (Editable) a2 : null;
        MsgTextFormat b2 = ((p040) this.J.getValue()).b(editable2);
        if (editable2 == null || (str = editable2.toString()) == null) {
            str = "";
        }
        return new c9s(str, b2);
    }

    @Override // xsna.rnv
    public final String getText() {
        RichEditText richEditText = this.v;
        if (richEditText == null) {
            richEditText = null;
        }
        return String.valueOf(richEditText.getText());
    }

    @Override // xsna.rnv
    public final void h(MsgSendHidePopupsReason msgSendHidePopupsReason) {
        xgy xgyVar = this.A;
        if (xgyVar != null && xgyVar.e()) {
            xgyVar.d();
            s3q0 s3q0Var = s3q0.a;
        }
        WriteBar writeBar = this.q;
        if (writeBar == null) {
            writeBar = null;
        }
        writeBar.n(false);
    }

    @Override // xsna.rnv
    public final void onPause() {
        this.D.a();
        WriteBar writeBar = this.q;
        if (writeBar == null) {
            writeBar = null;
        }
        writeBar.getState().f = false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.rnv
    public final void onResume() {
        ?? r0 = this.C;
        if (r0.isInitialized()) {
            ((e140) r0.getValue()).e();
        }
        WriteBar writeBar = this.q;
        if (writeBar == null) {
            writeBar = null;
        }
        writeBar.getState().f = true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.rnv
    public final void onStop() {
        ?? r0 = this.C;
        if (r0.isInitialized()) {
            ((e140) r0.getValue()).e();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ba  */
    @Override // xsna.rnv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(DialogExt dialogExt) {
        Object obj;
        ContextUser contextUser;
        WriteBar writeBar;
        ImAvatarView imAvatarView;
        WriteBar writeBar2;
        ProfilesInfo profilesInfo = dialogExt.b;
        Dialog Cb = dialogExt.Cb();
        if (Cb == null) {
            return;
        }
        this.l = dialogExt;
        WritePermission.State state = Cb.oc().a;
        ChatSettings Hb = Cb.Hb();
        J((Hb == null || !Hb.J) ? state == WritePermission.State.ENABLED ? b.NORMAL : state == WritePermission.State.DISABLED_SENDER_LEFT ? b.LEFT : state == WritePermission.State.DISABLED_SENDER_KICKED ? b.KICKED : b.DISABLED : b.DISABLED);
        long j = this.f;
        if (com.vk.dto.common.b.d(j) && !o25.a().a(new UserId(j))) {
            Iterator it = profilesInfo.b.c.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((User) obj).b == j) {
                        break;
                    }
                }
            }
            User user = (User) obj;
            if (user != null) {
                contextUser = new ContextUser(new UserId(user.b), user.s, user.h.Hb(h9l0.j), null, 8, null);
                this.p = contextUser;
                writeBar = this.q;
                if (writeBar == null) {
                    writeBar = null;
                }
                writeBar.setContextUser(contextUser);
                imAvatarView = this.x;
                if (imAvatarView == null) {
                    imAvatarView = null;
                }
                imAvatarView.r1(dialogExt.Cb(), profilesInfo.Ob());
                writeBar2 = this.q;
                if (writeBar2 == null) {
                    writeBar2 = null;
                }
                View view = this.r;
                writeBar2.setPlaceholderHint((view != null ? view : null).getContext().getString(R.string.im_chat_clips_reply_to));
            }
        }
        contextUser = null;
        this.p = contextUser;
        writeBar = this.q;
        if (writeBar == null) {
        }
        writeBar.setContextUser(contextUser);
        imAvatarView = this.x;
        if (imAvatarView == null) {
        }
        imAvatarView.r1(dialogExt.Cb(), profilesInfo.Ob());
        writeBar2 = this.q;
        if (writeBar2 == null) {
        }
        View view2 = this.r;
        writeBar2.setPlaceholderHint((view2 != null ? view2 : null).getContext().getString(R.string.im_chat_clips_reply_to));
    }

    @Override // xsna.rnv
    public final void x(int i) {
        if (this.n != b.NORMAL) {
            this.c.getClass();
            g2v.d().a().j(this.k, i, GiftData.d, null, "message");
            return;
        }
        xgy E = E();
        int i2 = xgy.F;
        E.h(null);
        StickersView stickersView = this.w;
        (stickersView != null ? stickersView : null).g(i);
    }

    @Override // xsna.ify.a
    public final void x0(int i) {
        StickersView stickersView = this.w;
        if (stickersView == null) {
            stickersView = null;
        }
        stickersView.setVisibility(0);
        xgy xgyVar = this.A;
        if (xgyVar != null && xgyVar.e()) {
            xgyVar.d();
            s3q0 s3q0Var = s3q0.a;
        }
        tob tobVar = this.z;
        (tobVar != null ? tobVar : null).e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // xsna.rnv
    public final void y() {
        WriteBar writeBar = this.q;
        if (writeBar == null) {
            writeBar = null;
        }
        writeBar.setText("");
    }

    /* compiled from: ChatClipsMsgSendVc.kt */
    public final class a implements xgy.b {
        public a() {
        }

        @Override // xsna.xgy.b
        public final void E(boolean z, xgy xgyVar) {
            oob oobVar = oob.this;
            if (xgyVar.equals(oobVar.A)) {
                WriteBar writeBar = oobVar.q;
                if (writeBar == null) {
                    writeBar = null;
                }
                writeBar.o0(oobVar.h.f(R.attr.vk_ui_icon_accent));
                WriteBar writeBar2 = oobVar.q;
                if (writeBar2 == null) {
                    writeBar2 = null;
                }
                WriteBar writeBar3 = oobVar.q;
                writeBar2.z.c(R.id.writebar_bot_keyboard, R.attr.im_ic_bot_keyboard, (writeBar3 != null ? writeBar3 : null).getContext().getColor(R.color.vk_gray_400));
            }
        }

        @Override // xsna.xgy.b
        public final void q(xgy xgyVar) {
            oob oobVar = oob.this;
            if (xgyVar.equals(oobVar.A)) {
                WriteBar writeBar = oobVar.q;
                if (writeBar == null) {
                    writeBar = null;
                }
                WriteBar writeBar2 = oobVar.q;
                if (writeBar2 == null) {
                    writeBar2 = null;
                }
                writeBar.o0(writeBar2.getContext().getColor(R.color.vk_gray_400));
            }
            tob tobVar = oobVar.z;
            if (tobVar == null) {
                tobVar = null;
            }
            tobVar.e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            WriteBar writeBar3 = oobVar.q;
            (writeBar3 != null ? writeBar3 : null).n(false);
        }

        @Override // xsna.xgy.b
        public final void D() {
        }
    }

    @Override // xsna.ify.a
    public final void Y0() {
    }
}
