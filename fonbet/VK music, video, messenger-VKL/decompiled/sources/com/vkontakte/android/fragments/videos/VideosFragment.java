package com.vkontakte.android.fragments.videos;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.tabs.TabLayout;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.attachpicker.PhotoVideoAttachActivity;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.VideoAlbum;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.upload.api.VideoPublicationContext;
import com.vk.permission.PermissionHelper;
import com.vk.video.ui.albums.fragments.VideoAlbumFragment;
import com.vk.video.ui.albums.fragments.VideoAlbumsFragment;
import com.vk.video.ui.edit.fragments.VideoAlbumEditorFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import com.vkontakte.android.fragments.VkTabbedLoaderFragment;
import com.vkontakte.android.ui.layout.ExpandableBarLayout;
import io.reactivex.rxjava3.core.q;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me.grishka.appkit.fragments.TabbedLoaderFragment;
import xsna.bzu;
import xsna.cuz;
import xsna.cvk;
import xsna.dag0;
import xsna.eeu0;
import xsna.f44;
import xsna.fkq0;
import xsna.fxc0;
import xsna.gzs;
import xsna.h3p0;
import xsna.h7u0;
import xsna.i0q0;
import xsna.iin0;
import xsna.l0i0;
import xsna.le50;
import xsna.o25;
import xsna.oz50;
import xsna.p0e0;
import xsna.pw40;
import xsna.q6r0;
import xsna.rsg0;
import xsna.s3q0;
import xsna.sft0;
import xsna.t6g0;
import xsna.u1u0;
import xsna.uft0;
import xsna.xwk;
import xsna.y5;
import xsna.yfb;
import xsna.z5;
import xsna.zil0;

/* loaded from: classes7.dex */
public class VideosFragment extends VkTabbedLoaderFragment implements iin0 {
    public static final /* synthetic */ int z0 = 0;
    public l0i0 n0;
    public String o0;
    public boolean p0;
    public boolean q0;
    public io.reactivex.rxjava3.disposables.c t0;
    public AddedVideosFragment u0;
    public UploadedVideosFragment v0;
    public VideoAlbumsFragment w0;
    public TextView x0;
    public UserId m0 = q6r0.f().y();
    public String r0 = "";
    public final uft0 s0 = new uft0();
    public final a y0 = new a();

    public class b implements gzs<s3q0> {
        public b() {
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
            intent.putExtra("android.intent.extra.sizeLimit", 2147483648L);
            VideosFragment.this.startActivityForResult(intent, 234);
            return s3q0.a;
        }
    }

    public class c implements l0i0.b {
        public final /* synthetic */ SearchVideoListFragment a;

        public c(SearchVideoListFragment searchVideoListFragment) {
            this.a = searchVideoListFragment;
        }

        @Override // xsna.l0i0.b
        public final void a(String str) {
            VideosFragment.this.r0 = str;
        }

        @Override // xsna.l0i0.b
        public final void b(String str) {
            ExpandableBarLayout expandableBarLayout = this.a.c1;
            if (expandableBarLayout == null || !expandableBarLayout.j) {
                return;
            }
            expandableBarLayout.a();
        }

        @Override // xsna.l0i0.b
        public final void c(String str) {
            SearchVideoListFragment searchVideoListFragment = this.a;
            if (str == null || str.length() <= 0) {
                searchVideoListFragment.v0.clear();
                searchVideoListFragment.w0.clear();
                searchVideoListFragment.X0 = null;
                searchVideoListFragment.q();
                searchVideoListFragment.f0 = false;
                return;
            }
            io.reactivex.rxjava3.disposables.c cVar = searchVideoListFragment.i0;
            if (cVar != null) {
                cVar.dispose();
                searchVideoListFragment.i0 = null;
            }
            searchVideoListFragment.X0 = str;
            searchVideoListFragment.Fo();
        }
    }

    public class d implements l0i0.c {
        public final /* synthetic */ View b;
        public final /* synthetic */ View c;
        public final /* synthetic */ View d;
        public final /* synthetic */ SearchVideoListFragment e;

        public d(View view, View view2, View view3, SearchVideoListFragment searchVideoListFragment) {
            this.b = view;
            this.c = view2;
            this.d = view3;
            this.e = searchVideoListFragment;
        }

        @Override // xsna.l0i0.c
        public final void sg(boolean z) {
            u1u0.n(z ? 0 : 8, this.b);
            u1u0.n(z ? 8 : 0, this.c);
            u1u0.n(z ? 8 : 0, this.d);
            if (z) {
                UserId userId = VideosFragment.this.m0;
                String str = Objects.equals(q6r0.f().y(), userId) ? "search" : userId.b >= 0 ? "videos_user" : "videos_group";
                b.d dVar = new b.d("video_catalog_event");
                dVar.b("search_focus", NotificationCompat.CATEGORY_EVENT);
                dVar.b(str, "ref");
                dVar.e();
                return;
            }
            SearchVideoListFragment searchVideoListFragment = this.e;
            searchVideoListFragment.v0.clear();
            searchVideoListFragment.w0.clear();
            searchVideoListFragment.X0 = null;
            searchVideoListFragment.q();
            searchVideoListFragment.f0 = false;
        }
    }

    public static class e extends oz50 {
        public e() {
            super(VideosFragment.class, null, null);
        }
    }

    public static class f {
        public int a;
        public int b;
    }

    public VideosFragment() {
        TabbedLoaderFragment.a aVar = this.l0;
        aVar.h = R.layout.tabs_with_search;
        aVar.g = false;
    }

    @Override // me.grishka.appkit.fragments.AppKitFragment, xsna.e1z
    public final boolean Ci() {
        return !(getActivity() instanceof f44) && h3p0.a(this);
    }

    @Override // xsna.iin0
    public final ViewGroup Wj(Context context) {
        return this.Q;
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        boolean z;
        ExpandableBarLayout expandableBarLayout;
        SearchVideoListFragment searchVideoListFragment = (SearchVideoListFragment) In().f(R.id.search_wrap);
        if (searchVideoListFragment == null || (expandableBarLayout = searchVideoListFragment.c1) == null || !expandableBarLayout.j) {
            z = false;
        } else {
            expandableBarLayout.a();
            z = true;
        }
        l0i0 l0i0Var = this.n0;
        if (!l0i0Var.d) {
            return z;
        }
        MenuItem menuItem = l0i0Var.c;
        if (menuItem == null) {
            l0i0Var.d = false;
        } else {
            menuItem.collapseActionView();
        }
        return true;
    }

    @Override // com.vkontakte.android.fragments.VkTabbedLoaderFragment, me.grishka.appkit.fragments.AppKitFragment, xsna.e1z
    public final boolean ea() {
        return !(getActivity() instanceof f44);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.f0) {
            return;
        }
        this.b0.setVisibility(8);
        this.g0 = true;
        po();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        Uri data;
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            if (i == 104) {
                cuz.a(getActivity()).c(new Intent("com.vkontakte.android.VIDEO_ALBUM_CREATED").putExtra("album", (VideoAlbum) intent.getParcelableExtra("album")));
                return;
            }
            if ((i == 234 || i == 235) && (data = intent.getData()) != null) {
                if (HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT.equals(data.getScheme())) {
                    String c2 = ((dag0) com.vk.core.files.a.h.getValue()).c(data);
                    if (TextUtils.isEmpty(c2)) {
                        cvk.u(R.string.error, false);
                        return;
                    }
                    data = Uri.parse(c2);
                }
                fxc0.B().V(requireContext(), data, new VideoPublicationContext(null, this.m0), 0);
            }
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        this.m0 = getArguments().getParcelable("uid") != null ? (UserId) getArguments().getParcelable("uid") : this.m0;
        this.q0 = getArguments().getBoolean("can_upload_video");
        this.o0 = getArguments().getString("title", getString(R.string.videos));
        this.p0 = getArguments().getBoolean("select");
        String string = getArguments().getString("album");
        if (string != null) {
            Matcher matcher = Pattern.compile("album_([0-9]+)").matcher(string);
            if (matcher.find()) {
                VideoAlbum videoAlbum = new VideoAlbum(true);
                try {
                    i = Integer.parseInt(matcher.group(1));
                } catch (NumberFormatException unused) {
                    cvk.u(R.string.vkim_unsupported_link, false);
                    finish();
                    i = -1;
                }
                videoAlbum.b = i;
                videoAlbum.f = this.m0;
                videoAlbum.c = getString(R.string.album);
                VideoAlbumFragment.Ro(videoAlbum, false).l(this);
            }
        }
        p0e0.b(this.m0, "videos_group");
    }

    @Override // me.grishka.appkit.fragments.TabbedLoaderFragment, androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        l0i0 l0i0Var = this.n0;
        if (l0i0Var != null) {
            l0i0Var.a(menu, menuInflater);
        }
        t6g0 t6g0Var = t6g0.b;
        boolean z = false;
        boolean z2 = o25.a().a(this.m0) || t6g0.b().m(this.m0);
        if ((z2 || this.q0) && !this.p0) {
            menuInflater.inflate(R.menu.videos, menu);
            MenuItem findItem = menu.findItem(R.id.add);
            if (findItem != null) {
                SubMenu subMenu = findItem.getSubMenu();
                u1u0.a(subMenu, -5525581);
                subMenu.findItem(R.id.add_album).setVisible(z2);
                UserId userId = this.m0;
                if (!fxc0.B().J().r0() || (!BuildInfo.q() && fkq0.d(userId))) {
                    z = true;
                }
                subMenu.findItem(R.id.add_link).setVisible(z);
            }
        }
        super.onCreateOptionsMenu(menu, menuInflater);
        l0i0 l0i0Var2 = this.n0;
        boolean isEmpty = this.r0.isEmpty();
        boolean z3 = !isEmpty;
        MenuItem menuItem = l0i0Var2.c;
        if (menuItem == null) {
            l0i0Var2.d = z3;
        } else if (isEmpty) {
            menuItem.collapseActionView();
        } else {
            menuItem.expandActionView();
        }
    }

    @Override // me.grishka.appkit.fragments.LoaderFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        i0q0.h(null);
    }

    @Override // me.grishka.appkit.fragments.TabbedLoaderFragment, me.grishka.appkit.fragments.LoaderFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        io.reactivex.rxjava3.disposables.c cVar = this.t0;
        if (cVar != null) {
            cVar.dispose();
            this.t0 = null;
        }
    }

    @Override // me.grishka.appkit.fragments.TabbedLoaderFragment, androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.add_new_video) {
            PermissionHelper permissionHelper = PermissionHelper.a;
            FragmentActivity activity = getActivity();
            permissionHelper.getClass();
            PermissionHelper.h(permissionHelper, activity, PermissionHelper.t, R.string.vk_permissions_intent_video, R.string.vk_permissions_intent_video_settings, new b(), null, 64);
            return true;
        }
        if (itemId == R.id.add_existed) {
            Intent intent = new Intent(getActivity(), (Class<?>) PhotoVideoAttachActivity.class);
            intent.putExtra("media_type", 333);
            intent.putExtra("single_mode", true);
            startActivityForResult(intent, 235);
            return true;
        }
        if (itemId != R.id.add_link) {
            if (itemId == R.id.add_album) {
                UserId userId = this.m0;
                VideoAlbumEditorFragment.a aVar = new VideoAlbumEditorFragment.a();
                aVar.j.putParcelable("oid", userId);
                aVar.g(104, this);
            }
            return true;
        }
        eeu0.a.C2801a c2801a = new eeu0.a.C2801a(new h7u0.a(getActivity()));
        c2801a.f(R.string.add_video);
        c2801a.e(R.string.attach_link);
        c2801a.n = true;
        c2801a.s = new y5(this, 12);
        c2801a.c(R.string.ok, new z5(this, 12), true);
        c2801a.g();
        return true;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        bzu.c = true;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        bzu.c = false;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.putString("SEARCH_QUERY", this.r0);
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // com.vkontakte.android.fragments.VkTabbedLoaderFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.Q.setTitle(this.o0);
        View findViewById = view.findViewById(R.id.viewpager);
        View findViewById2 = view.findViewById(R.id.tabs);
        View findViewById3 = view.findViewById(R.id.search_wrap);
        if (getActivity() instanceof f44) {
            this.Q.setVisibility(8);
            getView().setBackgroundColor(-1);
            TabLayout tabLayout = (TabLayout) view.findViewById(R.id.tabs);
            tabLayout.setBackgroundColor(-1);
            tabLayout.setTabTextColors(TabLayout.n(Color.parseColor("#B9CDE3"), getResources().getColor(R.color.vk_blue_400)));
            tabLayout.setSelectedTabIndicatorColor(getResources().getColor(R.color.vk_blue_400));
            vo();
        }
        UserId userId = this.m0;
        boolean z = this.p0;
        Bundle bundle2 = new Bundle();
        bundle2.putInt("album_id", -2);
        bundle2.putParcelable("uid", userId);
        bundle2.putBoolean("select", z);
        AddedVideosFragment addedVideosFragment = new AddedVideosFragment();
        addedVideosFragment.setArguments(bundle2);
        this.u0 = addedVideosFragment;
        this.l0.a(0, addedVideosFragment, getString(R.string.video_album_added));
        boolean z2 = this.p0;
        Bundle bundle3 = new Bundle();
        bundle3.putBoolean("select", z2);
        bundle3.putBoolean("searchMode", true);
        SearchVideoListFragment searchVideoListFragment = new SearchVideoListFragment();
        searchVideoListFragment.Ho(false);
        searchVideoListFragment.setArguments(bundle3);
        l0i0 l0i0Var = new l0i0((Activity) getActivity(), (l0i0.b) new c(searchVideoListFragment));
        this.n0 = l0i0Var;
        l0i0Var.f = new d(findViewById3, findViewById, findViewById2, searchVideoListFragment);
        searchVideoListFragment.d1 = l0i0Var;
        In().q().a(R.id.search_wrap, searchVideoListFragment);
        setHasOptionsMenu(true);
        if (bundle != null) {
            this.r0 = bundle.getString("SEARCH_QUERY", "");
        }
    }

    @Override // me.grishka.appkit.fragments.LoaderFragment
    public final void po() {
        UserId userId = this.m0;
        q I0 = q.I0(rsg0.y0(yfb.x(this.s0.E(userId, null, null, 0, null)), null, null, 3), rsg0.y0(yfb.x(sft0.a.c(-1, userId, 1, null, null, null, null, null, null, null, null)), null, null, 3), new zil0(5));
        pw40 pw40Var = new pw40(this, 18);
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        Objects.requireNonNull(bVar);
        this.t0 = I0.subscribe(pw40Var, new le50(bVar, 25));
    }

    public final void vo() {
        if (getActivity() instanceof f44) {
            AddedVideosFragment addedVideosFragment = this.u0;
            if (addedVideosFragment != null) {
                addedVideosFragment.Ho(false);
            }
            UploadedVideosFragment uploadedVideosFragment = this.v0;
            if (uploadedVideosFragment != null) {
                uploadedVideosFragment.Ho(false);
            }
            VideoAlbumsFragment videoAlbumsFragment = this.w0;
            if (videoAlbumsFragment != null) {
                videoAlbumsFragment.Ho(false);
            }
        }
    }

    @Override // me.grishka.appkit.fragments.LoaderFragment, androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public final void h() {
    }

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            TextView textView = VideosFragment.this.x0;
            if (textView != null) {
                textView.setEnabled(xwk.d().a().g(charSequence.toString()));
            }
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
