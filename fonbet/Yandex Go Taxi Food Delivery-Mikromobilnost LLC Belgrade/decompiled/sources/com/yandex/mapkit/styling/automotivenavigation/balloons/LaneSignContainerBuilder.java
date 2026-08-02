package com.yandex.mapkit.styling.automotivenavigation.balloons;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.yandex.mapkit.styling.automotivenavigation.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0015H\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\"\u0010!J\u000f\u0010#\u001a\u00020\u0015H\u0002¢\u0006\u0004\b#\u0010!J\u000f\u0010$\u001a\u00020\u0015H\u0002¢\u0006\u0004\b$\u0010!J\r\u0010%\u001a\u00020\u0015¢\u0006\u0004\b%\u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010&R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010'R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010(R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010)R\u0014\u0010*\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010)R\u0014\u0010+\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010)R\u0014\u0010,\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010)R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010/R\u0014\u00101\u001a\u00020-8\u0002X\u0082D¢\u0006\u0006\n\u0004\b1\u0010/R\u0014\u00102\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010)¨\u00063"}, d2 = {"Lcom/yandex/mapkit/styling/automotivenavigation/balloons/LaneSignContainerBuilder;", "", "Landroid/content/Context;", "context", "", "Lcom/yandex/mapkit/styling/automotivenavigation/balloons/LaneItem;", "laneItems", "Landroid/widget/LinearLayout;", "laneSignContainerLayout", "", "laneColor", "<init>", "(Landroid/content/Context;Ljava/util/List;Landroid/widget/LinearLayout;I)V", "laneItem", "Landroid/graphics/Bitmap;", "renderLaneItem", "(Lcom/yandex/mapkit/styling/automotivenavigation/balloons/LaneItem;)Landroid/graphics/Bitmap;", "Landroid/graphics/drawable/Drawable;", "drawable", "Landroid/graphics/Canvas;", "canvas", "Lzy11;", "drawInContainer", "(Landroid/graphics/drawable/Drawable;Landroid/graphics/Canvas;)V", "Landroid/widget/ImageView;", "createItemContainer", "(Lcom/yandex/mapkit/styling/automotivenavigation/balloons/LaneItem;)Landroid/widget/ImageView;", "lane", "Landroid/widget/LinearLayout$LayoutParams;", "params", "applyOverlap", "(Lcom/yandex/mapkit/styling/automotivenavigation/balloons/LaneItem;Landroid/widget/LinearLayout$LayoutParams;)V", "buildSingle", "()V", "buildFirst", "buildCentral", "buildLast", "build", "Landroid/content/Context;", "Ljava/util/List;", "Landroid/widget/LinearLayout;", CA20Status.STATUS_USER_I, "smallOverlap", "largeOverlap", "indent", "", "containerWidth", "F", "containerHeight", "alphaFactor", "blendColor", "com.yandex.mapkit.styling.automotivenavigation_internalRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class LaneSignContainerBuilder {
    private final float alphaFactor = 0.4f;
    private final int blendColor = Color.argb((int) (0.4f * 255.0f), 255, 255, 255);
    private final float containerHeight;
    private final float containerWidth;
    private final Context context;
    private final int indent;
    private final int laneColor;
    private final List<LaneItem> laneItems;
    private final LinearLayout laneSignContainerLayout;
    private final int largeOverlap;
    private final int smallOverlap;

    public LaneSignContainerBuilder(Context context, List<LaneItem> list, LinearLayout linearLayout, int i) {
        this.context = context;
        this.laneItems = list;
        this.laneSignContainerLayout = linearLayout;
        this.laneColor = i;
        this.smallOverlap = (int) context.getResources().getDimension(R.dimen.mapkit_styling_automotive_overlap_laneitem_small);
        this.largeOverlap = (int) context.getResources().getDimension(R.dimen.mapkit_styling_automotive_overlap_laneitem_large);
        this.indent = (int) context.getResources().getDimension(R.dimen.mapkit_styling_automotive_margin_laneitem_side);
        this.containerWidth = context.getResources().getDimension(R.dimen.mapkit_styling_automotive_width_laneicon);
        this.containerHeight = context.getResources().getDimension(R.dimen.mapkit_styling_automotive_height_laneicon);
    }

    private final void applyOverlap(LaneItem lane, LinearLayout.LayoutParams params) {
        params.leftMargin = -(lane.getHasLargeOverlap() ? this.largeOverlap : this.smallOverlap);
    }

    private final void buildCentral() {
        int size = this.laneItems.size() - 1;
        for (int i = 1; i < size; i++) {
            LaneItem laneItem = this.laneItems.get(i);
            ImageView createItemContainer = createItemContainer(laneItem);
            applyOverlap(laneItem, (LinearLayout.LayoutParams) createItemContainer.getLayoutParams());
            this.laneSignContainerLayout.addView(createItemContainer, i);
        }
    }

    private final void buildFirst() {
        LaneItem laneItem = this.laneItems.get(0);
        ImageView createItemContainer = createItemContainer(laneItem);
        if (laneItem.getHasLeftOffset()) {
            ((LinearLayout.LayoutParams) createItemContainer.getLayoutParams()).leftMargin = this.indent;
        }
        this.laneSignContainerLayout.addView(createItemContainer, 0);
    }

    private final void buildLast() {
        LaneItem laneItem = (LaneItem) a.Z(this.laneItems);
        ImageView createItemContainer = createItemContainer(laneItem);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) createItemContainer.getLayoutParams();
        if (laneItem.getHasRightOffset()) {
            layoutParams.rightMargin = this.indent;
        }
        applyOverlap(laneItem, layoutParams);
        this.laneSignContainerLayout.addView(createItemContainer, this.laneItems.size() - 1);
    }

    private final void buildSingle() {
        LaneItem laneItem = this.laneItems.get(0);
        ImageView createItemContainer = createItemContainer(laneItem);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) createItemContainer.getLayoutParams();
        if (laneItem.getHasLeftOffset()) {
            layoutParams.leftMargin = this.indent;
        }
        if (laneItem.getHasRightOffset()) {
            layoutParams.rightMargin = this.indent;
        }
        this.laneSignContainerLayout.addView(createItemContainer, 0);
    }

    private final ImageView createItemContainer(LaneItem laneItem) {
        ImageView imageView = new ImageView(this.context);
        imageView.setLayoutParams(new LinearLayout.LayoutParams((int) this.containerWidth, (int) this.containerHeight));
        imageView.setImageBitmap(renderLaneItem(laneItem));
        return imageView;
    }

    private final void drawInContainer(Drawable drawable, Canvas canvas) {
        drawable.setBounds(0, 0, (int) this.containerWidth, (int) this.containerHeight);
        drawable.draw(canvas);
    }

    private final Bitmap renderLaneItem(LaneItem laneItem) {
        Bitmap createBitmap = Bitmap.createBitmap((int) this.containerWidth, (int) this.containerHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Iterator<Integer> it = laneItem.getSecondaryLanesImages().iterator();
        while (it.hasNext()) {
            Drawable drawable = this.context.getDrawable(it.next().intValue());
            drawable.setTint(this.laneColor);
            drawInContainer(drawable, canvas);
        }
        canvas.drawColor(this.blendColor, PorterDuff.Mode.MULTIPLY);
        Integer highlightedLaneImage = laneItem.getHighlightedLaneImage();
        if (highlightedLaneImage != null) {
            Drawable drawable2 = this.context.getDrawable(highlightedLaneImage.intValue());
            drawable2.setTint(this.laneColor);
            drawInContainer(drawable2, canvas);
        }
        Integer laneKindImage = laneItem.getLaneKindImage();
        if (laneKindImage != null) {
            Drawable drawable3 = this.context.getDrawable(laneKindImage.intValue());
            drawable3.setTint(laneItem.getHighlightedLaneImage() == null ? Color.argb((int) (this.alphaFactor * 255.0f), Color.red(this.laneColor), Color.green(this.laneColor), Color.blue(this.laneColor)) : this.laneColor);
            Integer laneKindCropImage = laneItem.getLaneKindCropImage();
            if (laneKindCropImage != null) {
                Drawable drawable4 = this.context.getDrawable(laneKindCropImage.intValue());
                Bitmap createBitmap2 = Bitmap.createBitmap((int) this.containerWidth, (int) this.containerHeight, Bitmap.Config.ARGB_8888);
                drawInContainer(drawable4, new Canvas(createBitmap2));
                Paint paint = new Paint();
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                canvas.drawBitmap(createBitmap2, 0.0f, 0.0f, paint);
            }
            drawInContainer(drawable3, canvas);
        }
        return createBitmap;
    }

    public final void build() {
        this.laneSignContainerLayout.removeAllViews();
        if (this.laneItems.size() == 1) {
            buildSingle();
            return;
        }
        buildFirst();
        buildCentral();
        buildLast();
    }
}
