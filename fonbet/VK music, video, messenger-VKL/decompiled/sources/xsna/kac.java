package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import xsna.kac;
import xsna.q630;

/* compiled from: ChipContent.kt */
/* loaded from: classes3.dex */
public interface kac {

    /* compiled from: ChipContent.kt */
    public static final class a {
        public static final void a(final q630 q630Var, final b bVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
            int i3;
            androidx.compose.runtime.a M = aVar.M(-1790772644);
            int i4 = i2 & 1;
            if (i4 != 0) {
                i3 = i | 6;
            } else if ((i & 6) == 0) {
                i3 = (M.J(q630Var) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
            if ((i & 48) == 0) {
                i3 |= (i & 64) == 0 ? M.J(bVar) : M.y(bVar) ? 32 : 16;
            }
            if (M.t(i3 & 1, (i3 & 19) != 18)) {
                if (i4 != 0) {
                    q630Var = q630.a.a;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1790772644, i3, -1, "com.vk.music.stickyplayer.presentation.components.chips.ChipContent.ComposeDefaultImpls.Content$default (ChipContent.kt:-1)");
                }
                bVar.a(q630Var, M, i3 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new wzs() { // from class: xsna.jac
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int I = ne7.I(i | 1);
                        kac.a.a(q630.this, bVar, (androidx.compose.runtime.a) obj, I, i2);
                        return s3q0.a;
                    }
                };
            }
        }
    }

    /* compiled from: ChipContent.kt */
    public interface b extends kac {

        /* compiled from: ChipContent.kt */
        public static final class a implements b {
            public final jai a;

            public a(jai jaiVar) {
                this.a = jaiVar;
            }

            @Override // xsna.kac
            public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
                aVar.K(-684017414);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-684017414, i, -1, "com.vk.music.stickyplayer.presentation.components.chips.ChipContent.Icon.Custom.Content (ChipContent.kt:160)");
                }
                this.a.invoke(q630Var, aVar, Integer.valueOf(i & 14));
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
            }
        }

        /* compiled from: ChipContent.kt */
        /* renamed from: xsna.kac$b$b, reason: collision with other inner class name */
        public static final class C3173b implements b {
            public final rg50 a;
            public final wh50 b;
            public final wh50 c;

            public C3173b(int i, boolean z, Integer num) {
                this.a = androidx.compose.runtime.i.a(i);
                this.b = androidx.compose.runtime.k.b(num);
                this.c = androidx.compose.runtime.k.b(Boolean.valueOf(z));
            }

            @Override // xsna.kac
            public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
                aVar.K(-858286196);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-858286196, i, -1, "com.vk.music.stickyplayer.presentation.components.chips.ChipContent.Icon.Lottie.Content (ChipContent.kt:56)");
                }
                int intValue = ((wak0) this.a).getIntValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                jk2.a(intValue, ylu0Var.getIcon().c, q630Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((zak0) this.b).getValue(), null, ((Boolean) ((zak0) this.c).getValue()).booleanValue(), aVar, (i << 6) & 896, 40);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3173b)) {
                    return false;
                }
                C3173b c3173b = (C3173b) obj;
                return ((wak0) this.a).getIntValue() == ((wak0) c3173b.a).getIntValue() && ((Boolean) ((zak0) this.c).getValue()).booleanValue() == ((Boolean) ((zak0) c3173b.c).getValue()).booleanValue() && epx.f(((zak0) this.b).getValue(), ((zak0) c3173b.b).getValue());
            }

            public final int hashCode() {
                return ((zak0) this.b).getValue().hashCode() + ((Boolean.hashCode(((Boolean) ((zak0) this.c).getValue()).booleanValue()) + (((wak0) this.a).getIntValue() * 31)) * 31);
            }
        }

        /* compiled from: ChipContent.kt */
        public static final class c<S> implements b {
            public final izs<S, Integer> a;
            public final wh50 b;
            public final wh50 c;

            public c(Boolean bool, boolean z, izs izsVar) {
                this.a = izsVar;
                this.b = androidx.compose.runtime.k.b(bool);
                this.c = androidx.compose.runtime.k.b(Boolean.valueOf(z));
            }

            @Override // xsna.kac
            public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
                aVar.K(509005759);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(509005759, i, -1, "com.vk.music.stickyplayer.presentation.components.chips.ChipContent.Icon.Stateful.Content (ChipContent.kt:112)");
                }
                q630 q = txj0.q(q630Var, 20);
                Object value = ((zak0) this.b).getValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                yl2.a(value, ylu0Var.getIcon().c, this.a, q, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((Boolean) ((zak0) this.c).getValue()).booleanValue(), null, aVar, 0, 176);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return ((Boolean) ((zak0) this.c).getValue()).booleanValue() == ((Boolean) ((zak0) cVar.c).getValue()).booleanValue() && epx.f(((zak0) this.b).getValue(), ((zak0) cVar.b).getValue());
            }

            public final int hashCode() {
                int hashCode = Boolean.hashCode(((Boolean) ((zak0) this.c).getValue()).booleanValue()) * 31;
                Object value = ((zak0) this.b).getValue();
                return hashCode + (value != null ? value.hashCode() : 0);
            }
        }

        /* compiled from: ChipContent.kt */
        public static final class d implements b {
            public final lg90 a;

            public d(lg90 lg90Var) {
                this.a = lg90Var;
            }

            @Override // xsna.kac
            public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
                aVar.K(-1231350499);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1231350499, i, -1, "com.vk.music.stickyplayer.presentation.components.chips.ChipContent.Icon.Static.Content (ChipContent.kt:34)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                pzu0.b(this.a, null, q630Var, ylu0Var.getIcon().c, aVar, 56 | ((i << 6) & 896), 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Static(painter=" + this.a + ')';
            }
        }
    }

    void a(q630 q630Var, androidx.compose.runtime.a aVar, int i);
}
