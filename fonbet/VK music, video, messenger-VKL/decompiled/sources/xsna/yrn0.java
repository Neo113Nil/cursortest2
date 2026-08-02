package xsna;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;
import com.vk.catalog2.common.ui.mvp.clip.ClipMusicTemplatesCatalogFragment;
import com.vk.catalog2.common.ui.mvp.clip.trends.ClipTrendsCatalogFragment;
import com.vk.clips.entrypoints.params.ClipsEntryPointsParams;
import com.vk.clips.entrypoints.ui.ClipsEntryPointDraftsFragment;
import com.vk.clips.entrypoints.ui.ClipsEntryPointsFragment;
import com.vk.core.fragments.FragmentImpl;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipsCreationScreenItem;
import com.vkontakte.android.R;

/* compiled from: TabAdapter.kt */
/* loaded from: classes16.dex */
public final class yrn0 extends k1q0 {
    public final t3t s;
    public final lpj t;
    public final int u;
    public final ClipsEntryPointsParams v;
    public final mhd w;
    public final obs x;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public yrn0(ClipsEntryPointsFragment clipsEntryPointsFragment, ViewPager2 viewPager2, mbs mbsVar, t3t t3tVar, lpj lpjVar, int i, ClipsEntryPointsParams clipsEntryPointsParams, mhd mhdVar, obs obsVar) {
        super(clipsEntryPointsFragment, viewPager2, mbsVar, r0);
        FragmentManager fragmentManager = clipsEntryPointsFragment.In().a;
        this.s = t3tVar;
        this.t = lpjVar;
        this.u = i;
        this.v = clipsEntryPointsParams;
        this.w = mhdVar;
        this.x = obsVar;
        for (Fragment fragment : fragmentManager.c.f()) {
            Bundle arguments = fragment.getArguments();
            if (arguments != null) {
                int i2 = arguments.getInt("picker_tab_position", -1);
                Integer valueOf = i2 == -1 ? null : Integer.valueOf(i2);
                if (valueOf != null) {
                    G0(fragment, valueOf.intValue());
                }
            }
        }
        this.q = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return 4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.scs
    public final Fragment z0(int i) {
        FragmentImpl fragmentImpl;
        Fragment F0 = F0(i);
        Fragment fragment = F0;
        if (F0 == null) {
            if (i != 0) {
                ClipsEntryPointsParams clipsEntryPointsParams = this.v;
                if (i != 1) {
                    lpj lpjVar = this.t;
                    if (i == 2) {
                        ClipMusicTemplatesCatalogFragment.a aVar = new ClipMusicTemplatesCatalogFragment.a(lpjVar, false);
                        String obj = MobileOfficialAppsClipsStat$TypeClipsCreationScreenItem.EventType.OPEN_MEDIAPICKER.toString();
                        Bundle bundle = aVar.j;
                        bundle.putString("ref", obj);
                        bundle.putBoolean("clips_catalog_no_toolbar", true);
                        bundle.putInt("background_color", e3m.f(R.attr.vk_ui_background_content, lpjVar));
                        bundle.putString("hash_tag", clipsEntryPointsParams != null ? clipsEntryPointsParams.d : null);
                        aVar.s(true);
                        dhr0.a.getClass();
                        aVar.w(dhr0.u().c);
                        fragmentImpl = aVar.f();
                    } else {
                        if (i != 3) {
                            throw new IllegalStateException("Item count > supported fragments in createFragment()");
                        }
                        ClipTrendsCatalogFragment.a aVar2 = new ClipTrendsCatalogFragment.a(ClipTrendsCatalogFragment.class, null, null);
                        int color = lpjVar.getColor(R.color.vk_black);
                        Bundle bundle2 = aVar2.j;
                        bundle2.putInt("background_color", color);
                        bundle2.putString("ref", MobileOfficialAppsClipsStat$TypeClipsCreationScreenItem.EventType.OPEN_MEDIAPICKER.toString());
                        bundle2.putBoolean("clips_catalog_no_toolbar", true);
                        bundle2.putInt("background_color", e3m.f(R.attr.vk_ui_background_content, lpjVar));
                        bundle2.putString("hash_tag", clipsEntryPointsParams != null ? clipsEntryPointsParams.d : null);
                        aVar2.s(true);
                        dhr0.a.getClass();
                        aVar2.w(dhr0.u().c);
                        fragmentImpl = aVar2.f();
                    }
                } else {
                    ClipsEntryPointDraftsFragment.a aVar3 = new ClipsEntryPointDraftsFragment.a(ClipsEntryPointDraftsFragment.class, null, null);
                    int i2 = this.u;
                    Bundle bundle3 = aVar3.j;
                    bundle3.putInt("entry_point_drafts_session_id", i2);
                    bundle3.putBoolean("do_not_open_clips_tab_on_finish", clipsEntryPointsParams != null ? clipsEntryPointsParams.h : false);
                    FragmentImpl f = aVar3.f();
                    f.D.a(this.x);
                    fragmentImpl = f;
                }
            } else {
                t3t t3tVar = this.s;
                FragmentImpl a = t3tVar.b.a();
                Bundle arguments = a.getArguments();
                if (arguments == null) {
                    arguments = new Bundle();
                }
                arguments.putAll(t3tVar.a);
                a.setArguments(arguments);
                p3t p3tVar = a instanceof p3t ? (p3t) a : null;
                if (p3tVar != null) {
                    yiz.j(p3tVar, t3tVar);
                }
                fragmentImpl = a;
            }
            Bundle arguments2 = fragmentImpl.getArguments();
            if (arguments2 != null) {
                arguments2.putInt("picker_tab_position", i);
            }
            G0(fragmentImpl, i);
            fragment = fragmentImpl;
        }
        return fragment;
    }
}
