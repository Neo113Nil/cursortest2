package com.yandex.go.navigator.domain.balloon;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.yandex.mapkit.directions.driving.DirectionSignExit;
import com.yandex.mapkit.directions.driving.DirectionSignIcon;
import com.yandex.mapkit.directions.driving.DirectionSignImage;
import com.yandex.mapkit.directions.driving.DirectionSignItem;
import com.yandex.mapkit.directions.driving.DirectionSignRoad;
import com.yandex.mapkit.directions.driving.DirectionSignStyle;
import com.yandex.mapkit.directions.driving.DirectionSignToponym;
import com.yandex.mapkit.styling.automotivenavigation.R;
import defpackage.amj;
import defpackage.d6w;
import defpackage.scc;
import defpackage.t5w;
import defpackage.w511;
import defpackage.wuj0;
import defpackage.y6i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR:\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R*\u0010$\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010%R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010%R\u0014\u0010/\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010%R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00104\u001a\u0004\u0018\u0001038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00066"}, d2 = {"Lcom/yandex/go/navigator/domain/balloon/DirectionSignView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/yandex/mapkit/directions/driving/DirectionSignImage;", "icon", "Lcom/yandex/mapkit/directions/driving/DirectionSignStyle;", "style", "Landroid/widget/LinearLayout$LayoutParams;", "lp", "Lzy11;", "addIcon", "(Lcom/yandex/mapkit/directions/driving/DirectionSignImage;Lcom/yandex/mapkit/directions/driving/DirectionSignStyle;Landroid/widget/LinearLayout$LayoutParams;)V", "", "txt", "addText", "(Ljava/lang/String;Lcom/yandex/mapkit/directions/driving/DirectionSignStyle;Landroid/widget/LinearLayout$LayoutParams;)V", "fillDirectionSignContainer", "()V", "", "Lcom/yandex/mapkit/directions/driving/DirectionSignItem;", "value", "items", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "maxWidth", CA20Status.STATUS_USER_I, "getMaxWidth", "()I", "setMaxWidth", "(I)V", "indentInt", "Landroid/graphics/drawable/shapes/RoundRectShape;", "shape", "Landroid/graphics/drawable/shapes/RoundRectShape;", "itemHeight", "textPadding", "", "fontSize", "F", "Landroid/graphics/Typeface;", "typefaceRes", "Landroid/graphics/Typeface;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DirectionSignView extends LinearLayout {
    public static final int $stable = 8;
    private final float fontSize;
    private final int indentInt;
    private final int itemHeight;
    private List<? extends DirectionSignItem> items;
    private int maxWidth;
    private final RoundRectShape shape;
    private final int textPadding;
    private final Typeface typefaceRes;

    public DirectionSignView(Context context) {
        super(context);
        this.maxWidth = (int) getContext().getResources().getDimension(R.dimen.mapkit_styling_automotive_directionsign_maxwidth);
        this.indentInt = (int) getContext().getResources().getDimension(R.dimen.mapkit_styling_automotive_directionsign_margin_between);
        this.itemHeight = (int) getContext().getResources().getDimension(R.dimen.mapkit_styling_automotive_directionsign_height);
        this.textPadding = (int) getContext().getResources().getDimension(R.dimen.mapkit_styling_automotive_directionsign_text_padding);
        this.fontSize = getContext().getResources().getDimension(R.dimen.mapkit_styling_automotive_directionsign_fontsize);
        this.typefaceRes = wuj0.b(R.font.ys_text_regular, getContext());
        float dimension = getContext().getResources().getDimension(R.dimen.mapkit_styling_automotive_directionsign_corner_radius);
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = dimension;
        }
        this.shape = new RoundRectShape(fArr, null, null);
    }

    private final void addIcon(DirectionSignImage icon, DirectionSignStyle style, LinearLayout.LayoutParams lp) {
        int i;
        ImageView imageView = new ImageView(getContext());
        switch (amj.a[icon.ordinal()]) {
            case 1:
                i = R.drawable.mapkit_styling_automotive_roadsign_ic_railway_crossing;
                break;
            case 2:
                i = R.drawable.mapkit_styling_automotive_roadsign_ic_ski_slope;
                break;
            case 3:
                i = R.drawable.mapkit_styling_automotive_roadsign_ic_stadium;
                break;
            case 4:
                i = R.drawable.mapkit_styling_automotive_roadsign_ic_freeway;
                break;
            case 5:
                i = R.drawable.mapkit_styling_automotive_roadsign_ic_brige;
                break;
            case 6:
                i = R.drawable.mapkit_styling_automotive_roadsign_ic_tunnel;
                break;
            case 7:
                i = R.drawable.mapkit_styling_automotive_roadsign_ic_ferry;
                break;
            case 8:
                i = R.drawable.mapkit_styling_automotive_roadsign_ic_subway_station;
                break;
            case 9:
                i = R.drawable.mapkit_styling_automotive_roadsign_ic_railway_station;
                break;
            case 10:
                i = R.drawable.mapkit_styling_automotive_roadsign_ic_airport;
                break;
            case 11:
                i = R.drawable.mapkit_styling_automotive_roadsign_ic_hospital;
                break;
            case 12:
                i = R.drawable.mapkit_styling_automotive_roadsign_ic_tr_brige;
                break;
            case 13:
                i = R.drawable.mapkit_styling_automotive_roadsign_ic_tr_subway_station;
                break;
            case 14:
                i = R.drawable.mapkit_styling_automotive_roadsign_ic_tr_hospital;
                break;
            case 15:
                i = R.drawable.mapkit_styling_automotive_roadsign_ic_beach;
                break;
            case 16:
                i = R.drawable.mapkit_styling_automotive_roadsign_ic_burj_khalifa;
                break;
            case 17:
                i = R.drawable.mapkit_styling_automotive_roadsign_ic_gas;
                break;
            case 18:
                i = R.drawable.mapkit_styling_automotive_roadsign_ic_hotel;
                break;
            case 19:
                i = R.drawable.mapkit_styling_automotive_roadsign_ic_kaaba;
                break;
            case 20:
                i = R.drawable.mapkit_styling_automotive_roadsign_ic_mall;
                break;
            case 21:
                i = R.drawable.mapkit_styling_automotive_roadsign_ic_mosque;
                break;
            case 22:
                i = R.drawable.mapkit_styling_automotive_roadsign_ic_uae_subway;
                break;
            case 23:
                i = R.drawable.mapkit_styling_automotive_roadsign_ic_uae_tram;
                break;
            case 24:
                i = R.drawable.mapkit_styling_automotive_roadsign_ic_university;
                break;
            default:
                w511.b();
                return;
        }
        imageView.setImageResource(i);
        ShapeDrawable shapeDrawable = new ShapeDrawable(this.shape.clone());
        shapeDrawable.getPaint().setColor(style.getBgColor());
        imageView.setColorFilter(style.getTextColor(), PorterDuff.Mode.SRC_ATOP);
        imageView.setBackground(shapeDrawable);
        addView(imageView, lp);
    }

    private final void addText(String txt, DirectionSignStyle style, LinearLayout.LayoutParams lp) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        ShapeDrawable shapeDrawable = new ShapeDrawable(this.shape.clone());
        shapeDrawable.getPaint().setColor(style.getBgColor());
        int i = this.textPadding;
        shapeDrawable.setPadding(i, 0, i, 0);
        appCompatTextView.setText(txt);
        appCompatTextView.setTypeface(this.typefaceRes);
        appCompatTextView.setTextSize(0, this.fontSize);
        appCompatTextView.setBackground(shapeDrawable);
        appCompatTextView.setGravity(19);
        appCompatTextView.setTextColor(style.getTextColor());
        appCompatTextView.setMaxLines(1);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        addView(appCompatTextView, lp);
    }

    private final void fillDirectionSignContainer() {
        Pair pair;
        removeAllViews();
        List<? extends DirectionSignItem> list = this.items;
        Object obj = null;
        if (list != null) {
            int i = 0;
            for (Object obj2 : list) {
                int i2 = i + 1;
                if (i < 0) {
                    scc.m();
                    throw null;
                }
                DirectionSignItem directionSignItem = (DirectionSignItem) obj2;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, this.itemHeight);
                if (i != 0) {
                    layoutParams.leftMargin = this.indentInt;
                }
                DirectionSignIcon icon = directionSignItem.getIcon();
                if (icon != null) {
                    layoutParams.width = this.itemHeight;
                    addIcon(icon.getImage(), icon.getStyle(), layoutParams);
                }
                DirectionSignRoad road = directionSignItem.getRoad();
                if (road != null) {
                    pair = new Pair(road.getName(), road.getStyle());
                } else {
                    DirectionSignToponym toponym = directionSignItem.getToponym();
                    if (toponym != null) {
                        pair = new Pair(toponym.getText(), toponym.getStyle());
                    } else {
                        DirectionSignExit exit = directionSignItem.getExit();
                        pair = exit != null ? new Pair(exit.getName(), exit.getStyle()) : null;
                    }
                }
                if (pair != null) {
                    addText((String) pair.getFirst(), (DirectionSignStyle) pair.getSecond(), layoutParams);
                }
                i = i2;
            }
        }
        if (this.items != null) {
            d6w n = y6i0.n(0, getChildCount());
            ArrayList arrayList = new ArrayList();
            Iterator it = n.iterator();
            while (it.hasNext()) {
                arrayList.add(getChildAt(((t5w) it).nextInt()));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : arrayList) {
                if (obj3 instanceof AppCompatTextView) {
                    arrayList2.add(obj3);
                }
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
            int measuredWidth = getMeasuredWidth() - this.maxWidth;
            if (measuredWidth > 0) {
                Iterator it2 = arrayList2.iterator();
                if (it2.hasNext()) {
                    obj = it2.next();
                    if (it2.hasNext()) {
                        int measuredWidth2 = ((AppCompatTextView) obj).getMeasuredWidth();
                        do {
                            Object next = it2.next();
                            int measuredWidth3 = ((AppCompatTextView) next).getMeasuredWidth();
                            if (measuredWidth2 < measuredWidth3) {
                                obj = next;
                                measuredWidth2 = measuredWidth3;
                            }
                        } while (it2.hasNext());
                    }
                }
                AppCompatTextView appCompatTextView = (AppCompatTextView) obj;
                if (appCompatTextView != null) {
                    appCompatTextView.setMaxWidth(appCompatTextView.getMeasuredWidth() - measuredWidth);
                }
            }
        }
    }

    public final List<DirectionSignItem> getItems() {
        return this.items;
    }

    public final int getMaxWidth() {
        return this.maxWidth;
    }

    public final void setItems(List<? extends DirectionSignItem> list) {
        this.items = list;
        fillDirectionSignContainer();
    }

    public final void setMaxWidth(int i) {
        this.maxWidth = i;
        fillDirectionSignContainer();
    }

    public DirectionSignView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.maxWidth = (int) getContext().getResources().getDimension(R.dimen.mapkit_styling_automotive_directionsign_maxwidth);
        this.indentInt = (int) getContext().getResources().getDimension(R.dimen.mapkit_styling_automotive_directionsign_margin_between);
        this.itemHeight = (int) getContext().getResources().getDimension(R.dimen.mapkit_styling_automotive_directionsign_height);
        this.textPadding = (int) getContext().getResources().getDimension(R.dimen.mapkit_styling_automotive_directionsign_text_padding);
        this.fontSize = getContext().getResources().getDimension(R.dimen.mapkit_styling_automotive_directionsign_fontsize);
        this.typefaceRes = wuj0.b(R.font.ys_text_regular, getContext());
        float dimension = getContext().getResources().getDimension(R.dimen.mapkit_styling_automotive_directionsign_corner_radius);
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = dimension;
        }
        this.shape = new RoundRectShape(fArr, null, null);
    }

    public DirectionSignView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.maxWidth = (int) getContext().getResources().getDimension(R.dimen.mapkit_styling_automotive_directionsign_maxwidth);
        this.indentInt = (int) getContext().getResources().getDimension(R.dimen.mapkit_styling_automotive_directionsign_margin_between);
        this.itemHeight = (int) getContext().getResources().getDimension(R.dimen.mapkit_styling_automotive_directionsign_height);
        this.textPadding = (int) getContext().getResources().getDimension(R.dimen.mapkit_styling_automotive_directionsign_text_padding);
        this.fontSize = getContext().getResources().getDimension(R.dimen.mapkit_styling_automotive_directionsign_fontsize);
        this.typefaceRes = wuj0.b(R.font.ys_text_regular, getContext());
        float dimension = getContext().getResources().getDimension(R.dimen.mapkit_styling_automotive_directionsign_corner_radius);
        float[] fArr = new float[8];
        for (int i2 = 0; i2 < 8; i2++) {
            fArr[i2] = dimension;
        }
        this.shape = new RoundRectShape(fArr, null, null);
    }
}
