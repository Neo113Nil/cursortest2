package xsna;

import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class cp30 implements ir30 {
    public final Msg b;
    public final AdapterEntryType c;
    public final aeg d;

    /* compiled from: ChatListPartModels.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdapterEntryType.values().length];
            try {
                iArr[AdapterEntryType.TYPE_PHOTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdapterEntryType.TYPE_CHANNEL_ATTACH_STUB_PHOTO_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdapterEntryType.TYPE_GIF_AUTOPLAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdapterEntryType.TYPE_DOC_PREVIEW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AdapterEntryType.TYPE_CHANNEL_ATTACH_STUB_DOC_PREVIEW.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AdapterEntryType.TYPE_POLL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AdapterEntryType.TYPE_BOX_PHOTO_VIDEO.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AdapterEntryType.TYPE_AUDIO.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[AdapterEntryType.TYPE_CHANNEL_ATTACH_STUB_AUDIO.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[AdapterEntryType.TYPE_ARTIST.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[AdapterEntryType.TYPE_PLAYLIST.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[AdapterEntryType.TYPE_PUBLIC_VIDEO.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public cp30(Msg msg, AdapterEntryType adapterEntryType, aeg aegVar) {
        this.b = msg;
        this.c = adapterEntryType;
        this.d = aegVar;
    }

    @Override // xsna.ir30
    public final Attach a() {
        return null;
    }

    @Override // xsna.ir30
    public final ir30 b(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        return c(gVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        if (((xsna.j4w) r4).C != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final cp30 c(com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar) {
        AdapterEntryType l = gVar != null ? gVar.l() : null;
        boolean z = false;
        switch (l == null ? -1 : a.$EnumSwitchMapping$0[l.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                break;
            case 12:
                if (gVar instanceof nsr0) {
                    ir30 ir30Var = ((nsr0) gVar).c;
                    if (ir30Var instanceof bs30) {
                        wp10 wp10Var = ((bs30) ir30Var).c;
                        if (wp10Var instanceof j4w) {
                            break;
                        }
                    }
                }
                break;
            default:
                z = true;
                break;
        }
        aeg aegVar = this.d;
        if (aegVar.b != z) {
            return new cp30(this.b, this.c, new aeg(aegVar.a, z));
        }
        return this;
    }

    @Override // xsna.ir30
    public final ir30 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        return c(gVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cp30)) {
            return false;
        }
        cp30 cp30Var = (cp30) obj;
        return epx.f(this.b, cp30Var.b) && this.c == cp30Var.c && epx.f(this.d, cp30Var.d);
    }

    public final int hashCode() {
        Msg msg = this.b;
        return this.d.hashCode() + pm0.c(this.c, (msg == null ? 0 : msg.hashCode()) * 31, 31);
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.c;
    }

    public final String toString() {
        return "MsgPartCommentsButtonHolderItem(msg=" + this.b + ", viewType=" + this.c + ", info=" + this.d + ')';
    }

    @Override // xsna.ir30
    @CheckResult
    public final ir30 n(oh30 oh30Var) {
        return this;
    }

    @Override // xsna.ir30
    @CheckResult
    public final ir30 u(boolean z) {
        return this;
    }

    @Override // xsna.ir30
    @CheckResult
    public final ir30 d0(Boolean bool, Boolean bool2) {
        return this;
    }

    @Override // xsna.ir30
    @CheckResult
    public final ir30 s(ProfilesInfo profilesInfo, uk30 uk30Var) {
        return this;
    }
}
