package xsna;

import androidx.compose.ui.platform.ComposeView;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.profile.design.compose.buttons.ProfileButtons;
import com.vk.profile.design.compose.header.AuthorHeaderConfig;
import com.vk.profile.design.compose.header.sink.AuthorHeaderEvent;
import com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem;
import com.vk.profile.user.impl.ui.f;

/* compiled from: UserProfileLegoHeaderViewHolder.kt */
/* loaded from: classes5.dex */
public final class arq0 extends dri<UserProfileAdapterItem.j.a> {
    public static final a v = new a();
    public final slq0 n;
    public final zuq0 o;
    public final rg50 p;
    public final gwn0 q;
    public final wh50 r;
    public final wh50 s;
    public final wh50 t;
    public final wh50<Boolean> u;

    /* compiled from: UserProfileLegoHeaderViewHolder.kt */
    public static final class a extends eri<arq0> {
        @Override // xsna.eri
        public final dri a(ComposeView composeView, slq0 slq0Var, zuq0 zuq0Var) {
            return new arq0(composeView, slq0Var, zuq0Var);
        }
    }

    /* compiled from: UserProfileLegoHeaderViewHolder.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[AuthorHeaderConfig.Header.Main.Name.Default.Verification.values().length];
            try {
                iArr[AuthorHeaderConfig.Header.Main.Name.Default.Verification.Verified.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AuthorHeaderConfig.Header.Main.Name.Default.Verification.Confirmed.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ProfileButtons.ButtonType.values().length];
            try {
                iArr2[ProfileButtons.ButtonType.Write.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ProfileButtons.ButtonType.Message.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ProfileButtons.ButtonType.VKCall.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ProfileButtons.ButtonType.Subscribe.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ProfileButtons.ButtonType.BecomeFriends.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ProfileButtons.ButtonType.Advertise.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[ProfileButtons.ButtonType.BellUnChecked.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[ProfileButtons.ButtonType.BellChecked.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[ProfileButtons.ButtonType.Gift.ordinal()] = 9;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[AuthorHeaderEvent.Info.SubscribersClick.FilledAudienceClickTarget.values().length];
            try {
                iArr3[AuthorHeaderEvent.Info.SubscribersClick.FilledAudienceClickTarget.Friends.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[AuthorHeaderEvent.Info.SubscribersClick.FilledAudienceClickTarget.SharedFriends.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[AuthorHeaderEvent.Info.SubscribersClick.FilledAudienceClickTarget.Subscribers.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public arq0(ComposeView composeView, slq0 slq0Var, zuq0 zuq0Var) {
        super(composeView);
        this.n = slq0Var;
        this.o = zuq0Var;
        this.p = androidx.compose.runtime.i.a(0);
        this.q = new gwn0(this, 2);
        this.r = androidx.compose.runtime.k.b(null);
        this.s = androidx.compose.runtime.k.b(null);
        this.t = androidx.compose.runtime.k.b(null);
        this.u = androidx.compose.runtime.k.b(Boolean.FALSE);
    }

    @Override // xsna.vif0
    public final void i6(Object obj) {
        zak0 zak0Var = (zak0) this.t;
        VkContextMenu vkContextMenu = (VkContextMenu) zak0Var.getValue();
        if (vkContextMenu == null) {
            s6(false);
        } else {
            zak0Var.setValue(null);
            vkContextMenu.b();
            s6(false);
        }
        ((zak0) this.r).setValue(null);
        ((zak0) this.s).setValue(null);
        ((wak0) this.p).C(0);
    }

    @Override // xsna.dri
    public final void q6(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(1708926271);
        int i2 = (M.y(this) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1708926271, i2, -1, "com.vk.profile.user.impl.ui.adapter.holders.lego.UserProfileLegoHeaderViewHolder.Content (UserProfileLegoHeaderViewHolder.kt:70)");
            }
            rrv0.a(null, null, kai.c(340822503, new oac(this), M), M, 24576, 15);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new bh5(this, i, 17);
        }
    }

    public final void s6(boolean z) {
        ((zak0) this.u).setValue(Boolean.valueOf(z));
        this.o.B(new f.a.C1716f(!z));
    }
}
