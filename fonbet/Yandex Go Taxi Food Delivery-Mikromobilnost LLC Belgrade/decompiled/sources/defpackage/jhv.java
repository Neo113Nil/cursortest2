package defpackage;

import android.content.Intent;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.transition.Transition;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import com.yandex.alicekit.core.permissions.Permission;
import com.yandex.alicekit.core.permissions.b;
import com.yandex.bricks.Brick;
import com.yandex.images.utils.ScaleMode;
import com.yandex.messaging.internal.LocalMessageRef;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.ui.imageviewer.ImageViewerInfo;
import com.yandex.messaging.ui.imageviewer.a;
import defpackage.ai91;
import defpackage.jhv;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.EmptyList;

/* loaded from: classes15.dex */
public final class jhv extends Brick implements ct31 {
    public final bhv A;
    public final rz10 B;
    public final FrameLayout C;
    public final s14 D;
    public final i3y E;
    public pzt0 F;
    public pzt0 G;
    public final FragmentActivity a;
    public final ImageViewerInfo b;
    public final xav c;
    public final b w;
    public final xs10 x;
    public final a y;
    public final Bundle z;

    public jhv(FragmentActivity fragmentActivity, ImageViewerInfo imageViewerInfo, xav xavVar, b bVar, xs10 xs10Var, a aVar, Bundle bundle, bhv bhvVar, rz10 rz10Var) {
        this.a = fragmentActivity;
        this.b = imageViewerInfo;
        this.c = xavVar;
        this.w = bVar;
        this.x = xs10Var;
        this.y = aVar;
        this.z = bundle;
        this.A = bhvVar;
        this.B = rz10Var;
        FrameLayout frameLayout = (FrameLayout) inflate(fragmentActivity, olh0.msg_b_image_viewer_layout);
        this.C = frameLayout;
        s14 s14Var = new s14(frameLayout);
        this.D = s14Var;
        this.E = kotlin.a.a(new ghv(this, 1));
        ViewPager viewPager = (ViewPager) s14Var.a;
        bhvVar.e = new reu(5, this);
        viewPager.setAdapter(bhvVar);
    }

    public static void s(View view, ServerMessageRef serverMessageRef, tls tlsVar) {
        view.setOnClickListener(serverMessageRef != null ? new vsn(13, tlsVar, serverMessageRef) : null);
    }

    @Override // com.yandex.bricks.Brick
    public final View getView() {
        return this.C;
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickAttach() {
        super.onBrickAttach();
        s14 s14Var = this.D;
        ((View) s14Var.m).setOnClickListener(new zgv(1, this));
        ImageView imageView = (ImageView) s14Var.d;
        ImageViewerInfo imageViewerInfo = this.b;
        imageView.setTransitionName(imageViewerInfo.getName());
        ViewPager viewPager = (ViewPager) s14Var.a;
        viewPager.addOnPageChangeListener(this);
        Bundle bundle = this.z;
        FragmentActivity fragmentActivity = this.a;
        if (bundle == null) {
            Point point = new Point();
            fragmentActivity.getWindowManager().getDefaultDisplay().getSize(point);
            viewPager.setVisibility(4);
            ((ViewGroup) s14Var.c).setVisibility(4);
            ((ViewGroup) s14Var.e).setVisibility(4);
            imageView.setVisibility(0);
            int i = point.x;
            Integer thumbWidth = imageViewerInfo.getThumbWidth();
            int min = Math.min(i, thumbWidth != null ? thumbWidth.intValue() : imageViewerInfo.getWidth());
            int i2 = point.y;
            Integer thumbHeight = imageViewerInfo.getThumbHeight();
            int min2 = Math.min(i2, thumbHeight != null ? thumbHeight.intValue() : imageViewerInfo.getHeight());
            yn50 yn50Var = (yn50) this.c.load(imageViewerInfo.getUrl());
            xn50 xn50Var = yn50Var.b;
            xn50Var.i = min;
            xn50Var.j = min2;
            xn50Var.k = ScaleMode.FIT_CENTER;
            yn50Var.b(null, new dnh(2, this));
        }
        if (this.B.a.a) {
            fragmentActivity.getWindow().getSharedElementEnterTransition().addListener(new Transition.TransitionListener(this) { // from class: com.yandex.messaging.ui.imageviewer.ImageViewerBrick$onBrickAttach$$inlined$addListener$default$1
                @Override // android.transition.Transition.TransitionListener
                public void onTransitionCancel(Transition transition) {
                    ai91.f((ViewGroup) jhv.this.D.c, false);
                    ai91.f((ViewGroup) jhv.this.D.e, false);
                }

                @Override // android.transition.Transition.TransitionListener
                public void onTransitionEnd(Transition transition) {
                    jhv.this.u();
                }

                @Override // android.transition.Transition.TransitionListener
                public void onTransitionPause(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public void onTransitionResume(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public void onTransitionStart(Transition transition) {
                }
            });
        } else {
            u();
        }
        this.A.i = this;
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickDetach() {
        super.onBrickDetach();
        this.w.d(44000);
        pzt0 pzt0Var = this.F;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.F = null;
        pzt0 pzt0Var2 = this.G;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        this.G = null;
        this.A.i = null;
    }

    @Override // defpackage.ct31
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // defpackage.ct31
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // defpackage.ct31
    public final void onPageSelected(int i) {
        r((mhv) this.A.n(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    @Override // com.yandex.bricks.Brick
    public final void onSaveInstanceState(Bundle bundle) {
        ?? r3;
        super.onSaveInstanceState(bundle);
        bhv bhvVar = this.A;
        if (bhvVar.b() != 0) {
            int currentItem = ((ViewPager) this.D.a).getCurrentItem();
            ImageViewerInfo imageViewerInfo = ((mhv) bhvVar.n(currentItem)).a;
            ArrayList arrayList = bhvVar.d;
            if (arrayList != null) {
                LocalMessageRef localMessageRef = ((mhv) arrayList.get(currentItem)).a.getLocalMessageRef();
                r3 = new ArrayList();
                int size = arrayList.size();
                for (int i = currentItem; i < size && jl40.l(((mhv) arrayList.get(i)).a.getLocalMessageRef(), localMessageRef); i++) {
                    r3.add(arrayList.get(i));
                }
                while (true) {
                    currentItem--;
                    if (-1 >= currentItem || !jl40.l(((mhv) arrayList.get(currentItem)).a.getLocalMessageRef(), localMessageRef)) {
                        break;
                    } else {
                        r3.add(0, arrayList.get(currentItem));
                    }
                }
            } else {
                r3 = EmptyList.a;
            }
            Iterable iterable = (Iterable) r3;
            ArrayList arrayList2 = new ArrayList(tcc.n(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList2.add(((mhv) it.next()).a);
            }
            bundle.putParcelable("state_current_item", imageViewerInfo);
            bundle.putParcelableArrayList("state_current_gallery", new ArrayList<>(arrayList2));
        }
    }

    public final void q(String str, ServerMessageRef serverMessageRef) {
        Intent intent = new Intent(str);
        intent.putExtra("server_ref", serverMessageRef);
        FragmentActivity fragmentActivity = this.a;
        fragmentActivity.setResult(-1, intent);
        fragmentActivity.finish();
    }

    public final void r(final mhv mhvVar) {
        s14 s14Var = this.D;
        ImageView imageView = (ImageView) s14Var.d;
        View view = (View) s14Var.n;
        imageView.setTransitionName(mhvVar.a.getName());
        ((TextView) s14Var.b).setText(mhvVar.c);
        ((TextView) s14Var.o).setText(mhvVar.d);
        View view2 = (View) s14Var.j;
        view2.setVisibility(0);
        view2.setOnClickListener(new View.OnClickListener(this) { // from class: hhv
            public final /* synthetic */ jhv b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i = r3;
                final mhv mhvVar2 = mhvVar;
                final jhv jhvVar = this.b;
                switch (i) {
                    case 0:
                        final int i2 = 1;
                        jhvVar.v(new sls() { // from class: ehv
                            @Override // defpackage.sls
                            public final Object invoke() {
                                int i3 = i2;
                                zy11 zy11Var = zy11.a;
                                mhv mhvVar3 = mhvVar2;
                                jhv jhvVar2 = jhvVar;
                                switch (i3) {
                                    case 0:
                                        pzt0 pzt0Var = jhvVar2.G;
                                        if (pzt0Var != null) {
                                            pzt0Var.a(null);
                                        }
                                        jhvVar2.G = jhvVar2.y.a(mhvVar3.a, new fhv(jhvVar2, 0), new bgc(12));
                                        break;
                                    default:
                                        pzt0 pzt0Var2 = jhvVar2.F;
                                        if (pzt0Var2 != null) {
                                            pzt0Var2.a(null);
                                        }
                                        jhvVar2.F = jhvVar2.y.a(mhvVar3.a, new fhv(jhvVar2, 1), new ghv(jhvVar2, 0));
                                        break;
                                }
                                return zy11Var;
                            }
                        });
                        break;
                    default:
                        final int i3 = 0;
                        jhvVar.v(new sls() { // from class: ehv
                            @Override // defpackage.sls
                            public final Object invoke() {
                                int i32 = i3;
                                zy11 zy11Var = zy11.a;
                                mhv mhvVar3 = mhvVar2;
                                jhv jhvVar2 = jhvVar;
                                switch (i32) {
                                    case 0:
                                        pzt0 pzt0Var = jhvVar2.G;
                                        if (pzt0Var != null) {
                                            pzt0Var.a(null);
                                        }
                                        jhvVar2.G = jhvVar2.y.a(mhvVar3.a, new fhv(jhvVar2, 0), new bgc(12));
                                        break;
                                    default:
                                        pzt0 pzt0Var2 = jhvVar2.F;
                                        if (pzt0Var2 != null) {
                                            pzt0Var2.a(null);
                                        }
                                        jhvVar2.F = jhvVar2.y.a(mhvVar3.a, new fhv(jhvVar2, 1), new ghv(jhvVar2, 0));
                                        break;
                                }
                                return zy11Var;
                            }
                        });
                        break;
                }
            }
        });
        View view3 = (View) s14Var.k;
        view3.setVisibility(0);
        final int i = 1;
        view3.setOnClickListener(new View.OnClickListener(this) { // from class: hhv
            public final /* synthetic */ jhv b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view32) {
                int i2 = i;
                final mhv mhvVar2 = mhvVar;
                final jhv jhvVar = this.b;
                switch (i2) {
                    case 0:
                        final int i22 = 1;
                        jhvVar.v(new sls() { // from class: ehv
                            @Override // defpackage.sls
                            public final Object invoke() {
                                int i32 = i22;
                                zy11 zy11Var = zy11.a;
                                mhv mhvVar3 = mhvVar2;
                                jhv jhvVar2 = jhvVar;
                                switch (i32) {
                                    case 0:
                                        pzt0 pzt0Var = jhvVar2.G;
                                        if (pzt0Var != null) {
                                            pzt0Var.a(null);
                                        }
                                        jhvVar2.G = jhvVar2.y.a(mhvVar3.a, new fhv(jhvVar2, 0), new bgc(12));
                                        break;
                                    default:
                                        pzt0 pzt0Var2 = jhvVar2.F;
                                        if (pzt0Var2 != null) {
                                            pzt0Var2.a(null);
                                        }
                                        jhvVar2.F = jhvVar2.y.a(mhvVar3.a, new fhv(jhvVar2, 1), new ghv(jhvVar2, 0));
                                        break;
                                }
                                return zy11Var;
                            }
                        });
                        break;
                    default:
                        final int i3 = 0;
                        jhvVar.v(new sls() { // from class: ehv
                            @Override // defpackage.sls
                            public final Object invoke() {
                                int i32 = i3;
                                zy11 zy11Var = zy11.a;
                                mhv mhvVar3 = mhvVar2;
                                jhv jhvVar2 = jhvVar;
                                switch (i32) {
                                    case 0:
                                        pzt0 pzt0Var = jhvVar2.G;
                                        if (pzt0Var != null) {
                                            pzt0Var.a(null);
                                        }
                                        jhvVar2.G = jhvVar2.y.a(mhvVar3.a, new fhv(jhvVar2, 0), new bgc(12));
                                        break;
                                    default:
                                        pzt0 pzt0Var2 = jhvVar2.F;
                                        if (pzt0Var2 != null) {
                                            pzt0Var2.a(null);
                                        }
                                        jhvVar2.F = jhvVar2.y.a(mhvVar3.a, new fhv(jhvVar2, 1), new ghv(jhvVar2, 0));
                                        break;
                                }
                                return zy11Var;
                            }
                        });
                        break;
                }
            }
        });
        ru10 ru10Var = mhvVar.b;
        s((View) s14Var.g, ru10Var != null ? ru10Var.f : null, new fhv(this, 2));
        s((View) s14Var.f, ru10Var != null ? ru10Var.g : null, new fhv(this, 3));
        s((View) s14Var.l, ru10Var != null ? ru10Var.j : null, new fhv(this, 4));
        View view4 = (View) s14Var.i;
        LocalMessageRef localMessageRef = ru10Var != null ? ru10Var.k : null;
        view4.setOnClickListener(localMessageRef != null ? new vsn(12, new fhv(this, 5), localMessageRef) : null);
        view.setVisibility((ru10Var != null ? ru10Var.d : null) == null ? 8 : 0);
        s(view, ru10Var != null ? ru10Var.d : null, new fhv(this, 6));
        ImageViewerInfo imageViewerInfo = mhvVar.a;
        if (ru10Var == null || !ru10Var.t) {
            imageViewerInfo = null;
        }
        ((View) s14Var.h).setOnClickListener(imageViewerInfo != null ? new vsn(14, new fhv(this, 7), imageViewerInfo) : null);
    }

    public final void u() {
        s14 s14Var = this.D;
        ai91.f((ViewGroup) s14Var.c, true);
        ai91.f((ViewGroup) s14Var.e, true);
        ai91.f((ViewPager) s14Var.a, false);
        ((ImageView) s14Var.d).post(new dhv(0, this));
    }

    public final void v(sls slsVar) {
        if (Build.VERSION.SDK_INT < 30) {
            Permission permission = Permission.WRITE_EXTERNAL_STORAGE;
            b bVar = this.w;
            if (!bVar.b(permission)) {
                iza0 iza0Var = new iza0();
                iza0Var.a = 44000;
                iza0Var.b.add(permission);
                hza0 a = iza0Var.a();
                bVar.d(44000);
                ic0 ic0Var = new ic0(23, slsVar);
                SparseArray sparseArray = bVar.b;
                sparseArray.get(44000);
                z83.i();
                sparseArray.put(44000, ic0Var);
                bVar.e(a);
                return;
            }
        }
        slsVar.invoke();
    }
}
