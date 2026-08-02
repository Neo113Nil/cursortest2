package xsna;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.stickers.StickerItem;
import com.vk.imageloader.view.VKImageView;
import com.vk.stickers.autosuggest.AutoSuggestStickersPopupWindow;
import com.vk.stickers.views.VKStickerImageView;
import com.vk.stickers.views.sticker.ImStickerView;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: AutoSuggestStickersHolder.kt */
/* loaded from: classes5.dex */
public final class bk5 extends RecyclerView.e0 implements View.OnClickListener {
    public static final /* synthetic */ int p = 0;
    public final mj0 l;
    public final FunctionReferenceImpl m;
    public StickerItem n;
    public boolean o;

    /* compiled from: AutoSuggestStickersHolder.kt */
    public static final class a {
        public static bk5 a(Context context, AutoSuggestStickersPopupWindow autoSuggestStickersPopupWindow, yzs yzsVar) {
            final FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setOnTouchListener(new View.OnTouchListener() { // from class: xsna.ak5
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                        frameLayout.getChildAt(0).dispatchTouchEvent(motionEvent);
                    }
                    return false;
                }
            });
            frameLayout.addView(new VKStickerImageView(context, null, 6, 0));
            ImStickerView imStickerView = new ImStickerView(context, null, 6);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
            int D = autoSuggestStickersPopupWindow.D();
            frameLayout.setPadding(D, D, D, D);
            imStickerView.setLayoutParams(layoutParams);
            frameLayout.addView(imStickerView);
            ImageView imageView = new ImageView(context);
            imageView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 8388693));
            frameLayout.addView(imageView);
            return new bk5(frameLayout, autoSuggestStickersPopupWindow, yzsVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public bk5(FrameLayout frameLayout, mj0 mj0Var, yzs yzsVar) {
        super(frameLayout);
        this.l = mj0Var;
        this.m = (FunctionReferenceImpl) yzsVar;
        VKImageView vKImageView = (VKImageView) ((FrameLayout) this.itemView).getChildAt(0);
        vKImageView.setAspectRatio(1.0f);
        vKImageView.setBackground(vKImageView.getContext().getDrawable(R.drawable.bg_pack_rounded));
        frameLayout.setOnClickListener(this);
        frameLayout.setOnLongClickListener(new zj5());
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.yzs] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        StickerItem stickerItem = this.n;
        if (stickerItem != null) {
            this.m.invoke(stickerItem, Boolean.valueOf(this.o), this.itemView.getContext());
        }
    }
}
