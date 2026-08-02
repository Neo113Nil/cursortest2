package com.vkontakte.android.ui.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import android.util.SparseIntArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.core.apps.BuildInfo;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.preference.Preference;
import com.vk.core.view.PhotoStripView;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.data.VkAppsList;
import com.vk.dto.menu.MenuResponse;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.user.UserProfile;
import com.vk.imageloader.view.VKImageView;
import com.vk.menu.presentation.entity.a;
import com.vk.music.player.PlayState;
import com.vk.music.player.e;
import com.vk.music.player.f;
import com.vk.navigation.NavigationDelegateActivity;
import com.vk.superapp.miniapp.MenuApiApplicationsCache;
import com.vk.superapp.miniapps.impl.AppsCatalogFragment;
import com.vk.superapp.multiaccount.api.MultiAccountEntryPoint;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.operators.observable.f0;
import io.reactivex.rxjava3.internal.operators.single.b0;
import io.reactivex.rxjava3.internal.operators.single.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import me.grishka.appkit.views.UsableRecyclerView;
import xsna.abg0;
import xsna.anj;
import xsna.aq20;
import xsna.asu0;
import xsna.baf0;
import xsna.bpn0;
import xsna.bwt0;
import xsna.c120;
import xsna.dhr0;
import xsna.dz2;
import xsna.e3m;
import xsna.ehu;
import xsna.g0;
import xsna.g620;
import xsna.gzv;
import xsna.hf3;
import xsna.hf8;
import xsna.hlu0;
import xsna.hwg0;
import xsna.i890;
import xsna.iah0;
import xsna.iq20;
import xsna.ir0;
import xsna.j6r0;
import xsna.j8;
import xsna.ja6;
import xsna.jb;
import xsna.jjc;
import xsna.jlu0;
import xsna.k720;
import xsna.k8t;
import xsna.kwg0;
import xsna.l8;
import xsna.le50;
import xsna.lo3;
import xsna.m33;
import xsna.m6r0;
import xsna.m820;
import xsna.mq20;
import xsna.nts;
import xsna.omw;
import xsna.oos;
import xsna.op20;
import xsna.ov2;
import xsna.p5y;
import xsna.pro0;
import xsna.ps2;
import xsna.q01;
import xsna.q6r0;
import xsna.qcy;
import xsna.qs2;
import xsna.r4;
import xsna.rsg0;
import xsna.s490;
import xsna.s6y;
import xsna.t820;
import xsna.too0;
import xsna.u1u0;
import xsna.ucp;
import xsna.uqm0;
import xsna.vif0;
import xsna.w720;
import xsna.w8i;
import xsna.wmi0;
import xsna.wmz;
import xsna.x720;
import xsna.x84;
import xsna.y720;
import xsna.y84;
import xsna.yfb;
import xsna.yx50;
import xsna.z720;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes7.dex */
public final class MenuListView extends FrameLayout implements too0, w8i {
    public static MenuListView L;
    public final io.reactivex.rxjava3.disposables.b A;
    public z720 B;
    public final Handler C;
    public final bpn0 D;
    public final bpn0 E;
    public final bpn0 F;
    public final bpn0 G;
    public final bpn0 H;
    public final bpn0 I;
    public final a J;
    public final b K;

    @NonNull
    public final yx50 b;
    public final int c;
    public final UsableRecyclerView d;
    public j e;
    public h f;
    public int g;
    public boolean h;
    public final ArrayList<MenuItem> i;
    public String j;
    public String k;
    public String l;
    public String m;
    public final View n;
    public final ProgressBar o;
    public final ImageView p;
    public int q;
    public final CopyOnWriteArrayList r;
    public final ArrayList s;
    public PlayState t;
    public float u;
    public final FrameLayout v;
    public float w;
    public int x;
    public VkAppsList y;
    public MenuResponse z;

    public class a extends e.a {
        public a() {
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void N3(PlayState playState, com.vk.music.player.f fVar) {
            PlayState playState2 = PlayState.STOPPED;
            MenuListView menuListView = MenuListView.this;
            if (playState == playState2 || playState == PlayState.IDLE) {
                if (menuListView.n.getVisibility() != 8) {
                    menuListView.n.setVisibility(8);
                    menuListView.j();
                    return;
                }
                return;
            }
            if (menuListView.o == null || !fVar.n()) {
                ProgressBar progressBar = menuListView.o;
                if (progressBar != null) {
                    Context context = progressBar.getContext();
                    e3m.a aVar = e3m.a;
                    progressBar.setProgressDrawable(m33.a(R.drawable.drawer_player_progress_ad, context));
                }
            } else {
                ProgressBar progressBar2 = menuListView.o;
                Context context2 = progressBar2.getContext();
                e3m.a aVar2 = e3m.a;
                progressBar2.setProgressDrawable(m33.a(R.drawable.drawer_player_progress, context2));
            }
            if (menuListView.n.getVisibility() != 0) {
                menuListView.n.setVisibility(0);
                menuListView.j();
                menuListView.i();
            }
            MusicTrack f = fVar.f();
            f.a.C1335a c1335a = fVar.j;
            if (f != null) {
                TextView textView = (TextView) menuListView.n.findViewById(R.id.player_view_artist);
                TextView textView2 = (TextView) menuListView.n.findViewById(R.id.player_view_title);
                CharSequence g = !fVar.n() ? null : c1335a.g(fVar, fVar.k);
                if (!textView.getText().equals(g)) {
                    u1u0.i(textView, g, true);
                }
                Context context3 = textView2.getContext();
                String i = c1335a.i(fVar, fVar.k);
                String c = c1335a.c(fVar, fVar.k);
                Float valueOf = Float.valueOf(textView2.getTextSize());
                ucp ucpVar = ucp.a;
                CharSequence j = ucp.j(s490.d(context3, i, c, R.attr.vk_ui_text_secondary), valueOf);
                if (!textView2.getText().equals(j)) {
                    u1u0.i(textView2, j, true);
                }
                s490.a(textView2, f.s, e3m.f(R.attr.vk_ui_icon_secondary, textView2.getContext()));
            }
            PlayState playState3 = menuListView.t;
            if (playState3 != playState || playState3 == null) {
                menuListView.t = playState;
                menuListView.p.setImageDrawable(new baf0(m33.a(playState == PlayState.PLAYING ? R.drawable.vk_icon_pause_24 : R.drawable.vk_icon_play_24, menuListView.getContext()), e3m.f(R.attr.vk_ui_icon_secondary, menuListView.getContext())));
                menuListView.postInvalidate();
            }
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void W3(com.vk.music.player.f fVar) {
            MenuListView.this.o.setProgress(fVar.i());
        }
    }

    public class b extends BroadcastReceiver {
        public b() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            String valueOf = String.valueOf(intent.getAction());
            char c = 65535;
            switch (valueOf.hashCode()) {
                case -1414915502:
                    if (valueOf.equals("com.vkontakte.android.COUNTERS_UPDATED")) {
                        c = 0;
                        break;
                    }
                    break;
                case -443120485:
                    if (valueOf.equals("com.vkontakte.android.ACTION_PROFILE_UPDATED")) {
                        c = 1;
                        break;
                    }
                    break;
                case 333377586:
                    if (valueOf.equals("com.vkontakte.android.USER_PHOTO_CHANGED")) {
                        c = 2;
                        break;
                    }
                    break;
                case 611799995:
                    if (valueOf.equals("com.vkontakte.android.FRIEND_REQUESTS_CHANGED")) {
                        c = 3;
                        break;
                    }
                    break;
                case 612532405:
                    if (valueOf.equals("com.vkontakte.android.USER_NAME_CHANGED")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            MenuListView menuListView = MenuListView.this;
            switch (c) {
                case 0:
                case 3:
                    if (!intent.getBooleanExtra("out", false)) {
                        menuListView.i();
                        break;
                    }
                    break;
                case 1:
                    if (Objects.equals(intent.getParcelableExtra("uid"), q6r0.f().y())) {
                        menuListView.k();
                        break;
                    }
                    break;
                case 2:
                    if (Objects.equals(intent.getParcelableExtra("id"), q6r0.f().y())) {
                        menuListView.k = intent.getStringExtra("photo");
                        menuListView.i();
                        break;
                    }
                    break;
                case 4:
                    menuListView.j = intent.getStringExtra("name");
                    menuListView.i();
                    break;
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            MenuListView.this.e.notifyDataSetChanged();
        }
    }

    public class d extends g {
        public ApiApplication q;

        @Override // com.vkontakte.android.ui.widget.MenuListView.g, me.grishka.appkit.views.UsableRecyclerView.r
        public final boolean P4() {
            if (this.q != null) {
                com.vk.menu.presentation.entity.a aVar = com.vk.menu.presentation.entity.a.a;
                Preference.I("menu_prefs", "menu_item_just_clicked", true);
                hf3.c(new op20(this.q, this.itemView.getContext(), new mq20(), new iq20(), new aq20()));
            }
            return true;
        }

        @Override // com.vkontakte.android.ui.widget.MenuListView.g, me.grishka.appkit.views.UsableRecyclerView.e
        public final void onClick() {
            if (this.q != null) {
                com.vk.menu.presentation.entity.a aVar = com.vk.menu.presentation.entity.a.a;
                Preference.I("menu_prefs", "menu_item_just_clicked", true);
                hf3.c(new op20(this.q, this.itemView.getContext(), new mq20(), new iq20(), new aq20()));
            }
        }

        @Override // com.vkontakte.android.ui.widget.MenuListView.g, xsna.vif0
        /* renamed from: q6, reason: merged with bridge method [inline-methods] */
        public final void i6(ApiApplication apiApplication) {
            super.i6(apiApplication);
            this.q = apiApplication;
        }
    }

    public class e extends vif0<Void> implements UsableRecyclerView.s, UsableRecyclerView.r {

        @Nullable
        public final TextView n;

        @Nullable
        public final TextView o;

        @Nullable
        public final TextView p;
        public final PhotoStripView q;
        public final ImageView r;

        public class a implements PhotoStripView.b {
            public a() {
            }
        }

        public e(ViewGroup viewGroup) {
            super(R.layout.left_menu_item_birthdays, viewGroup.getContext());
            ImageView imageView = (ImageView) this.itemView.findViewById(R.id.leftmenu_icon);
            this.r = imageView;
            imageView.setImageDrawable(dhr0.t.a(R.drawable.vk_icon_gift_32));
            MenuListView.a(MenuListView.this, MenuListView.this.B, null, imageView, null, null, null);
            this.n = (TextView) this.itemView.findViewById(R.id.leftmenu_text);
            this.o = (TextView) this.itemView.findViewById(R.id.leftmenu_counter);
            this.p = (TextView) this.itemView.findViewById(R.id.leftmenu_counter2);
            PhotoStripView photoStripView = (PhotoStripView) this.itemView.findViewById(R.id.leftmenu_photo_strip);
            this.q = photoStripView;
            WeakHashMap weakHashMap = j6r0.a;
            photoStripView.setPadding(iah0.a(6.0f));
            photoStripView.setListener(new a());
        }

        @Override // me.grishka.appkit.views.UsableRecyclerView.r
        public final boolean P4() {
            m820.d(MenuListView.this.b, R.id.menu_birthdays, false, null, 48);
            return true;
        }

        @Override // xsna.vif0
        public final void i6(Void r8) {
            MenuListView menuListView = MenuListView.this;
            int i = menuListView.g;
            CopyOnWriteArrayList copyOnWriteArrayList = menuListView.r;
            this.r.setSelected(i == R.id.menu_birthdays);
            int size = copyOnWriteArrayList.size();
            PhotoStripView photoStripView = this.q;
            photoStripView.setCount(size);
            for (int i2 = 0; i2 < copyOnWriteArrayList.size(); i2++) {
                photoStripView.h(i2, ((UserProfile) copyOnWriteArrayList.get(i2)).h);
            }
            TextView textView = this.n;
            if (textView != null) {
                textView.setText(menuListView.m);
            }
            TextView textView2 = this.p;
            if (textView2 != null) {
                if (copyOnWriteArrayList.size() > 2) {
                    textView2.setVisibility(0);
                    textView2.setText("+" + (copyOnWriteArrayList.size() - 2));
                } else {
                    textView2.setVisibility(8);
                }
            }
            TextView textView3 = this.o;
            if (textView3 != null) {
                if (copyOnWriteArrayList.size() > 4) {
                    textView3.setVisibility(0);
                    StringBuilder sb = new StringBuilder("+");
                    sb.append(copyOnWriteArrayList.size() - 3);
                    textView3.setText(sb.toString());
                } else {
                    textView3.setVisibility(8);
                }
            }
            q6();
        }

        @Override // me.grishka.appkit.views.UsableRecyclerView.e
        public final void onClick() {
            m820.c(MenuListView.this.b, R.id.menu_birthdays, false);
        }

        public final void q6() {
            WeakHashMap weakHashMap = j6r0.a;
            float a2 = iah0.a(-24.0f);
            MenuListView menuListView = MenuListView.this;
            this.r.setTranslationX((1.0f - menuListView.u) * a2);
            float a3 = (1.0f - menuListView.u) * iah0.a(-52.0f);
            PhotoStripView photoStripView = this.q;
            photoStripView.setTranslationX(a3);
            float f = (menuListView.u * 0.3f) + 0.7f;
            photoStripView.setScaleX(f);
            photoStripView.setScaleY(f);
            photoStripView.setOverlapOffset((menuListView.u * 0.5f) + 0.5f);
            int max = (int) ((Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, menuListView.u - 0.5f) / 0.5f) * 255.0f);
            SparseIntArray sparseIntArray = photoStripView.f;
            if (max == 255) {
                sparseIntArray.delete(2);
            } else {
                sparseIntArray.append(2, max);
            }
            photoStripView.invalidate();
            SparseIntArray sparseIntArray2 = photoStripView.f;
            if (max == 255) {
                sparseIntArray2.delete(3);
            } else {
                sparseIntArray2.append(3, max);
            }
            photoStripView.invalidate();
            TextView textView = this.p;
            if (textView != null) {
                textView.setAlpha(1.0f - Math.min(1.0f, menuListView.u / 0.2f));
            }
        }
    }

    public class f extends vif0<Void> {
        @Override // xsna.vif0
        public final /* bridge */ /* synthetic */ void i6(Void r1) {
        }
    }

    public class g extends vif0<ApiApplication> implements UsableRecyclerView.s, UsableRecyclerView.r {
        public final VKImageView n;
        public final TextView o;

        public g(ViewGroup viewGroup) {
            super(R.layout.left_menu_item2, viewGroup.getContext());
            this.itemView.findViewById(R.id.flist_item_online).setVisibility(8);
            this.n = (VKImageView) this.itemView.findViewById(R.id.flist_item_photo);
            this.o = (TextView) this.itemView.findViewById(R.id.flist_item_text);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public boolean P4() {
            k8t.a(MenuListView.this.getContext(), (ApiApplication) this.m, "menu");
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void onClick() {
            k8t.a(MenuListView.this.getContext(), (ApiApplication) this.m, "menu");
        }

        @Override // xsna.vif0
        /* renamed from: q6 */
        public void i6(ApiApplication apiApplication) {
            this.itemView.setContentDescription(apiApplication.c);
            this.o.setText(apiApplication.c);
            this.n.load(apiApplication.d.Fb(200, false).d.d);
            MenuListView menuListView = MenuListView.this;
            MenuListView.a(menuListView, menuListView.B, null, null, this.o, null, null);
            this.o.setAlpha(Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, menuListView.u - 0.3f) / 0.7f);
        }
    }

    public class h extends vif0<Void> implements UsableRecyclerView.e, UsableRecyclerView.r {
        public static final /* synthetic */ int s = 0;
        public final VKImageView n;
        public final TextView o;
        public final TextView p;
        public final View q;

        public h(ViewGroup viewGroup) {
            super(R.layout.left_menu_item_me, viewGroup.getContext());
            this.n = (VKImageView) this.itemView.findViewById(R.id.flist_item_photo);
            this.o = (TextView) this.itemView.findViewById(R.id.flist_item_text);
            this.p = (TextView) this.itemView.findViewById(R.id.status);
            this.q = this.itemView.findViewById(R.id.padder);
            MenuListView.this.f = this;
        }

        @Override // me.grishka.appkit.views.UsableRecyclerView.r
        public final boolean P4() {
            MenuListView menuListView = MenuListView.this;
            yx50 yx50Var = menuListView.b;
            if (!((hlu0) menuListView.E.getValue()).a()) {
                m820.d(yx50Var, R.id.menu_profile, false, null, 48);
                return true;
            }
            FragmentImpl u = yx50Var.u();
            if (u != null) {
                ((jlu0) menuListView.D.getValue()).e(u, MultiAccountEntryPoint.LongTap.d);
                return true;
            }
            m820.d(yx50Var, R.id.menu_profile, false, null, 48);
            return true;
        }

        @Override // xsna.vif0
        public final void i6(Void r8) {
            CharSequence string;
            MenuListView menuListView = MenuListView.this;
            this.q.setLayoutParams(new RelativeLayout.LayoutParams(-1, menuListView.q));
            MenuListView.a(menuListView, menuListView.B, this.itemView, null, this.o, null, null);
            this.o.setText(menuListView.j);
            String str = menuListView.l;
            if (str == null || str.length() <= 0) {
                string = b6().getString(R.string.online);
            } else {
                ucp ucpVar = ucp.a;
                string = ucp.i(menuListView.l);
            }
            this.p.setText(string);
            VKImageView vKImageView = this.n;
            vKImageView.setRound(true);
            vKImageView.load(menuListView.k);
            q6();
        }

        @Override // me.grishka.appkit.views.UsableRecyclerView.e
        public final void onClick() {
            if (jjc.b()) {
                return;
            }
            m820.c(MenuListView.this.b, R.id.menu_profile, false);
        }

        public final void q6() {
            MenuListView menuListView = MenuListView.this;
            float f = (menuListView.u * 0.44444448f) + 0.5555555f;
            VKImageView vKImageView = this.n;
            vKImageView.setScaleX(f);
            vKImageView.setScaleY(f);
            WeakHashMap weakHashMap = j6r0.a;
            vKImageView.setTranslationY((1.0f - menuListView.u) * iah0.a(84.0f));
            float max = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, menuListView.u - 0.5f) / 0.5f;
            this.o.setAlpha(max);
            this.p.setAlpha(max);
        }
    }

    public class i extends vif0<MenuItem> implements UsableRecyclerView.s, UsableRecyclerView.r {
        public final TextView n;
        public final TextView o;
        public final TextView p;
        public final TextView q;
        public final ImageView r;

        public i(int i, ViewGroup viewGroup) {
            super(i, viewGroup.getContext());
            this.n = (TextView) this.itemView.findViewById(R.id.leftmenu_text);
            this.o = (TextView) this.itemView.findViewById(R.id.leftmenu_counter);
            this.p = (TextView) this.itemView.findViewById(R.id.leftmenu_counter2);
            this.q = (TextView) this.itemView.findViewById(R.id.leftmenu_new_badge);
            this.r = (ImageView) this.itemView.findViewById(R.id.leftmenu_icon);
        }

        @Override // me.grishka.appkit.views.UsableRecyclerView.r
        public final boolean P4() {
            m820.d(MenuListView.this.b, ((MenuItem) this.m).getItemId(), false, null, 48);
            return true;
        }

        @Override // xsna.vif0
        public final void i6(MenuItem menuItem) {
            CharSequence title;
            MenuItem menuItem2 = menuItem;
            int itemId = menuItem2.getItemId();
            TextView textView = this.n;
            if (itemId == R.id.menu_ads_easy_promote && !q6r0.f().q().b.isEmpty()) {
                textView.setText(q6r0.f().q().b);
            } else if (menuItem2.getItemId() == R.id.menu_feed_likes) {
                textView.setText(R.string.sett_reactions);
            } else {
                textView.setText(menuItem2.getTitle());
            }
            this.r.setImageDrawable(menuItem2.getIcon());
            MenuListView menuListView = MenuListView.this;
            MenuListView.a(menuListView, menuListView.B, this.itemView, this.r, this.n, this.o, this.p);
            com.vk.menu.presentation.entity.a aVar = com.vk.menu.presentation.entity.a.a;
            int g = com.vk.menu.presentation.entity.a.g(menuItem2.getItemId());
            TextView textView2 = this.p;
            TextView textView3 = this.o;
            if (g == 0) {
                this.itemView.setContentDescription(menuItem2.getTitle());
                textView3.setVisibility(8);
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
            } else {
                View view = this.itemView;
                if (menuItem2.getItemId() == R.id.menu_messages) {
                    int b = (int) uqm0.b(g);
                    title = ((Object) menuItem2.getTitle()) + " " + a6(R.plurals.accessibility_messenger_tab_hint, b, Integer.valueOf(b));
                } else {
                    title = menuItem2.getTitle();
                }
                view.setContentDescription(title);
                textView3.setVisibility(0);
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
                String o = uqm0.o(g);
                textView3.setText(o);
                if (textView2 != null) {
                    textView2.setText(o);
                }
            }
            k720 k720Var = k720.a;
            menuItem2.getItemId();
            this.q.setVisibility(8);
            this.itemView.setSelected(menuListView.g == menuItem2.getItemId());
            q6();
        }

        @Override // me.grishka.appkit.views.UsableRecyclerView.e
        public final void onClick() {
            m820.c(MenuListView.this.b, ((MenuItem) this.m).getItemId(), false);
        }

        public final void q6() {
            MenuListView menuListView = MenuListView.this;
            TextView textView = this.p;
            if (textView != null) {
                textView.setAlpha(1.0f - Math.min(1.0f, menuListView.u / 0.2f));
            }
            TextView textView2 = this.n;
            if (textView2 != null) {
                textView2.setAlpha(Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, menuListView.u - 0.3f) / 0.7f);
            }
            if (this.itemView.getBackground() != null) {
                this.itemView.getBackground().setLevel((int) ((1.0f - menuListView.u) * 10000.0f));
            }
        }
    }

    public class j extends UsableRecyclerView.c<vif0> implements a.InterfaceC1268a {
        public List<t820> c = Collections.EMPTY_LIST;

        public j() {
            setHasStableIds(true);
        }

        @Override // com.vk.menu.presentation.entity.a.InterfaceC1268a
        public final int M(int i) {
            for (t820 t820Var : this.c) {
                if (t820Var.b == i) {
                    return this.c.indexOf(t820Var);
                }
            }
            return -1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.c.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final long getItemId(int i) {
            return this.c.get(i).b;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemViewType(int i) {
            return this.c.get(i).a;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
            ((vif0) e0Var).V5(this.c.get(i).c);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            MenuListView menuListView = MenuListView.this;
            if (i == R.id.left_menu_item_type_section) {
                return menuListView.new m(viewGroup);
            }
            if (i == R.id.left_menu_item_type_extra_section) {
                return menuListView.new l(viewGroup);
            }
            if (i == R.id.left_menu_item_type_birthday) {
                return menuListView.new e(viewGroup);
            }
            if (i == R.id.left_menu_item_type_header) {
                return menuListView.new h(viewGroup);
            }
            if (i == R.id.left_menu_item_type_item) {
                return menuListView.new i(R.layout.left_menu_item, viewGroup);
            }
            if (i == R.id.left_menu_item_type_divider) {
                f fVar = new f(new View(viewGroup.getContext()));
                View view = fVar.itemView;
                WeakHashMap weakHashMap = j6r0.a;
                view.setLayoutParams(new RecyclerView.p(-1, iah0.a(16.0f)));
                fVar.itemView.setBackgroundResource(R.drawable.left_divider);
                return fVar;
            }
            if (i == R.id.left_menu_item_type_padding) {
                k kVar = new k(new View(viewGroup.getContext()));
                View view2 = kVar.itemView;
                WeakHashMap weakHashMap2 = j6r0.a;
                view2.setLayoutParams(new RecyclerView.p(-1, iah0.a(8.0f)));
                return kVar;
            }
            if (i == R.id.left_menu_item_type_game) {
                return menuListView.new g(viewGroup);
            }
            if (i == R.id.left_menu_item_type_apps) {
                return menuListView.new d(viewGroup);
            }
            if (i == R.id.left_menu_item_type_vk_pay) {
                return menuListView.new n(R.layout.left_menu_item_vk_pay, viewGroup);
            }
            return null;
        }
    }

    public class k extends vif0<Void> {
        @Override // xsna.vif0
        public final /* bridge */ /* synthetic */ void i6(Void r1) {
        }
    }

    public class l extends vif0<Pair<String, Integer>> implements View.OnClickListener {
        public int n;
        public final TextView o;
        public final TextView p;

        public l(ViewGroup viewGroup) {
            super(R.layout.list_menu_section_extra_header, viewGroup.getContext());
            View view = this.itemView;
            WeakHashMap weakHashMap = j6r0.a;
            view.setLayoutParams(new RecyclerView.p(-1, iah0.a(56.0f)));
            this.o = (TextView) this.itemView.findViewById(R.id.title);
            TextView textView = (TextView) this.itemView.findViewById(R.id.button);
            this.p = textView;
            qcy<Object>[] qcyVarArr = bwt0.a;
            lo3 lo3Var = new lo3(this, 6);
            bpn0 bpn0Var = jjc.a;
            textView.setOnClickListener(new q01(lo3Var, 2));
        }

        @Override // xsna.vif0
        public final void i6(Pair<String, Integer> pair) {
            Pair<String, Integer> pair2 = pair;
            this.o.setText((CharSequence) pair2.first);
            this.n = ((Integer) pair2.second).intValue();
            q6();
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            new AppsCatalogFragment.a().k(view.getContext());
            com.vk.menu.presentation.entity.a aVar = com.vk.menu.presentation.entity.a.a;
            Preference.I("menu_prefs", "menu_item_just_clicked", true);
        }

        public final void q6() {
            TextView textView = this.o;
            int currentTextColor = textView.getCurrentTextColor() & 16777215;
            MenuListView menuListView = MenuListView.this;
            textView.setTextColor(currentTextColor | (((int) (menuListView.u * 255.0f)) << 24));
            TextView textView2 = this.p;
            textView2.setTextColor((textView2.getCurrentTextColor() & 16777215) | (((int) (menuListView.u * 255.0f)) << 24));
            ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
            layoutParams.height = iah0.a(16) + ((int) (iah0.a(40) * menuListView.u));
            this.itemView.setLayoutParams(layoutParams);
            View view = this.itemView;
            float f = this.n * 40;
            WeakHashMap weakHashMap = j6r0.a;
            view.setTranslationY((1.0f - menuListView.u) * (-iah0.a(f)));
        }
    }

    public class m extends vif0<Pair<String, Integer>> {
        public int n;

        public m(ViewGroup viewGroup) {
            super(R.layout.list_menu_section_header, viewGroup.getContext());
            View view = this.itemView;
            WeakHashMap weakHashMap = j6r0.a;
            view.setLayoutParams(new RecyclerView.p(-1, iah0.a(56.0f)));
        }

        @Override // xsna.vif0
        public final void i6(Pair<String, Integer> pair) {
            Pair<String, Integer> pair2 = pair;
            ((TextView) this.itemView).setText((CharSequence) pair2.first);
            this.n = ((Integer) pair2.second).intValue();
            q6();
        }

        public final void q6() {
            TextView textView = (TextView) this.itemView;
            int currentTextColor = textView.getCurrentTextColor() & 16777215;
            MenuListView menuListView = MenuListView.this;
            textView.setTextColor(currentTextColor | (((int) (menuListView.u * 255.0f)) << 24));
            View view = this.itemView;
            float f = this.n * 40;
            WeakHashMap weakHashMap = j6r0.a;
            view.setTranslationY((1.0f - menuListView.u) * (-iah0.a(f)));
        }
    }

    public class n extends i {
    }

    public MenuListView(NavigationDelegateActivity navigationDelegateActivity, @NonNull yx50 yx50Var) {
        super(navigationDelegateActivity);
        this.c = R.menu.vk_left_menu;
        this.g = -1;
        this.h = true;
        this.i = new ArrayList<>();
        this.m = null;
        this.r = new CopyOnWriteArrayList();
        this.s = new ArrayList();
        this.t = null;
        this.u = 1.0f;
        this.w = -1.0f;
        this.x = 0;
        this.y = new VkAppsList();
        this.A = new io.reactivex.rxjava3.disposables.b();
        this.B = yx50.s0();
        this.C = new Handler(Looper.getMainLooper());
        this.D = new bpn0(new s6y(this, 5));
        this.E = new bpn0(new gzv(this, 10));
        this.F = new bpn0(new x84(20));
        this.G = new bpn0(new y84(8));
        this.H = new bpn0(new jb(22));
        this.I = new bpn0(new p5y(this, 7));
        this.J = new a();
        this.K = new b();
        this.b = yx50Var;
        setSaveEnabled(true);
        e(true);
        UsableRecyclerView usableRecyclerView = new UsableRecyclerView(getContext());
        this.d = usableRecyclerView;
        getContext();
        usableRecyclerView.setLayoutManager(new LinearLayoutManager());
        this.d.setAdapter(this.e);
        this.d.setHasFixedSize(true);
        Drawable a2 = m33.a(R.drawable.drawer_highlight_tablet, getContext());
        UsableRecyclerView usableRecyclerView2 = this.d;
        WeakHashMap weakHashMap = j6r0.a;
        int a3 = iah0.a(204.0f);
        i890 i890Var = new i890(new Drawable[]{a2});
        i890Var.b = new Rect();
        i890Var.e = true;
        i890Var.d = a2;
        i890Var.c = a3;
        usableRecyclerView2.setSelector(i890Var);
        setClipToPadding(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.bottomMargin = iah0.a(-56.0f);
        this.d.setLayoutParams(layoutParams);
        this.d.setClipToPadding(false);
        addView(this.d);
        View inflate = View.inflate(getContext(), R.layout.menu_audio_player, null);
        this.n = inflate;
        this.p = (ImageView) inflate.findViewById(R.id.player_view_button);
        this.o = (ProgressBar) this.n.findViewById(R.id.player_view_progress);
        this.v = new FrameLayout(getContext());
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        omw.d(imageView, ((Activity) getContext()).isTaskRoot() ? R.drawable.vk_icon_menu_outline_28 : R.drawable.vk_icon_arrow_left_outline_28, R.attr.vk_ui_icon_secondary);
        imageView.setBackgroundResource(R.drawable.highlight);
        this.v.addView(imageView, new FrameLayout.LayoutParams(iah0.a(56.0f), iah0.a(56.0f), 17));
        this.v.setLayoutParams(new FrameLayout.LayoutParams(iah0.a(84.0f), iah0.a(64.0f), 51));
        imageView.setOnClickListener(new w720(this));
        if (q6r0.f().A()) {
            f();
        }
        this.n.setVisibility(8);
        j();
        this.p.setOnClickListener(new r4(this, 4));
        this.n.findViewById(R.id.player_view_content).setOnClickListener(new x720(this));
        this.n.findViewById(R.id.player_view_title).setSelected(true);
        this.n.findViewById(R.id.player_view_artist).setSelected(true);
        this.n.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 80));
        addView(this.n);
        FrameLayout frameLayout = this.v;
        if (frameLayout != null) {
            addView(frameLayout);
        }
        this.d.addOnScrollListener(new y720(this));
        getRootView().getViewTreeObserver().addOnPreDrawListener(new com.vkontakte.android.ui.widget.a(this));
        b(this.B);
    }

    public static void a(MenuListView menuListView, z720 z720Var, View view, ImageView imageView, TextView textView, TextView textView2, TextView textView3) {
        if (z720Var instanceof z720.b) {
            if (view != null) {
                dhr0.h0(z720Var.d, view);
            }
            if (textView != null) {
                dhr0.a.m0(textView, z720Var.b);
            }
            if (textView2 != null) {
                dhr0.a.m0(textView2, z720Var.e);
                textView2.setBackgroundTintList(null);
                dhr0.h0(z720Var.f, textView2);
            }
            if (textView3 != null) {
                dhr0.a.m0(textView3, z720Var.e);
                textView3.setBackgroundTintList(null);
                dhr0.h0(z720Var.g, textView3);
            }
            if (imageView != null) {
                int[][] iArr = {new int[]{-16842913}, new int[]{android.R.attr.state_selected}};
                z720.b bVar = (z720.b) z720Var;
                bVar.getClass();
                abg0 abg0Var = dhr0.t;
                imageView.setImageTintList(new ColorStateList(iArr, new int[]{abg0Var.c(R.attr.vk_ui_icon_secondary), abg0Var.c(bVar.h)}));
                return;
            }
            return;
        }
        if (z720Var instanceof z720.a) {
            if (view != null) {
                view.setBackgroundColor(menuListView.getContext().getColor(z720Var.d));
            }
            if (textView != null) {
                textView.setTextColor(anj.b(z720Var.b, menuListView.getContext()));
            }
            if (textView2 != null) {
                textView2.setTextColor(menuListView.getContext().getColor(z720Var.e));
                textView2.setBackgroundTintList(anj.b(z720Var.f, menuListView.getContext()));
            }
            if (textView3 != null) {
                textView3.setTextColor(menuListView.getContext().getColor(z720Var.e));
                textView3.setBackgroundTintList(anj.b(z720Var.g, menuListView.getContext()));
            }
            if (imageView != null) {
                imageView.setImageTintList(anj.b(z720Var.c, menuListView.getContext()));
            }
        }
    }

    @Override // xsna.too0
    public final void Ng() {
        u1u0.e(new ja6(this, 7));
    }

    public final void b(z720 z720Var) {
        if (z720Var instanceof z720.b) {
            dhr0 dhr0Var = dhr0.a;
            dhr0Var.e0(z720Var.a, this.v);
            dhr0Var.e0(z720Var.a, this);
        } else if (z720Var instanceof z720.a) {
            setBackgroundColor(getContext().getColor(z720Var.a));
            this.v.setBackgroundColor(getContext().getColor(z720Var.a));
        }
        this.B = z720Var;
    }

    public final ArrayList c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new t820(R.id.left_menu_item_type_header, R.id.left_menu_id_header, null));
        arrayList.add(new t820(R.id.left_menu_item_type_padding, R.id.left_menu_id_padding, null));
        int i2 = 0;
        while (true) {
            ArrayList<MenuItem> arrayList2 = this.i;
            if (i2 >= arrayList2.size()) {
                break;
            }
            MenuItem menuItem = arrayList2.get(i2);
            arrayList.add(new t820(menuItem.getItemId() == R.id.menu_vk_pay ? R.id.left_menu_item_type_vk_pay : R.id.left_menu_item_type_item, menuItem.getItemId(), menuItem));
            i2++;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.r;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
            arrayList.add(new t820(R.id.left_menu_item_type_divider, R.id.left_menu_id_divider, null));
            arrayList.add(new t820(R.id.left_menu_item_type_birthday, R.id.left_menu_id_birthday, null));
        }
        VkAppsList vkAppsList = this.y;
        if (vkAppsList != null && !vkAppsList.b.isEmpty()) {
            arrayList.add(new t820(R.id.left_menu_item_type_extra_section, R.id.left_menu_id_app_section, new Pair(getContext().getResources().getString(R.string.menu_mini_apps), 0)));
            for (ApiApplication apiApplication : this.y.b) {
                arrayList.add(new t820(R.id.left_menu_item_type_apps, (int) apiApplication.b.b, apiApplication));
            }
        }
        ArrayList arrayList3 = this.s;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            arrayList.add(new t820(R.id.left_menu_item_type_section, R.id.left_menu_id_game_section, new Pair(getContext().getResources().getString(R.string.games), 0)));
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                ApiApplication apiApplication2 = (ApiApplication) it.next();
                arrayList.add(new t820(R.id.left_menu_item_type_game, (int) apiApplication2.b.b, apiApplication2));
            }
        }
        return arrayList;
    }

    @Nullable
    public final MenuItem d(int i2) {
        if (i2 == -1) {
            return null;
        }
        Iterator<MenuItem> it = this.i.iterator();
        while (it.hasNext()) {
            MenuItem next = it.next();
            if (next.getItemId() == i2) {
                return next;
            }
        }
        return null;
    }

    public final void e(boolean z) {
        j jVar;
        androidx.appcompat.view.menu.f fVar = new androidx.appcompat.view.menu.f(getContext());
        this.b.b.getMenuInflater().inflate(this.c, fVar);
        if (g620.f().getExperiments().f()) {
            fVar.removeItem(R.id.menu_clips);
        }
        ArrayList<MenuItem> arrayList = this.i;
        arrayList.clear();
        for (int i2 = 0; i2 < fVar.f.size(); i2++) {
            MenuItem item = fVar.getItem(i2);
            com.vk.menu.presentation.entity.a aVar = com.vk.menu.presentation.entity.a.a;
            if (item.getItemId() == R.id.menu_debug) {
                item.setTitle("v" + BuildInfo.d + " (" + BuildInfo.e + ')');
            }
            if (m820.b(item.getItemId(), getContext(), false) && item.isVisible()) {
                arrayList.add(item);
            }
        }
        if (z || (jVar = this.e) == null) {
            jVar = new j();
        }
        this.e = jVar;
        jVar.c = c();
        jVar.notifyDataSetChanged();
        com.vk.menu.presentation.entity.a aVar2 = com.vk.menu.presentation.entity.a.a;
        com.vk.menu.presentation.entity.a.b = this.e;
        m6r0 f2 = q6r0.f();
        this.j = f2.r();
        this.k = f2.u();
        this.l = (String) f2.a(m6r0.l);
    }

    public final void f() {
        h();
        k720 k720Var = k720.a;
        int i2 = 3;
        io.reactivex.rxjava3.disposables.c subscribe = k720.t.subscribe(new c120(this, i2));
        io.reactivex.rxjava3.disposables.b bVar = this.A;
        bVar.b(subscribe);
        if (k720.i < 0) {
            k720.i = (int) Preference.m(-1L, "menu_items", (String) k720.b.getValue());
        }
        bVar.b(((System.currentTimeMillis() / ((long) 1000)) - ((long) k720.i) > TimeUnit.HOURS.toSeconds(6L) ? k720.R() : wmi0.a.e("key_menu_games_list").c0(k720.R())).subscribe(new wmz(new ehu(8), i2), kwg0.b()));
        MenuApiApplicationsCache menuApiApplicationsCache = MenuApiApplicationsCache.b;
        bVar.b(MenuApiApplicationsCache.g.subscribe(new ir0(this, 24)));
        MenuApiApplicationsCache.d();
    }

    public final void g() {
        k();
        if (!((Activity) getContext()).isTaskRoot()) {
            if (!this.h) {
                return;
            }
            com.vk.menu.presentation.entity.a aVar = com.vk.menu.presentation.entity.a.a;
            if (!Preference.d("menu_prefs", "menu_item_just_clicked", true)) {
                setCurrentItemId((int) Preference.m(-1L, "menu_prefs", "menu_current_item_id"));
                this.h = false;
                return;
            }
        }
        yx50 yx50Var = this.b;
        FragmentImpl u = yx50Var.u();
        int t0 = u != null ? yx50Var.t0(u) : -1;
        int i2 = d(t0) != null ? t0 : -1;
        com.vk.menu.presentation.entity.a aVar2 = com.vk.menu.presentation.entity.a.a;
        Preference.F(i2, "menu_prefs", "menu_current_item_id");
        Preference.I("menu_prefs", "menu_item_just_clicked", false);
        setCurrentItemId(i2);
        this.h = false;
    }

    @Nullable
    public RecyclerView getListView() {
        return this.d;
    }

    public final void h() {
        dz2 x = yfb.x(((nts) this.F.getValue()).o(5, 0));
        x.K("fields", UsersFieldsDto.FIRST_NAME_GEN.i());
        f0 W = rsg0.W(x, 7);
        oos oosVar = (oos) this.G.getValue();
        Objects.requireNonNull(oosVar);
        y l2 = W.l(new j8(oosVar, 17)).l(new ps2(this, 24)).l(new l8(this, 27));
        asu0.a.getClass();
        b0 m2 = l2.q(asu0.i()).m(io.reactivex.rxjava3.android.schedulers.a.b());
        qs2 qs2Var = new qs2(this, 24);
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        Objects.requireNonNull(bVar);
        this.A.b(m2.subscribe(qs2Var, new le50(bVar, 25)));
    }

    public final void i() {
        pro0.e(new c());
    }

    public final void j() {
        WeakHashMap weakHashMap = j6r0.a;
        int a2 = iah0.a(56.0f);
        if (this.u == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            a2 += iah0.a(-28.0f);
        }
        if (this.n.getVisibility() == 0) {
            a2 += iah0.a(56.0f);
        }
        UsableRecyclerView usableRecyclerView = this.d;
        if (usableRecyclerView.getPaddingBottom() != a2) {
            usableRecyclerView.setPadding(0, 0, 0, a2);
        }
    }

    public final void k() {
        m6r0 f2 = q6r0.f();
        this.j = f2.r();
        this.k = f2.u();
        this.l = (String) f2.a(m6r0.l);
        i();
    }

    @Override // android.view.View
    @TargetApi(21)
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        int systemWindowInsetTop = windowInsets.getSystemWindowInsetTop();
        this.q = systemWindowInsetTop;
        if (systemWindowInsetTop != this.x) {
            FrameLayout frameLayout = this.v;
            if (frameLayout != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                WeakHashMap weakHashMap = j6r0.a;
                layoutParams.height = iah0.a(64.0f) + this.q;
                frameLayout.setLayoutParams(layoutParams);
                frameLayout.setPadding(0, this.q, 0, 0);
                this.n.setTranslationY(-this.q);
            }
            i();
            this.x = this.q;
        }
        return super.onApplyWindowInsets(windowInsets.replaceSystemWindowInsets(0, 0, 0, windowInsets.getSystemWindowInsetBottom()));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.vkontakte.android.ACTION_PROFILE_UPDATED");
        intentFilter.addAction("com.vkontakte.android.USER_PHOTO_CHANGED");
        intentFilter.addAction("com.vkontakte.android.USER_NAME_CHANGED");
        intentFilter.addAction("com.vkontakte.android.COUNTERS_UPDATED");
        intentFilter.addAction("com.vkontakte.android.FRIEND_REQUESTS_CHANGED");
        anj.d(getContext(), this.K, intentFilter, hf8.a, 4);
        this.b.v0().P0(this.J, true);
        L = this;
        io.reactivex.rxjava3.subjects.h hVar = k720.v;
        ov2 ov2Var = new ov2(this, 29);
        int i2 = kwg0.a;
        this.A.b(hVar.subscribe(ov2Var, new hwg0()));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        L = null;
        try {
            getContext().unregisterReceiver(this.K);
        } catch (Exception unused) {
        }
        com.vk.menu.presentation.entity.a.b = null;
        this.b.v0().n0(this.J);
        this.A.e();
        this.C.removeCallbacksAndMessages(null);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentItemId(savedState.b);
        this.h = false;
    }

    @Override // android.view.View
    @Nullable
    public final Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.g);
    }

    public void setCurrentItemId(int i2) {
        this.g = i2;
        this.e.notifyDataSetChanged();
    }

    public void setExpansion(float f2) {
        if (this.f != null) {
            int i2 = f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 2 : 0;
            UsableRecyclerView usableRecyclerView = this.d;
            usableRecyclerView.setOverScrollMode(i2);
            this.u = f2;
            if ((f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && this.w != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) || (f2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && this.w == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
                usableRecyclerView.post(new g0(this, 14));
            }
            h hVar = this.f;
            int i3 = h.s;
            hVar.q6();
            WeakHashMap weakHashMap = j6r0.a;
            float f3 = 1.0f - f2;
            usableRecyclerView.setTranslationY(iah0.a(-28.0f) * f3);
            this.v.setAlpha(1.0f - Math.min(1.0f, f2 / 0.2f));
            j();
            usableRecyclerView.getSelector().setLevel((int) (f3 * 10000.0f));
            this.o.setScaleX((f2 * 0.7083f) + 0.2917f);
            for (int i4 = 0; i4 < usableRecyclerView.getChildCount(); i4++) {
                RecyclerView.e0 childViewHolder = usableRecyclerView.getChildViewHolder(usableRecyclerView.getChildAt(i4));
                if (childViewHolder instanceof i) {
                    ((i) childViewHolder).q6();
                } else if (childViewHolder instanceof m) {
                    ((m) childViewHolder).q6();
                } else if (childViewHolder instanceof l) {
                    ((l) childViewHolder).q6();
                } else if (childViewHolder instanceof e) {
                    ((e) childViewHolder).q6();
                } else if (childViewHolder instanceof g) {
                    g gVar = (g) childViewHolder;
                    gVar.o.setAlpha(Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, MenuListView.this.u - 0.3f) / 0.7f);
                }
            }
            this.w = this.u;
        }
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public final int b;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.b = i;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.b);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.b = parcel.readInt();
        }
    }
}
