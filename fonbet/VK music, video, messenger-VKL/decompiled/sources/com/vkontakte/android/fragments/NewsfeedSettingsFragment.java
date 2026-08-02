package com.vkontakte.android.fragments;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vk.dto.hints.HintId;
import com.vk.feed.settings.api.di.NewsfeedSettingsComponent;
import com.vk.prefui.fragments.VkPreferenceToolbarFragment;
import com.vk.prefui.views.VkGroupHeaderPreference;
import com.vk.prefui.views.VkPreference;
import com.vk.prefui.views.VkSummaryListPreference;
import com.vk.stories.StoriesFilterListFragment;
import com.vk.story.api.di.StoriesComponent;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vk.webapp.fragments.NewsfeedSettingsAppFragment;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.anm0;
import xsna.awt0;
import xsna.bsl0;
import xsna.ce60;
import xsna.cn70;
import xsna.epx;
import xsna.fpf0;
import xsna.gko;
import xsna.hg1;
import xsna.hz60;
import xsna.k7m;
import xsna.m360;
import xsna.m7m;
import xsna.mh70;
import xsna.msy;
import xsna.oz50;
import xsna.pla;
import xsna.w8i;
import xsna.x0o;
import xsna.x850;

/* compiled from: NewsfeedSettingsFragment.kt */
/* loaded from: classes7.dex */
public final class NewsfeedSettingsFragment extends VkPreferenceToolbarFragment implements Preference.c, Preference.b, w8i {
    public static final /* synthetic */ int v0 = 0;
    public bsl0 n0;
    public hz60 o0;
    public anm0 p0;
    public VkSummaryListPreference q0;
    public VkPreference r0;
    public final Object m0 = msy.a(LazyThreadSafetyMode.NONE, new x850(this, 2));
    public final io.reactivex.rxjava3.disposables.b s0 = new io.reactivex.rxjava3.disposables.b();
    public final int t0 = R.string.newsfeed_settings_title;
    public final int u0 = cn70.b(8);

    /* compiled from: NewsfeedSettingsFragment.kt */
    public static final class a extends oz50 {
        public a() {
            super(NewsfeedSettingsFragment.class, null, null);
        }
    }

    @Override // androidx.preference.Preference.b
    public final boolean Sl(Preference preference, Object obj) {
        ce60 ce60Var = ce60.b;
        ce60Var.getClass();
        ce60.h.remove(0);
        ce60.n(Boolean.valueOf(epx.f(obj, "top")));
        ce60Var.b(true);
        return true;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.preference.Preference.c
    public final boolean eh(Preference preference) {
        VkSummaryListPreference vkSummaryListPreference;
        Context mo2getContext;
        String str = preference.n;
        if (str == null) {
            return true;
        }
        switch (str.hashCode()) {
            case -1970897765:
                if (str.equals("hide_from_stories")) {
                    new StoriesFilterListFragment.a().l(this);
                    break;
                }
                break;
            case -1077608320:
                if (str.equals("newsfeed_order") && (vkSummaryListPreference = this.q0) != null) {
                    vkSummaryListPreference.b0 = false;
                    vkSummaryListPreference.o();
                    break;
                }
                break;
            case -255930252:
                if (str.equals("new_posts")) {
                    ((mh70) this.m0.getValue()).d(mo2getContext(), getString(R.string.newsfeed_settings_new_posts));
                    break;
                }
                break;
            case 25432971:
                if (str.equals("hide_from_news") && (mo2getContext = mo2getContext()) != null) {
                    hz60 hz60Var = this.o0;
                    if (hz60Var == null) {
                        hz60Var = null;
                    }
                    hz60Var.a(mo2getContext);
                    break;
                }
                break;
            case 1407455445:
                if (str.equals("face_recognition")) {
                    int i = NewsfeedSettingsAppFragment.a0;
                    NewsfeedSettingsAppFragment.b.a().l(this);
                    ce60.b.getClass();
                    ce60.f.remove("face_recognition");
                    VkPreference vkPreference = this.r0;
                    if (vkPreference != null) {
                        vkPreference.Q = false;
                        vkPreference.o();
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // com.vk.prefui.fragments.VkPreferenceToolbarFragment
    public final int ho() {
        return this.u0;
    }

    @Override // com.vk.prefui.fragments.VkPreferenceToolbarFragment
    public final int io() {
        return this.t0;
    }

    public final void jo(boolean z) {
        Preference findPreference = findPreference("discover_divider");
        if (findPreference != null) {
            findPreference.K(z);
        }
        Preference findPreference2 = findPreference("discover_title");
        if (findPreference2 != null) {
            findPreference2.K(z);
        }
        Preference findPreference3 = findPreference("discover");
        if (findPreference3 != null) {
            findPreference3.K(z);
        }
    }

    @Override // com.vk.prefui.fragments.MaterialPreferenceFragment, com.vk.prefui.fragments.PreferenceFragmentCompat
    public final void onBindPreferences() {
        FragmentActivity activity;
        RecyclerView recyclerView;
        super.onBindPreferences();
        ce60.b.getClass();
        if (ce60.m()) {
            return;
        }
        String id = HintId.INFO_BUBBLE_ENABLE_TOP_NEWS.getId();
        if (!pla.e().b().a(id) || (activity = getActivity()) == null || (recyclerView = this.O) == null) {
            return;
        }
        awt0.s(recyclerView, new x0o(this, id, activity, 2));
    }

    @Override // com.vk.prefui.fragments.MaterialPreferenceFragment, com.vk.prefui.fragments.PreferenceFragmentCompat, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.p0 = ((StoryViewerComponent) ((k7m) m7m.f(this)).a(fpf0.a(StoryViewerComponent.class))).l9();
        this.n0 = ((StoriesComponent) ((k7m) m7m.f(this)).a(fpf0.a(StoriesComponent.class))).w3();
        this.o0 = ((NewsfeedSettingsComponent) ((k7m) m7m.f(this)).a(fpf0.a(NewsfeedSettingsComponent.class))).R9();
        addPreferencesFromResource(R.xml.preferences_newsfeed);
        Preference findPreference = findPreference("newsfeed_order");
        VkSummaryListPreference vkSummaryListPreference = findPreference instanceof VkSummaryListPreference ? (VkSummaryListPreference) findPreference : null;
        this.q0 = vkSummaryListPreference;
        if (vkSummaryListPreference != null) {
            vkSummaryListPreference.i = R.id.settings_feed_type;
        }
        if (vkSummaryListPreference != null) {
            ce60.b.getClass();
            vkSummaryListPreference.R(ce60.m() ? "top" : "recent");
        }
        VkSummaryListPreference vkSummaryListPreference2 = this.q0;
        if (vkSummaryListPreference2 != null) {
            ce60.b.getClass();
            vkSummaryListPreference2.b0 = ce60.f.contains("newsfeed_order");
            vkSummaryListPreference2.o();
        }
        VkSummaryListPreference vkSummaryListPreference3 = this.q0;
        if (vkSummaryListPreference3 != null) {
            vkSummaryListPreference3.f = this;
        }
        if (vkSummaryListPreference3 != null) {
            vkSummaryListPreference3.g = this;
        }
        Preference findPreference2 = findPreference("new_posts");
        if (findPreference2 != null) {
            findPreference2.g = this;
        }
        Preference findPreference3 = findPreference("hide_from_news");
        if (findPreference3 != null) {
            findPreference3.g = this;
        }
        Preference findPreference4 = findPreference("hide_from_stories");
        if (findPreference4 != null) {
            findPreference4.g = this;
        }
        Preference findPreference5 = findPreference("face_recognition");
        VkPreference vkPreference = findPreference5 instanceof VkPreference ? (VkPreference) findPreference5 : null;
        this.r0 = vkPreference;
        if (vkPreference != null) {
            ce60.b.getClass();
            vkPreference.Q = ce60.f.contains("face_recognition");
            vkPreference.o();
        }
        VkPreference vkPreference2 = this.r0;
        if (vkPreference2 != null) {
            vkPreference2.g = this;
        }
        Preference findPreference6 = findPreference("discover_title");
        VkGroupHeaderPreference vkGroupHeaderPreference = findPreference6 instanceof VkGroupHeaderPreference ? (VkGroupHeaderPreference) findPreference6 : null;
        if (vkGroupHeaderPreference != null) {
            vkGroupHeaderPreference.Q = new VkGroupHeader.a.C0842a(new gko(R.drawable.vk_icon_compass_circle_fill_purple_28), null, 6);
            vkGroupHeaderPreference.o();
        }
        ce60.b.getClass();
        ce60.f.remove("newsfeed_order");
        jo(false);
        bsl0 bsl0Var = this.n0;
        hg1.e(this.s0, hg1.i((bsl0Var != null ? bsl0Var : null).d().m(io.reactivex.rxjava3.android.schedulers.a.b()), new m360(this, 2)));
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.s0.e();
        super.onDestroy();
    }
}
