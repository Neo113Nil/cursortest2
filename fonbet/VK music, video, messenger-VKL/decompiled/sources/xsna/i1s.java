package xsna;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$BalloonTilt;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.tool.onboarding.VkTooltip$MarkerStyle;
import com.vk.core.view.components.tabs.VkTabs;
import com.vk.im.engine.models.dialogs.FolderType;
import com.vk.onboarding.api.di.VkOnboardingComponent;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: FoldersOnboardingController.kt */
/* loaded from: classes18.dex */
public final class i1s {
    public final VkTabs a;
    public final ViewPager2 b;
    public final j1s c;
    public final ufk d;
    public final bih e;
    public final Context f;
    public final Handler g = new Handler(Looper.getMainLooper());
    public boolean h;
    public boolean i;
    public final VkOnboardingComponent j;
    public final q7v0 k;
    public v1s l;
    public final nbs m;
    public final List<b> n;

    /* compiled from: FoldersOnboardingController.kt */
    public final class a extends b {
        @Override // xsna.i1s.b
        public final boolean a(xyr xyrVar) {
            return xyrVar.getType() == FolderType.DEFAULT && xyrVar.getId() == -1;
        }

        @Override // xsna.i1s.b
        public final VkTooltip$MarkerSize b() {
            return VkTooltip$MarkerSize.Size48;
        }

        @Override // xsna.i1s.b
        public final int c() {
            return R.string.vkim_channels_folder_tooltip_onboarding_text_all;
        }

        @Override // xsna.i1s.b
        public final String d() {
            return "me:channels_in_all_folder";
        }

        @Override // xsna.i1s.b
        public final VkTooltip$BalloonPosition e() {
            return VkTooltip$BalloonPosition.TopRight;
        }

        @Override // xsna.i1s.b
        public final VkTooltip$MarkerStyle f() {
            return VkTooltip$MarkerStyle.Style1;
        }

        @Override // xsna.i1s.b
        public final VkTooltip$BalloonTilt g() {
            return VkTooltip$BalloonTilt.Left;
        }

        @Override // xsna.i1s.b
        public final gd6 h() {
            return ImFeatures.CHANNELS_IN_ALL_FOLDER;
        }
    }

    /* compiled from: FoldersOnboardingController.kt */
    public abstract class b {
        public b() {
        }

        public abstract boolean a(xyr xyrVar);

        public abstract VkTooltip$MarkerSize b();

        public abstract int c();

        public abstract String d();

        public abstract VkTooltip$BalloonPosition e();

        public abstract VkTooltip$MarkerStyle f();

        public abstract VkTooltip$BalloonTilt g();

        public gd6 h() {
            return null;
        }
    }

    /* compiled from: FoldersOnboardingController.kt */
    public static final class c {
        public final VkOnboardingCampaign a;
        public final int b;
        public final VkTooltip$MarkerSize c;
        public final VkTooltip$BalloonPosition d;
        public final VkTooltip$BalloonTilt e;
        public final VkTooltip$MarkerStyle f;
        public final xyr g;

        public c(VkOnboardingCampaign vkOnboardingCampaign, int i, VkTooltip$MarkerSize vkTooltip$MarkerSize, VkTooltip$BalloonPosition vkTooltip$BalloonPosition, VkTooltip$BalloonTilt vkTooltip$BalloonTilt, VkTooltip$MarkerStyle vkTooltip$MarkerStyle, xyr xyrVar) {
            this.a = vkOnboardingCampaign;
            this.b = i;
            this.c = vkTooltip$MarkerSize;
            this.d = vkTooltip$BalloonPosition;
            this.e = vkTooltip$BalloonTilt;
            this.f = vkTooltip$MarkerStyle;
            this.g = xyrVar;
        }
    }

    /* compiled from: FoldersOnboardingController.kt */
    public final class d extends b {
        public final a b;

        /* compiled from: FoldersOnboardingController.kt */
        public static final class a implements gd6 {
            @Override // com.vk.toggle.b.a
            public final String getKey() {
                return ImFeatures.GROUPS_MESSENGER_DISABLED.getKey();
            }

            @Override // xsna.gd6, com.vk.toggle.b.a
            public final boolean h() {
                return !com.vk.toggle.b.A.a(this);
            }
        }

        public d(i1s i1sVar) {
            super();
            this.b = new a();
        }

        @Override // xsna.i1s.b
        public final boolean a(xyr xyrVar) {
            return xyrVar.getType() == FolderType.MANAGED_GROUPS;
        }

        @Override // xsna.i1s.b
        public final VkTooltip$MarkerSize b() {
            return VkTooltip$MarkerSize.Size72;
        }

        @Override // xsna.i1s.b
        public final int c() {
            return R.string.vkim_managed_groups_newim_onboarding;
        }

        @Override // xsna.i1s.b
        public final String d() {
            return "community:new_group_im";
        }

        @Override // xsna.i1s.b
        public final VkTooltip$BalloonPosition e() {
            return VkTooltip$BalloonPosition.Bottom;
        }

        @Override // xsna.i1s.b
        public final VkTooltip$MarkerStyle f() {
            return VkTooltip$MarkerStyle.Style6;
        }

        @Override // xsna.i1s.b
        public final VkTooltip$BalloonTilt g() {
            return VkTooltip$BalloonTilt.Right;
        }

        @Override // xsna.i1s.b
        public final gd6 h() {
            return this.b;
        }
    }

    public i1s(Fragment fragment, VkTabs vkTabs, ViewPager2 viewPager2, j1s j1sVar, ufk ufkVar, bih bihVar) {
        this.a = vkTabs;
        this.b = viewPager2;
        this.c = j1sVar;
        this.d = ufkVar;
        this.e = bihVar;
        this.f = fragment.requireContext();
        VkOnboardingComponent vkOnboardingComponent = (VkOnboardingComponent) m7m.d(fragment).a(fpf0.a(VkOnboardingComponent.class));
        this.j = vkOnboardingComponent;
        q7v0 p3 = vkOnboardingComponent.p3();
        this.k = p3;
        this.n = e43.l(new a(), new d(this));
        if (!p3.isReady()) {
            p3.init();
        }
        mbs mbsVar = ((FragmentImpl) fragment).D;
        mbsVar.a(new h1s(this));
        this.m = new nbs(mbsVar);
    }
}
