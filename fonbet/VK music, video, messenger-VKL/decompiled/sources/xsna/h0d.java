package xsna;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.design.view.component.activities.like.ClipsBubbleAvatarView;
import com.vk.clips.sdk.shared.item.clip.viewstate.MainOverlayState;
import com.vk.core.view.components.picture.c;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.a1d;
import xsna.ejd;
import xsna.hfr;
import xsna.lfe;
import xsna.tlo0;

/* compiled from: ClipItemActivitiesRenderDelegate.kt */
/* loaded from: classes17.dex */
public final class h0d {
    public static final int f;
    public static final int i;
    public final ViewGroup a;
    public final u6d b;
    public final Object c;
    public final Object d;
    public MainOverlayState.b e;
    public static final int g = iah0.a(6);
    public static final int h = iah0.a(0);
    public static final int j = iah0.a(16);
    public static final int k = iah0.a(8);

    static {
        float f2 = 12;
        f = iah0.a(f2);
        i = iah0.a(f2);
    }

    public h0d(ViewGroup viewGroup, u6d u6dVar) {
        this.a = viewGroup;
        this.b = u6dVar;
        com.vk.movika.sdk.base.ui.f fVar = new com.vk.movika.sdk.base.ui.f(this, 17);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.c = msy.a(lazyThreadSafetyMode, fVar);
        this.d = msy.a(lazyThreadSafetyMode, new l1(this, 21));
        int i2 = j;
        f4m.l(i2, i2, viewGroup);
        int i3 = k;
        f4m.B(i3, i3, viewGroup);
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0469, code lost:
    
        if (xsna.epx.f(xsna.tlo0.b.a(r2.e, r4).toString(), xsna.tlo0.b.a(r7.e, r4).toString()) == false) goto L175;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0, types: [kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r19v4, types: [kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r1v62, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r29v0, types: [kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r29v3, types: [kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v5, types: [xsna.c1d] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.view.View, android.view.ViewGroup] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(MainOverlayState.b bVar) {
        int i2;
        boolean z;
        boolean z2;
        ?? r19;
        Object obj;
        boolean z3;
        boolean z4;
        int i3;
        lfe lfeVar;
        if (bVar.equals(this.e)) {
            return;
        }
        boolean z5 = bVar instanceof MainOverlayState.b.C0663b;
        ViewGroup viewGroup = this.a;
        awt0.v(viewGroup, !z5);
        boolean z6 = bVar instanceof MainOverlayState.b.a;
        int i4 = h;
        int i5 = g;
        int i6 = i;
        int i7 = f;
        if (z6) {
            i2 = i7 - i6;
        } else if (bVar instanceof MainOverlayState.b.c) {
            i2 = i5 - i6;
        } else {
            if (!z5) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = i4;
        }
        f4m.q(i2, viewGroup);
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams;
            if (z6) {
                i4 = i7;
            } else if (bVar instanceof MainOverlayState.b.c) {
                i4 = i5;
            } else if (!z5) {
                throw new NoWhenBranchMatchedException();
            }
            bVar2.z = i4;
        }
        viewGroup.setLayoutParams(layoutParams);
        ?? r2 = (c1d) this.c.getValue();
        MainOverlayState.b.c cVar = bVar instanceof MainOverlayState.b.c ? (MainOverlayState.b.c) bVar : null;
        ?? r6 = r2.a;
        Object obj2 = r2.e;
        Object obj3 = r2.d;
        if (!epx.f(cVar, r2.f) || r2.f == null) {
            if (cVar != null) {
                u6d u6dVar = r2.b;
                int i8 = c1d.j;
                ArrayList arrayList = cVar.a;
                boolean z7 = cVar.b;
                boolean z8 = cVar.c;
                boolean z9 = arrayList.size() >= 4;
                int min = z9 ? 2 : Math.min(arrayList.size(), 3);
                z = z6;
                int i9 = 0;
                for (int i10 = 3; i9 < i10; i10 = 3) {
                    List<Integer> list = c1d.h;
                    lfe lfeVar2 = (lfe) r6.findViewById(list.get(i9).intValue());
                    if (i9 >= min) {
                        if (lfeVar2 != null) {
                            lfeVar2.setVisibility(8);
                        }
                        r19 = obj2;
                        obj = obj3;
                        z3 = z9;
                        z4 = z7;
                        i3 = min;
                    } else {
                        MainOverlayState.b.c.a aVar = (MainOverlayState.b.c.a) arrayList.get(i9);
                        r19 = obj2;
                        if (lfeVar2 == null) {
                            String str = aVar.e;
                            ?? r29 = obj3;
                            z3 = z9;
                            lfeVar = new lfe(r6.getContext());
                            lfeVar.setId(list.get(i9).intValue());
                            int i11 = c1d.m;
                            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i11, i11);
                            layoutParams2.gravity = 8388691;
                            z4 = z7;
                            i3 = min;
                            float f2 = 0;
                            layoutParams2.setMargins(c1d.i.get(i9).intValue(), iah0.a(f2), iah0.a(f2), i9 % 2 == 0 ? i8 : c1d.k);
                            lfeVar.setLayoutParams(layoutParams2);
                            lfeVar.setHeartAvatarDrawableController(new f1v(lfeVar.getContext()));
                            lfeVar.setHeartAvatarDrawableSlotDecorator(new uzc(new d1d(0, lfeVar, lfe.class, "invalidate", "invalidate()V", 0, 0), new e7(str, 12), new tzc()));
                            lfeVar.setHeartAvatarDrawableInsetProvider(new v11(8));
                            ((com.vk.clips.viewer.impl.feed.item.clip.activities.a) r29.getValue()).a(lfeVar);
                            r6.addView(lfeVar);
                            obj = r29;
                        } else {
                            obj = obj3;
                            z3 = z9;
                            z4 = z7;
                            i3 = min;
                            lfeVar = lfeVar2;
                        }
                        ((a1d) r19.getValue()).getClass();
                        Context context = lfeVar.getContext();
                        int i12 = a1d.a.$EnumSwitchMapping$0[aVar.d.ordinal()];
                        int i13 = R.string.accessibility_friend_like_m;
                        if (i12 != 1) {
                            if (i12 == 2) {
                                i13 = R.string.accessibility_friend_like_f;
                            } else if (i12 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                        Context context2 = lfeVar.getContext();
                        String str2 = aVar.c;
                        if (str2 == null) {
                            str2 = enj.f(R.plurals.clips_author_friends, 1, context2);
                        }
                        lfeVar.setContentDescription(context.getString(i13, str2));
                        String str3 = aVar.b;
                        lfe.c cVar2 = lfeVar.b;
                        if (cVar2 == null) {
                            cVar2 = null;
                        }
                        cVar2.load(str3);
                        lfe.c cVar3 = lfeVar.b;
                        if (cVar3 == null) {
                            cVar3 = null;
                        }
                        cVar3.b(lfeVar);
                        lfe.b bVar3 = lfeVar.c;
                        if (bVar3 != null) {
                            bVar3.b();
                        }
                        if (z8 && lfeVar.getVisibility() == 8) {
                            r2.c(lfeVar, (i9 * 167) + 250);
                        } else {
                            lfeVar.setScaleX(1.0f);
                            lfeVar.setScaleY(1.0f);
                            lfeVar.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            lfeVar.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            lfeVar.setVisibility(0);
                        }
                    }
                    i9++;
                    obj2 = r19;
                    obj3 = obj;
                    z9 = z3;
                    z7 = z4;
                    min = i3;
                }
                ?? r192 = obj2;
                ?? r292 = obj3;
                boolean z10 = z9;
                boolean z11 = z7;
                ClipsBubbleAvatarView clipsBubbleAvatarView = (ClipsBubbleAvatarView) r6.findViewById(R.id.clip_like_bubble_avatars);
                if (z10) {
                    if (clipsBubbleAvatarView == null) {
                        clipsBubbleAvatarView = new ClipsBubbleAvatarView(r6.getContext());
                        clipsBubbleAvatarView.setId(R.id.clip_like_bubble_avatars);
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
                        layoutParams3.gravity = 8388691;
                        float f3 = 0;
                        layoutParams3.setMargins(c1d.l, iah0.a(f3), iah0.a(f3), i8);
                        clipsBubbleAvatarView.setLayoutParams(layoutParams3);
                        clipsBubbleAvatarView.setAppearance(ClipsBubbleAvatarView.a.b.a);
                        clipsBubbleAvatarView.setSize(ClipsBubbleAvatarView.Size.SMALL);
                        ((com.vk.clips.viewer.impl.feed.item.clip.activities.a) r292.getValue()).a(clipsBubbleAvatarView);
                        r6.addView(clipsBubbleAvatarView);
                    }
                    ((a1d) r192.getValue()).getClass();
                    if (4 < arrayList.size()) {
                        List<MainOverlayState.b.c.a> H0 = j5g.H0(j5g.B0(arrayList, swe0.q(2, Math.min(4, arrayList.size()))), 3);
                        ArrayList arrayList2 = new ArrayList(c5g.u(H0, 10));
                        for (MainOverlayState.b.c.a aVar2 : H0) {
                            Context context3 = clipsBubbleAvatarView.getContext();
                            String str4 = aVar2.c;
                            if (str4 == null) {
                                str4 = enj.f(R.plurals.clips_author_friends, 1, context3);
                            }
                            arrayList2.add(str4);
                        }
                        z2 = true;
                        String[] strArr = (String[]) arrayList2.toArray(new String[0]);
                        String f4 = enj.f(R.plurals.clips_author_friends, Math.max(0, arrayList.size() - 4), clipsBubbleAvatarView.getContext());
                        Context context4 = clipsBubbleAvatarView.getContext();
                        int size = arrayList.size();
                        int i14 = size == 4 ? R.string.accessibility_friend_like_bubble_2 : size == 5 ? R.string.accessibility_friend_like_bubble_3 : R.string.accessibility_friend_like_bubble_many;
                        rmk0 rmk0Var = new rmk0(2);
                        rmk0Var.b(strArr);
                        rmk0Var.a(f4);
                        ArrayList<Object> arrayList3 = rmk0Var.a;
                        clipsBubbleAvatarView.setContentDescription(context4.getString(i14, arrayList3.toArray(new Object[arrayList3.size()])));
                    } else {
                        z2 = true;
                    }
                    gko gkoVar = new gko(R.drawable.user_placeholder);
                    int size2 = arrayList.size();
                    clipsBubbleAvatarView.setContent(size2 != 4 ? size2 != 5 ? new ClipsBubbleAvatarView.b.C0565b(c1d.a(arrayList, gkoVar, 2), c1d.a(arrayList, gkoVar, 3), arrayList.size() - 4) : new ClipsBubbleAvatarView.b.a(c1d.a(arrayList, gkoVar, 2), c1d.a(arrayList, gkoVar, 3), c1d.a(arrayList, gkoVar, 4)) : new ClipsBubbleAvatarView.b.a(c1d.a(arrayList, gkoVar, 2), c1d.a(arrayList, gkoVar, 3), null));
                    if (z8) {
                        r2.c(clipsBubbleAvatarView, 584L);
                    } else {
                        clipsBubbleAvatarView.setScaleX(1.0f);
                        clipsBubbleAvatarView.setScaleY(1.0f);
                        clipsBubbleAvatarView.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        clipsBubbleAvatarView.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        clipsBubbleAvatarView.setVisibility(0);
                    }
                } else {
                    if (clipsBubbleAvatarView != null) {
                        r2.b().a(clipsBubbleAvatarView);
                    }
                    if (clipsBubbleAvatarView != null) {
                        clipsBubbleAvatarView.setVisibility(8);
                    }
                    z2 = true;
                }
                if (z8 && z11) {
                    u6dVar.a(q3d.b);
                    r2.g = null;
                } else if (z8) {
                    r2.g = q3d.b;
                } else if (z11) {
                    q3d q3dVar = r2.g;
                    if (q3dVar != null) {
                        u6dVar.a(q3dVar);
                    }
                    r2.g = null;
                }
            } else {
                z = z6;
                z2 = true;
                hfr.a aVar3 = new hfr.a(rli0.j(new jxt0(r6), new oa(11)));
                while (aVar3.hasNext()) {
                    ((View) aVar3.next()).setVisibility(8);
                }
            }
            r2.f = cVar;
        } else {
            z = z6;
            z2 = true;
        }
        o0d o0dVar = (o0d) this.d.getValue();
        MainOverlayState.b.a aVar4 = z ? (MainOverlayState.b.a) bVar : null;
        MainOverlayState.b.a aVar5 = o0dVar.g;
        ?? r3 = o0dVar.e;
        if (aVar5 != null) {
            Context context5 = o0dVar.a.getContext();
            if (aVar5 != aVar4) {
                if (MainOverlayState.b.a.class.equals(aVar4 != null ? MainOverlayState.b.a.class : null)) {
                    if (aVar5.a == aVar4.a) {
                        if (epx.f(aVar5.b, aVar4.b)) {
                            if (aVar5.f == aVar4.f) {
                                if (aVar5.g == aVar4.g) {
                                    if (aVar5.c.equals(aVar4.c)) {
                                        if (aVar5.d.equals(aVar4.d)) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            this.e = bVar;
        }
        if (aVar4 != null) {
            u6d u6dVar2 = o0dVar.b;
            ijd ijdVar = (ijd) r3.getValue();
            boolean z12 = aVar4.g;
            boolean z13 = aVar4.f;
            if (z12 && z13) {
                u6dVar2.a(o3d.b);
                o0dVar.h = null;
            } else if (z12) {
                o0dVar.h = o3d.b;
            } else if (z13) {
                o3d o3dVar = o0dVar.h;
                if (o3dVar != null) {
                    u6dVar2.a(o3dVar);
                }
                o0dVar.h = null;
            }
            if (!z12) {
                ijdVar.setScaleX(1.0f);
                ijdVar.setScaleY(1.0f);
                ijdVar.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                ijdVar.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            ijdVar.setAvatarContent(new ejd(new c.d(aVar4.d, new gko(R.drawable.user_placeholder)), new ejd.a(hbh0.a(ijdVar.getContext(), cn70.a() * 0.5f), new x7g(R.attr.vk_ui_image_border_alpha))));
            tlo0.a aVar6 = tlo0.Companion;
            ucp ucpVar = ucp.a;
            CharSequence a = tlo0.b.a(aVar4.e, ijdVar.getContext());
            TypedArray obtainStyledAttributes = ijdVar.getContext().obtainStyledAttributes(R.style.VkUiTypography_Caption1Medium, new int[]{android.R.attr.textSize});
            float dimension = obtainStyledAttributes.getDimension(0, cn70.c(12));
            obtainStyledAttributes.recycle();
            CharSequence j2 = ucp.j(a, Float.valueOf(dimension));
            aVar6.getClass();
            tlo0.h hVar = new tlo0.h(j2);
            x7g x7gVar = new x7g(R.attr.vk_ui_text_contrast);
            if (ijdVar.getVisibility() != 8 || !z12) {
                z2 = false;
            }
            ijdVar.setCommentContent(new fjd(hVar, x7gVar, z2));
            ijdVar.setVisibility((z13 || !z12) ? 0 : 8);
        } else if (o0dVar.d) {
            ((cje) o0dVar.c.getValue()).a((ijd) r3.getValue());
            ((ijd) r3.getValue()).setVisibility(8);
        }
        o0dVar.g = aVar4;
        this.e = bVar;
    }
}
