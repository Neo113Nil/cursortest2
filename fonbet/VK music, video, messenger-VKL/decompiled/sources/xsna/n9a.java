package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.vk.catalog2.common.ui.mvp.holder.stories.MusicClipsSelectorCatalogRootVh;
import com.vk.core.dialogs.bottomsheet.PersistentBottomSheetBehavior;
import com.vk.core.dialogs.bottomsheet.modern.impl.CustomisableBottomSheetFragment;
import com.vk.dto.music.AudioFromMusicCatalogInfo;
import com.vk.dto.music.MusicTrack;
import com.vkontakte.android.R;
import java.util.LinkedList;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.bh6;
import xsna.e3m;

/* compiled from: CatalogModalBottomSheetController.kt */
/* loaded from: classes6.dex */
public final class n9a extends bh6 {
    public static final /* synthetic */ qcy<Object>[] x;
    public final MusicClipsSelectorCatalogRootVh n;
    public final kn4 o;
    public boolean p;
    public boolean q;
    public MusicTrack r;
    public ViewPager s;
    public final pgn t = new pgn();
    public final PersistentBottomSheetBehavior u;
    public final o9a v;
    public final vs w;

    /* compiled from: CatalogModalBottomSheetController.kt */
    public static final class a implements bh6.c {
        public static final a a = new a();
    }

    /* compiled from: CatalogModalBottomSheetController.kt */
    public static final class b implements bh6.c {
        public final MusicTrack a;
        public final AudioFromMusicCatalogInfo b;

        public b(MusicTrack musicTrack, AudioFromMusicCatalogInfo audioFromMusicCatalogInfo) {
            this.a = musicTrack;
            this.b = audioFromMusicCatalogInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            AudioFromMusicCatalogInfo audioFromMusicCatalogInfo = this.b;
            return hashCode + (audioFromMusicCatalogInfo == null ? 0 : audioFromMusicCatalogInfo.hashCode());
        }

        public final String toString() {
            return "TrackSelectedEvent(musicTrack=" + this.a + ", musicCatalogInfo=" + this.b + ')';
        }
    }

    /* compiled from: CatalogModalBottomSheetController.kt */
    public static final class c implements bh6.c {
        public final boolean a;

        public c() {
            this(false);
        }

        public c(boolean z) {
            this.a = z;
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(n9a.class, "disposable", "getDisposable()Lio/reactivex/rxjava3/disposables/Disposable;", 0);
        fpf0.a.getClass();
        x = new qcy[]{mutablePropertyReference1Impl};
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [xsna.h9a] */
    public n9a(MusicClipsSelectorCatalogRootVh musicClipsSelectorCatalogRootVh, kn4 kn4Var) {
        this.n = musicClipsSelectorCatalogRootVh;
        this.o = kn4Var;
        PersistentBottomSheetBehavior persistentBottomSheetBehavior = new PersistentBottomSheetBehavior(musicClipsSelectorCatalogRootVh.b);
        persistentBottomSheetBehavior.I(an10.b(iah0.u() * 0.85f));
        persistentBottomSheetBehavior.h = true;
        persistentBottomSheetBehavior.J(4);
        this.u = persistentBottomSheetBehavior;
        this.v = new o9a(this);
        this.b = R.style.ModernBottomDialogTheme;
        this.c = true;
        this.k = persistentBottomSheetBehavior;
        this.i = new DialogInterface.OnKeyListener() { // from class: xsna.h9a
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return i == 4 && n9a.this.n.T(false);
            }
        };
        this.l = 32;
        this.e = new i9a();
        int i = 0;
        this.g = new j9a(this, i);
        this.f = new k9a(this, i);
        this.j = musicClipsSelectorCatalogRootVh;
        this.w = new vs(this, 15);
    }

    @Override // xsna.bh6, xsna.gw20
    public final izs<Configuration, s3q0> d() {
        return this.w;
    }

    @Override // xsna.bh6, xsna.gw20
    public final void onDestroy() {
        this.n.L();
        ViewPager viewPager = this.s;
        if (viewPager != null) {
            viewPager.removeOnPageChangeListener(this.v);
        }
        this.s = null;
    }

    @Override // xsna.bh6, xsna.gw20
    public final void onPause() {
        this.n.K();
    }

    @Override // xsna.bh6, xsna.gw20
    public final void onResume() {
        this.n.M();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        if (r6.isEmpty() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        if ((r7 instanceof androidx.viewpager.widget.ViewPager) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
    
        r2 = (androidx.viewpager.widget.ViewPager) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0068, code lost:
    
        r2 = null;
     */
    @Override // xsna.bh6, xsna.gw20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View x(CustomisableBottomSheetFragment customisableBottomSheetFragment, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewPager viewPager;
        View inflate = layoutInflater.inflate(R.layout.modern_modal_dialog_bottom_sheet, viewGroup, false);
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.designed_bottom_sheet);
        viewGroup2.setBackground(y(bwt0.u(customisableBottomSheetFragment.requireContext())));
        viewGroup2.addView(this.n.k5(layoutInflater, viewGroup, bundle));
        if (!(viewGroup2 instanceof ViewPager)) {
            LinkedList linkedList = new LinkedList();
            linkedList.add(viewGroup2);
            loop0: while (true) {
                ViewGroup viewGroup3 = (ViewGroup) linkedList.poll();
                View[] d = awt0.d(viewGroup3);
                int length = d.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    View view = d[i];
                    if (view instanceof ViewPager) {
                        viewPager = (ViewPager) view;
                        break loop0;
                    }
                    if (view instanceof ViewGroup) {
                        linkedList.add(view);
                    }
                    i++;
                }
            }
        } else {
            viewPager = (ViewPager) viewGroup2;
        }
        this.s = viewPager;
        if (viewPager != null) {
            viewPager.addOnPageChangeListener(this.v);
        }
        return inflate;
    }

    @Override // xsna.bh6
    public final Drawable y(Context context) {
        if (this.n == null) {
            return gu9.b(R.attr.vk_ui_background_modal, context);
        }
        e3m.a aVar = e3m.a;
        Drawable a2 = m33.a(R.drawable.vk_bg_card_elevation16_top, context);
        if (a2 == null) {
            return null;
        }
        a2.mutate();
        a2.setColorFilter(new PorterDuffColorFilter(e3m.f(R.attr.vk_ui_background_content, context), PorterDuff.Mode.MULTIPLY));
        return a2;
    }

    @Override // xsna.bh6
    public final View z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.n.k5(layoutInflater, viewGroup, bundle);
    }
}
