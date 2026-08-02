package xsna;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.Size;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.stickers.GiftSuggestionConfig;
import com.vk.dto.stickers.PackPreviewItem;
import com.vk.dto.stickers.StickerAnimation;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stickers.StickerStockItemPreviewImage;
import com.vk.dto.stickers.StickersDictionaryItem;
import com.vk.dto.stickers.StyleIcons;
import com.vk.imageloader.view.VKImageView;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stickers.autosuggest.AutoSuggestStickersPopupWindow;
import com.vk.stickers.keyboard.StickersView;
import com.vk.stickers.views.VKStickerImageView;
import com.vk.stickers.views.sticker.ImStickerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.bk5;
import xsna.u5d0;

/* compiled from: AutoSuggestAdapter.kt */
/* loaded from: classes5.dex */
public final class uj5 extends RecyclerView.Adapter<RecyclerView.e0> implements z2n0 {
    public final StickersView.c c;
    public final kd d;
    public final AutoSuggestStickersPopupWindow e;
    public final kcl0 f;
    public StickersDictionaryItem g;
    public final ArrayList h;

    /* compiled from: AutoSuggestAdapter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StickersDictionaryItem.QuickSuggestCollectionType.values().length];
            try {
                iArr[StickersDictionaryItem.QuickSuggestCollectionType.CLIPS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StickersDictionaryItem.QuickSuggestCollectionType.POSTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: AutoSuggestAdapter.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements yzs<StickerItem, Boolean, Context, s3q0> {
        @Override // xsna.yzs
        public final s3q0 invoke(StickerItem stickerItem, Boolean bool, Context context) {
            ((uj5) this.receiver).p(stickerItem, bool.booleanValue(), context);
            return s3q0.a;
        }
    }

    /* compiled from: AutoSuggestAdapter.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements yzs<StickerItem, Boolean, Context, s3q0> {
        @Override // xsna.yzs
        public final s3q0 invoke(StickerItem stickerItem, Boolean bool, Context context) {
            ((uj5) this.receiver).p(stickerItem, bool.booleanValue(), context);
            return s3q0.a;
        }
    }

    public uj5(StickersView.c cVar, kd kdVar, AutoSuggestStickersPopupWindow autoSuggestStickersPopupWindow) {
        this.c = cVar;
        this.d = kdVar;
        this.e = autoSuggestStickersPopupWindow;
        t6g0 t6g0Var = t6g0.b;
        this.f = t6g0.d();
        this.h = new ArrayList();
    }

    @Override // xsna.z2n0
    public final void L(StickerItem stickerItem) {
        int i = stickerItem.b;
        StickerStockItem H = this.f.H(i);
        if (H == null) {
            com.vk.metrics.eventtracking.b.a.a(new IllegalStateException(lhg.a(i, "Can't find sticker pack item for sticker id = ")));
            return;
        }
        StringBuilder sb = new StringBuilder("suggestion_");
        StickersDictionaryItem stickersDictionaryItem = this.g;
        sb.append(stickersDictionaryItem != null ? stickersDictionaryItem.g : null);
        this.c.o(H.b, sb.toString(), ((AutoSuggestStickersPopupWindow) this.d.c).q);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.h.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        AutoSuggestStickersPopupWindow.b bVar = (AutoSuggestStickersPopupWindow.b) this.h.get(i);
        if (bVar instanceof AutoSuggestStickersPopupWindow.b.a) {
            return 1;
        }
        if (bVar instanceof AutoSuggestStickersPopupWindow.b.e) {
            return 4;
        }
        if (bVar instanceof AutoSuggestStickersPopupWindow.b.c) {
            return 2;
        }
        if (bVar instanceof AutoSuggestStickersPopupWindow.b.d) {
            return 0;
        }
        if (bVar instanceof AutoSuggestStickersPopupWindow.b.C1792b) {
            return 5;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.z2n0
    public final List<AutoSuggestStickersPopupWindow.b> getItems() {
        return this.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0238  */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30, types: [com.vk.stickers.autosuggest.AutoSuggestStickersPopupWindow$b$c] */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r4v10, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams] */
    /* JADX WARN: Type inference failed for: r4v19, types: [xsna.p0v0] */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v21, types: [android.view.View, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [android.util.DisplayMetrics] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12, types: [com.vk.dto.stickers.StickerStockItemPreviewImage] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [android.view.View] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        Context context;
        ImageSize Cb;
        String str;
        ImageSize Cb2;
        String str2;
        Resources resources;
        PackPreviewItem packPreviewItem;
        ?? r9;
        List<StyleIcons> list;
        Object obj;
        StickerStockItemPreviewImage stickerStockItemPreviewImage;
        String str3;
        boolean z = e0Var instanceof bk5;
        ArrayList arrayList = this.h;
        if (z) {
            AutoSuggestStickersPopupWindow.b bVar = (AutoSuggestStickersPopupWindow.b) arrayList.get(i);
            if (!(bVar instanceof AutoSuggestStickersPopupWindow.b.d)) {
                return;
            }
            StickerItem stickerItem = ((AutoSuggestStickersPopupWindow.b.d) bVar).a;
            StickerAnimation stickerAnimation = stickerItem.g;
            int i2 = stickerItem.b;
            boolean z2 = stickerAnimation.V0() && this.f.K0();
            StickersDictionaryItem stickersDictionaryItem = this.g;
            boolean z3 = (stickersDictionaryItem == null || Boolean.valueOf(stickersDictionaryItem.Ab(i2)).booleanValue()) ? false : true;
            bk5 bk5Var = (bk5) e0Var;
            VKImageView vKImageView = (VKImageView) ((FrameLayout) bk5Var.itemView).getChildAt(0);
            mj0 mj0Var = bk5Var.l;
            vKImageView.H0(mj0Var.o(), -2);
            View view = bk5Var.itemView;
            view.setBackgroundColor(view.getContext().getColor(R.color.transparent));
            bk5Var.n = stickerItem;
            bk5Var.o = z3;
            bk5Var.itemView.setTag(com.vkontakte.android.R.id.id, Integer.valueOf(i2));
            bk5Var.itemView.setAlpha(bk5Var.o ? 1.0f : 0.5f);
            String a2 = stickerItem.a(dhr0.a.c(bk5Var.itemView.getContext()));
            VKStickerImageView vKStickerImageView = (VKStickerImageView) ((FrameLayout) bk5Var.itemView).getChildAt(0);
            View childAt = ((FrameLayout) bk5Var.itemView).getChildAt(1);
            ImageView imageView = (ImageView) ((FrameLayout) bk5Var.itemView).getChildAt(2);
            if (stickerItem.z9()) {
                imageView.setVisibility(0);
                imageView.setImageResource(com.vkontakte.android.R.drawable.vk_icon_play_circle_fill_gray_16);
            } else {
                imageView.setVisibility(8);
            }
            Drawable background = vKStickerImageView.getBackground();
            Drawable mutate = background != null ? background.mutate() : null;
            GradientDrawable gradientDrawable = mutate instanceof GradientDrawable ? (GradientDrawable) mutate : null;
            if (gradientDrawable != null) {
                gradientDrawable.setColor(e3m.f(com.vkontakte.android.R.attr.vk_ui_skeleton_from, mj0Var.f()));
            }
            vKStickerImageView.setOnLoadCallback(new ck5(gradientDrawable, bk5Var));
            if (TextUtils.isEmpty(a2) || !z2) {
                context = null;
                vKStickerImageView.setVisibility(0);
                childAt.setVisibility(8);
                StickerItem stickerItem2 = bk5Var.n;
                if (stickerItem2 != null) {
                    t6g0 t6g0Var = t6g0.b;
                    str3 = t6g0.d().z0(stickerItem2, h9l0.c, mj0Var.v());
                } else {
                    str3 = "";
                }
                vKStickerImageView.T0(str3);
            } else {
                vKStickerImageView.setVisibility(8);
                childAt.setVisibility(0);
                StickerItem stickerItem3 = bk5Var.n;
                if (stickerItem3 != null) {
                    context = null;
                    ImStickerView.b((ImStickerView) childAt, stickerItem3, null, 4);
                } else {
                    context = null;
                }
            }
            vKStickerImageView.setContentDescription(bk5Var.itemView.getContext().getString(com.vkontakte.android.R.string.stickers_accessibility_sticker));
        } else {
            context = null;
        }
        if (e0Var instanceof yj5) {
            Object obj2 = arrayList.get(i);
            ?? r2 = obj2 instanceof AutoSuggestStickersPopupWindow.b.c ? (AutoSuggestStickersPopupWindow.b.c) obj2 : context;
            if (r2 == 0 || (packPreviewItem = r2.a) == null) {
                return;
            }
            yj5 yj5Var = (yj5) e0Var;
            mj0 mj0Var2 = yj5Var.l;
            VKStickerImageView vKStickerImageView2 = yj5Var.n;
            if (vKStickerImageView2 != null) {
                vKStickerImageView2.H0(mj0Var2.o(), -2);
            }
            yj5Var.m = packPreviewItem;
            yj5Var.itemView.setTag(com.vkontakte.android.R.id.id, Integer.valueOf(packPreviewItem.b));
            yj5Var.itemView.setAlpha(packPreviewItem.zb() ? 1.0f : 0.5f);
            if (vKStickerImageView2 != null) {
                vKStickerImageView2.setBackgroundColor(e3m.f(com.vkontakte.android.R.attr.vk_ui_skeleton_from, mj0Var2.f()));
            }
            if (vKStickerImageView2 != null) {
                vKStickerImageView2.setContentDescription(yj5Var.itemView.getContext().getString(com.vkontakte.android.R.string.stickers_title) + ' ' + packPreviewItem.f);
            }
            if (vKStickerImageView2 != null) {
                vKStickerImageView2.setOnLoadCallback(new xj5(yj5Var));
            }
            if (vKStickerImageView2 != null) {
                PackPreviewItem packPreviewItem2 = yj5Var.m;
                Collection collection = (Collection) (packPreviewItem2 != null ? packPreviewItem2.e : context);
                if (collection == null || collection.isEmpty()) {
                    PackPreviewItem packPreviewItem3 = yj5Var.m;
                    if (packPreviewItem3 != null) {
                        r9 = packPreviewItem3.c;
                        bpn0 bpn0Var = u5d0.a;
                        String b2 = u5d0.a.b(mj0Var2.x(), r9, false);
                        vKStickerImageView2.T0(b2 != null ? b2 : "");
                    }
                    r9 = context;
                    bpn0 bpn0Var2 = u5d0.a;
                    String b22 = u5d0.a.b(mj0Var2.x(), r9, false);
                    vKStickerImageView2.T0(b22 != null ? b22 : "");
                } else {
                    PackPreviewItem packPreviewItem4 = yj5Var.m;
                    if (packPreviewItem4 != null && (list = packPreviewItem4.e) != null) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = context;
                                break;
                            } else {
                                obj = it.next();
                                if (((StyleIcons) obj).d) {
                                    break;
                                }
                            }
                        }
                        StyleIcons styleIcons = (StyleIcons) obj;
                        if (styleIcons != null && (stickerStockItemPreviewImage = styleIcons.c) != null) {
                            r9 = stickerStockItemPreviewImage;
                            bpn0 bpn0Var22 = u5d0.a;
                            String b222 = u5d0.a.b(mj0Var2.x(), r9, false);
                            vKStickerImageView2.T0(b222 != null ? b222 : "");
                        }
                    }
                    PackPreviewItem packPreviewItem5 = yj5Var.m;
                    if (packPreviewItem5 != null) {
                        r9 = packPreviewItem5.c;
                        bpn0 bpn0Var222 = u5d0.a;
                        String b2222 = u5d0.a.b(mj0Var2.x(), r9, false);
                        vKStickerImageView2.T0(b2222 != null ? b2222 : "");
                    }
                    r9 = context;
                    bpn0 bpn0Var2222 = u5d0.a;
                    String b22222 = u5d0.a.b(mj0Var2.x(), r9, false);
                    vKStickerImageView2.T0(b22222 != null ? b22222 : "");
                }
            }
            ImageView imageView2 = (ImageView) ((FrameLayout) yj5Var.itemView).getChildAt(2);
            if (!packPreviewItem.g) {
                imageView2.setVisibility(8);
                return;
            } else {
                imageView2.setVisibility(0);
                imageView2.setImageResource(com.vkontakte.android.R.drawable.vk_icon_play_circle_fill_gray_16);
                return;
            }
        }
        if (e0Var instanceof rl0) {
            rl0 rl0Var = (rl0) e0Var;
            Drawable a3 = dhr0.t.a(!rl0Var.l.v() ? com.vkontakte.android.R.drawable.sticker_keyword_bot_light_64 : com.vkontakte.android.R.drawable.sticker_keyword_bot_dark_64);
            View childAt2 = ((FrameLayout) rl0Var.itemView).getChildAt(0);
            ?? r92 = childAt2 instanceof ImageView ? (ImageView) childAt2 : context;
            if (r92 == 0) {
                return;
            }
            r92.setBackground(a3);
            return;
        }
        if (e0Var instanceof haw0) {
            haw0 haw0Var = (haw0) e0Var;
            AutoSuggestStickersPopupWindow.b.e eVar = (AutoSuggestStickersPopupWindow.b.e) arrayList.get(i);
            i70 i70Var = new i70(this, 6);
            StickerItem stickerItem4 = eVar.a;
            View view2 = haw0Var.itemView;
            mj0 mj0Var3 = haw0Var.l;
            bwt0.c0(mj0Var3.o(), view2);
            View view3 = haw0Var.itemView;
            Context context2 = e43.a;
            view3.setBackgroundColor((context2 != null ? context2 : context).getColor(R.color.transparent));
            VKStickerImageView vKStickerImageView3 = (VKStickerImageView) haw0Var.itemView.findViewById(com.vkontakte.android.R.id.vmoji_avatar_image_view);
            t6g0 t6g0Var2 = t6g0.b;
            vKStickerImageView3.T0(t6g0.d().z0(stickerItem4, h9l0.c, mj0Var3.v()));
            ((FrameLayout) haw0Var.itemView.findViewById(com.vkontakte.android.R.id.vmoji_close_promo_button)).setOnClickListener(new s01(i70Var, 15));
            haw0Var.itemView.setOnClickListener(new w2v0(1, haw0Var, i70Var));
            return;
        }
        if (e0Var instanceof zzt) {
            zzt zztVar = (zzt) e0Var;
            GiftSuggestionConfig giftSuggestionConfig = ((AutoSuggestStickersPopupWindow.b.C1792b) arrayList.get(i)).a;
            View view4 = zztVar.itemView;
            mj0 mj0Var4 = zztVar.l;
            bwt0.c0(mj0Var4.o(), view4);
            View view5 = zztVar.itemView;
            Context context3 = e43.a;
            if (context3 == null) {
                context3 = context;
            }
            view5.setBackgroundColor(context3.getColor(R.color.transparent));
            Image zb = (!mj0Var4.v() || giftSuggestionConfig.Ab() == null) ? giftSuggestionConfig.zb() : giftSuggestionConfig.Ab();
            Image Bb = (!mj0Var4.v() || giftSuggestionConfig.Cb() == null) ? giftSuggestionConfig.Bb() : giftSuggestionConfig.Cb();
            FrameLayout frameLayout = (FrameLayout) zztVar.itemView.findViewById(com.vkontakte.android.R.id.gift_small_button);
            zztVar.n = frameLayout;
            if (frameLayout != null) {
                frameLayout.setBackground(zztVar.p);
            }
            FrameLayout frameLayout2 = zztVar.n;
            Object layoutParams = frameLayout2 != null ? frameLayout2.getLayoutParams() : context;
            ?? r4 = layoutParams instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams : context;
            if (r4 != 0) {
                Context context4 = e43.a;
                if (context4 == null) {
                    context4 = context;
                }
                float f = (context4.getResources().getDisplayMetrics().xdpi / 160) * 26.0f;
                FrameLayout frameLayout3 = zztVar.n;
                ((ViewGroup.MarginLayoutParams) r4).height = (int) TypedValue.applyDimension(0, f, (frameLayout3 == null || (resources = frameLayout3.getResources()) == null) ? context : resources.getDisplayMetrics());
                ?? r6 = zztVar.n;
                if (r6 != 0) {
                    r6.setLayoutParams(r4);
                }
            }
            TextView textView = (TextView) zztVar.itemView.findViewById(com.vkontakte.android.R.id.gift_button_text);
            zztVar.o = textView;
            if (textView != null) {
                textView.setTextColor(dhr0.t.c(com.vkontakte.android.R.attr.vk_ui_text_contrast_themed));
                Context context5 = e43.a;
                if (context5 == null) {
                    context5 = context;
                }
                textView.setTextSize(0, (context5.getResources().getDisplayMetrics().xdpi / 160) * 13.0f);
            }
            VKImageView vKImageView2 = (VKImageView) zztVar.itemView.findViewById(com.vkontakte.android.R.id.gifts_promo_image_view);
            zztVar.m = vKImageView2;
            if (vKImageView2 != null) {
                vKImageView2.setAutoPlayAnimations(true);
            }
            VKImageView vKImageView3 = zztVar.m;
            if (vKImageView3 != null) {
                ?? g = (Bb == null || (Cb2 = Bb.Cb(h9l0.c, true, false)) == null || (str2 = Cb2.d.d) == null) ? context : jeq0.g(str2);
                ?? g2 = (zb == null || (Cb = zb.Cb(h9l0.c, true, false)) == null || (str = Cb.d.d) == null) ? context : jeq0.g(str);
                int i3 = h9l0.c;
                Size size = new Size(i3, i3);
                sa30.K(vKImageView3, g);
                sa30.K(vKImageView3, g2);
                vKImageView3.getBackend().p(g, g2, size);
            }
            zztVar.itemView.setOnClickListener(new c98(zztVar, 3));
            zztVar.q.invoke();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        Context context;
        Context context2;
        Context context3 = viewGroup.getContext();
        AutoSuggestStickersPopupWindow autoSuggestStickersPopupWindow = this.e;
        if (i == 0) {
            int i2 = bk5.p;
            return bk5.a.a(context3, autoSuggestStickersPopupWindow, new b(3, this, uj5.class, "handleStickerClicked", "handleStickerClicked(Lcom/vk/dto/stickers/StickerItem;ZLandroid/content/Context;)V", 0));
        }
        if (i == 2) {
            int i3 = yj5.o;
            FrameLayout frameLayout = new FrameLayout(context3);
            frameLayout.setId(com.vkontakte.android.R.id.pack_preview_container);
            int b2 = cn70.b(2);
            frameLayout.setPadding(b2, b2, b2, b2);
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
            frameLayout.setOnTouchListener(new wj5(frameLayout, 0));
            VKStickerImageView vKStickerImageView = new VKStickerImageView(context3, null, 6, 0);
            bwt0.d(vKStickerImageView, cn70.a() * 12.0f, (r4 & 2) != 0, (r4 & 4) != 0);
            vKStickerImageView.setId(com.vkontakte.android.R.id.pack_image_view);
            frameLayout.addView(vKStickerImageView);
            int D = autoSuggestStickersPopupWindow.D();
            frameLayout.setPadding(D, D, D, D);
            ImStickerView imStickerView = new ImStickerView(context3, null, 6);
            imStickerView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
            frameLayout.addView(imStickerView);
            ImageView imageView = new ImageView(context3);
            imageView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 8388693));
            frameLayout.addView(imageView);
            return new yj5(frameLayout, autoSuggestStickersPopupWindow);
        }
        if (i == 3) {
            int i4 = bk5.p;
            return bk5.a.a(context3, autoSuggestStickersPopupWindow, new c(3, this, uj5.class, "handleStickerClicked", "handleStickerClicked(Lcom/vk/dto/stickers/StickerItem;ZLandroid/content/Context;)V", 0));
        }
        if (i == 4) {
            int i5 = haw0.m;
            if (autoSuggestStickersPopupWindow.v()) {
                dhr0.a.getClass();
                context = dhr0.s();
            } else {
                context = viewGroup.getContext();
            }
            return new haw0(LayoutInflater.from(context).inflate(com.vkontakte.android.R.layout.vmoji_promo_item, viewGroup, false), autoSuggestStickersPopupWindow);
        }
        if (i == 5) {
            int i6 = zzt.r;
            if (autoSuggestStickersPopupWindow.v()) {
                dhr0.a.getClass();
                context2 = dhr0.s();
            } else {
                context2 = viewGroup.getContext();
            }
            return new zzt(LayoutInflater.from(context2).inflate(com.vkontakte.android.R.layout.gifts_promo_item, viewGroup, false), autoSuggestStickersPopupWindow);
        }
        int i7 = rl0.m;
        TypedArray obtainStyledAttributes = context3.obtainStyledAttributes(new int[]{com.vkontakte.android.R.attr.selectableItemBackground});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        VKImageView vKImageView = new VKImageView(context3, null, 6, 0);
        vKImageView.setImageResource(resourceId);
        vKImageView.setBackground(dhr0.t.a(!autoSuggestStickersPopupWindow.v() ? com.vkontakte.android.R.drawable.sticker_keyword_bot_light_64 : com.vkontakte.android.R.drawable.sticker_keyword_bot_dark_64));
        obtainStyledAttributes.recycle();
        FrameLayout frameLayout2 = new FrameLayout(context3);
        int D2 = autoSuggestStickersPopupWindow.D();
        frameLayout2.setPadding(D2, D2, D2, D2);
        frameLayout2.addView(vKImageView);
        return new rl0(frameLayout2, autoSuggestStickersPopupWindow);
    }

    @Override // xsna.z2n0
    public final void p(StickerItem stickerItem, boolean z, Context context) {
        List<Integer> list;
        int i = stickerItem.b;
        if (!z) {
            y0(i, context, new defpackage.o(5, this, stickerItem));
            return;
        }
        kcl0 kcl0Var = this.f;
        StickerStockItem H = kcl0Var.H(i);
        if (H != null && (list = H.J) != null && (!list.isEmpty()) && z) {
            H = kcl0Var.Q0(H);
        }
        x0(stickerItem, H);
    }

    public final void x0(StickerItem stickerItem, StickerStockItem stickerStockItem) {
        String sb;
        if (stickerItem == null) {
            return;
        }
        if (stickerStockItem == null) {
            com.vk.metrics.eventtracking.b.a.a(new IllegalStateException("Can't find sticker pack item for sticker id = " + stickerItem.b));
            return;
        }
        this.f.a0(stickerItem);
        StickersDictionaryItem stickersDictionaryItem = this.g;
        if (stickersDictionaryItem == null || !stickersDictionaryItem.i) {
            StringBuilder sb2 = new StringBuilder("suggestion_");
            StickersDictionaryItem stickersDictionaryItem2 = this.g;
            sb2.append(stickersDictionaryItem2 != null ? stickersDictionaryItem2.g : null);
            sb = sb2.toString();
        } else {
            StickersDictionaryItem.QuickSuggestCollectionType quickSuggestCollectionType = stickersDictionaryItem.j;
            int i = quickSuggestCollectionType == null ? -1 : a.$EnumSwitchMapping$0[quickSuggestCollectionType.ordinal()];
            if (i == -1) {
                sb = "";
            } else if (i == 1) {
                sb = "clip_reaction";
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                sb = "wall_reaction";
            }
        }
        this.c.p(stickerItem, stickerStockItem.b, sb);
    }

    public final void y0(int i, Context context, izs izsVar) {
        String str;
        StickersDictionaryItem stickersDictionaryItem = this.g;
        if (stickersDictionaryItem == null || (str = stickersDictionaryItem.g) == null) {
            str = "";
        }
        tj5 tj5Var = new tj5(izsVar, 0);
        UiTracker uiTracker = UiTracker.a;
        String concat = UiTracker.d().equals(com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.STORY)) ? "story_answer_suggestion_".concat(str) : "suggestion_".concat(str);
        zal0 a2 = g2v.d().a();
        Activity h = e3m.h(context);
        if (h != null) {
            context = h;
        }
        a2.a(context, i, tj5Var, concat);
    }

    public final void z0(List<? extends AutoSuggestStickersPopupWindow.b> list, StickersDictionaryItem stickersDictionaryItem) {
        if (!list.isEmpty() && !stickersDictionaryItem.i) {
            list = j5g.v0(AutoSuggestStickersPopupWindow.b.a.a, list);
        }
        this.g = stickersDictionaryItem;
        ArrayList arrayList = this.h;
        arrayList.clear();
        arrayList.addAll(list);
        notifyDataSetChanged();
    }
}
