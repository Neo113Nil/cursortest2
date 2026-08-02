package xsna;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$BalloonTilt;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.tool.onboarding.VkTooltip$MarkerStyle;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.hints.Hint;
import com.vk.libvideo.api.NotificationsPermission;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.libvideo.bottomsheet.about.delegate.o;
import com.vk.libvideo.bottomsheet.notifications.SubscriptionAction;
import com.vk.libvideo.ui.VideoAuthorView;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import java.util.HashSet;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.m8v0;
import xsna.tlo0;

/* compiled from: AboutVideoAuthorDelegate.kt */
/* loaded from: classes2.dex */
public final class w4 extends p1u0<AboutVideoItem.d> {
    public final h7v a;
    public final c4 b;
    public final NotificationsPermission c;
    public final gzs<String> d;
    public final gzs<rcg0> e;
    public final a f;
    public final String g;
    public final egs0 h;

    /* compiled from: AboutVideoAuthorDelegate.kt */
    public static final class a {
        public final int a;
        public final Integer b;
        public final VkButton.Mode c;

        public a() {
            this(null, null, 7);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.a) * 31;
            Integer num = this.b;
            return this.c.hashCode() + ((hashCode + (num == null ? 0 : num.hashCode())) * 31);
        }

        public final String toString() {
            return "UiConfig(layoutRes=" + this.a + ", verticalMargin=" + this.b + ", subscribeButtonMode=" + this.c + ')';
        }

        public a(Integer num, VkButton.Mode mode, int i) {
            int i2 = (i & 1) != 0 ? R.layout.video_about_author : R.layout.video_author_item;
            num = (i & 2) != 0 ? null : num;
            mode = (i & 4) != 0 ? VkButton.Mode.Primary : mode;
            this.a = i2;
            this.b = num;
            this.c = mode;
        }
    }

    /* compiled from: AboutVideoAuthorDelegate.kt */
    public final class b extends qf6 {
        public AboutVideoItem.d l;
        public boolean m;
        public final Object n;

        /* compiled from: AboutVideoAuthorDelegate.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[SubscriptionAction.values().length];
                try {
                    iArr[SubscriptionAction.FULLY_ENABLED_NOTIFICATIONS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SubscriptionAction.PREFERRED_VIDEOS_NOTIFICATIONS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[SubscriptionAction.DISABLED_NOTIFICATIONS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[SubscriptionAction.UNSUBSCRIBE_AUTHOR.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[SubscriptionAction.NOTIFICATIONS_PERMISSION.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[SubscriptionAction.HIDE_AUTHOR.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[VideoAuthorView.Action.values().length];
                try {
                    iArr2[VideoAuthorView.Action.Click.ordinal()] = 1;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr2[VideoAuthorView.Action.AvatarClick.ordinal()] = 2;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr2[VideoAuthorView.Action.Subscribe.ordinal()] = 3;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr2[VideoAuthorView.Action.Unsubscribe.ordinal()] = 4;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr2[VideoAuthorView.Action.Analytics.ordinal()] = 5;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr2[VideoAuthorView.Action.OpenDonut.ordinal()] = 6;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr2[VideoAuthorView.Action.Notifications.ordinal()] = 7;
                } catch (NoSuchFieldError unused13) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b(ViewGroup viewGroup, NotificationsPermission notificationsPermission, egs0 egs0Var) {
            super(viewGroup, r0.a, egs0Var);
            a aVar = w4.this.f;
            this.n = msy.a(LazyThreadSafetyMode.NONE, new z4(notificationsPermission, 0));
            Integer num = aVar.b;
            if (num != null) {
                bwt0.f0(this.itemView, 0, num.intValue(), 0, aVar.b.intValue(), 5);
            }
            View view = this.itemView;
            VideoAuthorView videoAuthorView = view instanceof VideoAuthorView ? (VideoAuthorView) view : null;
            if (videoAuthorView != null) {
                videoAuthorView.setSubscribeButtonMode(aVar.c);
            }
            View view2 = this.itemView;
            VideoAuthorView videoAuthorView2 = view2 instanceof VideoAuthorView ? (VideoAuthorView) view2 : null;
            if (videoAuthorView2 != null) {
                videoAuthorView2.setOnActionListener(new a5(0, w4.this, this));
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:110:0x028f  */
        /* JADX WARN: Removed duplicated region for block: B:111:0x021d  */
        /* JADX WARN: Removed duplicated region for block: B:112:0x0217  */
        /* JADX WARN: Removed duplicated region for block: B:116:0x0158  */
        /* JADX WARN: Removed duplicated region for block: B:120:0x0121  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00e8  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x012b  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0193  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x01ba  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x01c8  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x020d  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0213  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x021a  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x0297  */
        @Override // xsna.vfz
        /* renamed from: W5 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void h6(hfz hfzVar) {
            boolean z;
            AboutVideoItem.d.b bVar;
            String str;
            AboutVideoItem.d.InterfaceC1215d interfaceC1215d;
            ndu0 ndu0Var;
            com.vk.core.view.components.avatar.badge.b bVar2;
            int i;
            VkCell.Middle.e eVar;
            VkCell.Middle.d dVar;
            AboutVideoItem.d.c cVar;
            Hint hint;
            etv0 etv0Var;
            int i2;
            String str2;
            AboutVideoItem.d dVar2 = (AboutVideoItem.d) hfzVar;
            boolean z2 = dVar2.i;
            this.l = dVar2;
            this.m = dVar2.j;
            View view = this.itemView;
            VideoAuthorView videoAuthorView = view instanceof VideoAuthorView ? (VideoAuthorView) view : null;
            if (videoAuthorView == null) {
                return;
            }
            tkg0 tkg0Var = videoAuthorView.c;
            w4 w4Var = w4.this;
            gzs<rcg0> gzsVar = w4Var.e;
            int i3 = 0;
            boolean z3 = fxc0.B().J().M0() || fxc0.B().J().Y0() || !z2 || !com.vk.toggle.b.A.a(VideoFeatures.VIDEO_HELPER_CODEGEN_API);
            Uri uri = dVar2.g;
            AboutVideoItem.d.b bVar3 = dVar2.d;
            AboutVideoItem.d.InterfaceC1215d interfaceC1215d2 = dVar2.m;
            boolean z4 = dVar2.o;
            String uri2 = uri != null ? uri.toString() : null;
            if (uri2 == null) {
                uri2 = "";
            }
            CharSequence charSequence = dVar2.b;
            int i4 = dVar2.c;
            boolean z5 = dVar2.f;
            ndu0 ndu0Var2 = z4 ? new ndu0() : null;
            if (z4) {
                z = z5;
                bVar = bVar3;
                str = uri2;
                interfaceC1215d = interfaceC1215d2;
                ndu0Var = ndu0Var2;
                bVar2 = new com.vk.core.view.components.avatar.badge.b(null, true, new x4(i3), null, 19);
            } else {
                z = z5;
                bVar = bVar3;
                str = uri2;
                interfaceC1215d = interfaceC1215d2;
                ndu0Var = ndu0Var2;
                bVar2 = null;
            }
            VideoAuthorView.a aVar = new VideoAuthorView.a(str, charSequence, i4, z3, z, ndu0Var, bVar2);
            ndu0 ndu0Var3 = ndu0Var;
            com.vk.core.view.components.avatar.badge.b bVar4 = bVar2;
            VkCell vkCell = videoAuthorView.b;
            boolean z6 = videoAuthorView.j;
            if (z6) {
                Context context = videoAuthorView.getContext();
                HashSet hashSet = iah0.a;
                if (fnj.d(context)) {
                    i = 40;
                    vkCell.setLeft(VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.a(new or5(str, bVar4, ndu0Var3), iah0.a(i))));
                    if (charSequence == null) {
                        eVar = new VkCell.Middle.e(u11.f(tlo0.Companion, charSequence), 1, TextUtils.TruncateAt.END, (VkCell.Middle.e.b) null, (z ? videoAuthorView : null) != null ? new VkCell.Middle.e.b.C0817b(new gko(R.drawable.vk_icon_verified_16), (k1u0) null, (tlo0.f) null, (Size) null, 14) : null, 18);
                    } else {
                        eVar = null;
                    }
                    if (z3 || i4 < 0) {
                        aVar = null;
                    }
                    if (aVar == null) {
                        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                        tlo0.a aVar2 = tlo0.Companion;
                        gpt0 gpt0Var = gpt0.a;
                        dVar = new VkCell.Middle.d(oq.d(aVar2, z8s.b(videoAuthorView.getContext().getResources(), i4, R.plurals.followers_count, R.string.video_subscribers_count_formatted)), (gzs) null, 1, truncateAt, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 50);
                    } else {
                        dVar = null;
                    }
                    vkCell.setMiddle(new VkCell.Middle.b(eVar, dVar, (VkCell.Middle.c) null, (VkCell.Middle.Size) null, 12));
                    vkCell.setRight(VkCell.Right.c.a(VkCell.Right.Companion, null, new VkCell.Right.e.d(new vkg0(0), new Size(0, 0)), null, null, 29));
                    videoAuthorView.setDonutButton(dVar2.e.a);
                    cVar = dVar2.l;
                    if (cVar != null) {
                        Boolean bool = cVar.b;
                        Boolean bool2 = cVar.a;
                        if (bool2 != null || bool != null) {
                            Boolean bool3 = Boolean.TRUE;
                            boolean z7 = epx.f(bool2, bool3) || epx.f(bool, bool3);
                            if (videoAuthorView.g != z7) {
                                videoAuthorView.g = z7;
                                videoAuthorView.a();
                            }
                        }
                    }
                    if (gzsVar != null) {
                        gzsVar.invoke();
                    }
                    videoAuthorView.setClickable(true);
                    boolean z8 = interfaceC1215d instanceof AboutVideoItem.d.InterfaceC1215d.b;
                    if (gzsVar != null) {
                        gzsVar.invoke();
                    }
                    if (!z2 || !dVar2.k || z8 || dVar2.n) {
                        tkg0Var.c.setVisibility(8);
                        videoAuthorView.a();
                        tkg0Var.e.setVisibility(8);
                    } else {
                        tkg0Var.c.setVisibility(epx.f(bVar, AboutVideoItem.d.b.C1214b.a) ? 0 : 8);
                        videoAuthorView.a();
                        tkg0Var.e.setVisibility(bVar instanceof com.vk.libvideo.bottomsheet.about.delegate.o ? 0 : 8);
                    }
                    tkg0Var.d.setVisibility(z8 ? 0 : 8);
                    AboutVideoItem.d.InterfaceC1215d.b bVar5 = !z8 ? (AboutVideoItem.d.InterfaceC1215d.b) interfaceC1215d : null;
                    hint = bVar5 == null ? bVar5.b : null;
                    if (hint != null || (str2 = hint.c) == null || drm0.N(str2)) {
                        etv0Var = videoAuthorView.i;
                        if (etv0Var != null) {
                            etv0Var.b(false);
                        }
                    } else {
                        etv0 etv0Var2 = videoAuthorView.i;
                        if (etv0Var2 == null || !etv0Var2.isVisible()) {
                            y4 y4Var = new y4(0, w4Var, hint);
                            int i5 = m8v0.M;
                            int i6 = 4;
                            m8v0.a.a(tkg0Var.d, str2, null, VkTooltip$MarkerStyle.Style6, VkTooltip$MarkerSize.Size56, VkOnboarding$TintColor.Azure, VkTooltip$BalloonPosition.BottomLeft, VkTooltip$BalloonTilt.Left, new fvq0(videoAuthorView, i6), new hwi0(14), null, null, new r0r0(videoAuthorView, i6), new l1k0(i6, videoAuthorView, y4Var), null, 0, false, null, null, false, null, false, 8375300);
                        }
                    }
                    if (bVar instanceof com.vk.libvideo.bottomsheet.about.delegate.o) {
                        return;
                    }
                    com.vk.libvideo.bottomsheet.about.delegate.o oVar = (com.vk.libvideo.bottomsheet.about.delegate.o) bVar;
                    if (epx.f(oVar, o.a.C1219a.a)) {
                        i2 = R.drawable.vk_icon_notification_waves_24;
                    } else if (epx.f(oVar, o.a.b.a)) {
                        i2 = R.drawable.vk_icon_notification_slash_outline_24;
                    } else {
                        if (!epx.f(oVar, o.a.c.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i2 = R.drawable.vk_icon_notification_outline_24;
                    }
                    videoAuthorView.setNotificationButtonIcon(i2);
                    return;
                }
            }
            i = z6 ? 32 : 46;
            vkCell.setLeft(VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.a(new or5(str, bVar4, ndu0Var3), iah0.a(i))));
            if (charSequence == null) {
            }
            if (z3) {
            }
            aVar = null;
            if (aVar == null) {
            }
            vkCell.setMiddle(new VkCell.Middle.b(eVar, dVar, (VkCell.Middle.c) null, (VkCell.Middle.Size) null, 12));
            vkCell.setRight(VkCell.Right.c.a(VkCell.Right.Companion, null, new VkCell.Right.e.d(new vkg0(0), new Size(0, 0)), null, null, 29));
            videoAuthorView.setDonutButton(dVar2.e.a);
            cVar = dVar2.l;
            if (cVar != null) {
            }
            if (gzsVar != null) {
            }
            videoAuthorView.setClickable(true);
            boolean z82 = interfaceC1215d instanceof AboutVideoItem.d.InterfaceC1215d.b;
            if (gzsVar != null) {
            }
            if (z2) {
            }
            tkg0Var.c.setVisibility(8);
            videoAuthorView.a();
            tkg0Var.e.setVisibility(8);
            tkg0Var.d.setVisibility(z82 ? 0 : 8);
            if (!z82) {
            }
            if (bVar5 == null) {
            }
            if (hint != null) {
            }
            etv0Var = videoAuthorView.i;
            if (etv0Var != null) {
            }
            if (bVar instanceof com.vk.libvideo.bottomsheet.about.delegate.o) {
            }
        }
    }

    public w4() {
        throw null;
    }

    public w4(h7v h7vVar, c4 c4Var, NotificationsPermission notificationsPermission, gzs gzsVar, gzs gzsVar2, a aVar, String str, egs0 egs0Var, int i) {
        gzsVar = (i & 8) != 0 ? null : gzsVar;
        aVar = (i & 32) != 0 ? new a(null, null, 7) : aVar;
        str = (i & 64) != 0 ? "button_description" : str;
        egs0Var = (i & 128) != 0 ? null : egs0Var;
        this.a = h7vVar;
        this.b = c4Var;
        this.c = notificationsPermission;
        this.d = gzsVar;
        this.e = gzsVar2;
        this.f = aVar;
        this.g = str;
        this.h = egs0Var;
    }

    @Override // xsna.p1u0
    public final vfz<? extends AboutVideoItem.d> b(ViewGroup viewGroup) {
        return new b(viewGroup, this.c, this.h);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof AboutVideoItem.d;
    }
}
