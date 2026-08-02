package xsna;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.util.StateSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class noy0 extends LinearLayout {
    public final ImageView b;
    public final TextView c;
    public final ujz0 d;
    public final rvy0 e;

    public noy0(Context context) {
        super(context);
        ujz0 ujz0Var = new ujz0(context);
        this.d = ujz0Var;
        rvy0 rvy0Var = new rvy0(context);
        this.e = rvy0Var;
        int i = rvy0.r;
        SparseIntArray sparseIntArray = rvy0Var.a;
        int i2 = sparseIntArray.get(i);
        int i3 = sparseIntArray.get(rvy0.A);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{i2, i2});
        GradientDrawable gradientDrawable2 = new GradientDrawable(orientation, new int[]{i3, i3});
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, gradientDrawable2);
        int[] iArr = StateSet.WILD_CARD;
        stateListDrawable.addState(iArr, gradientDrawable);
        setBackground(new RippleDrawable(new ColorStateList(new int[][]{new int[]{R.attr.state_pressed}, iArr}, new int[]{c1z0.c(i3), c1z0.c(i2)}), stateListDrawable, null));
        int i4 = ujz0.r;
        SparseIntArray sparseIntArray2 = ujz0Var.a;
        int i5 = sparseIntArray2.get(i4);
        setPadding(i5, 0, i5, 0);
        ImageView imageView = new ImageView(context);
        int i6 = sparseIntArray2.get(ujz0.w);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i6, i6);
        int i7 = sparseIntArray2.get(ujz0.m);
        layoutParams.setMargins(0, i7, sparseIntArray2.get(i4), i7);
        imageView.setLayoutParams(layoutParams);
        this.b = imageView;
        addView(imageView);
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        int i8 = sparseIntArray2.get(ujz0.p);
        layoutParams2.setMargins(0, i8, 0, i8);
        textView.setLayoutParams(layoutParams2);
        textView.setTextSize(sparseIntArray2.get(ujz0.S));
        textView.setTextColor(sparseIntArray.get(rvy0.s));
        this.c = textView;
        addView(textView);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void setData(@NonNull b520 b520Var) {
        Bitmap a;
        String str = b520Var.c;
        boolean isEmpty = TextUtils.isEmpty(str);
        ImageView imageView = this.b;
        if (isEmpty) {
            imageView.setVisibility(8);
        } else {
            int i = this.d.a.get(ujz0.v);
            Context context = getContext();
            str.getClass();
            char c = 65535;
            switch (str.hashCode()) {
                case -1975550735:
                    if (str.equals("recommendation_rules")) {
                        c = 0;
                        break;
                    }
                    break;
                case -599449367:
                    if (str.equals("complain")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3059573:
                    if (str.equals("copy")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3202370:
                    if (str.equals("hide")) {
                        c = 3;
                        break;
                    }
                    break;
                case 895502019:
                    if (str.equals("ad_marker_template")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1789286912:
                    if (str.equals("show_advertiser_info")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            rvy0 rvy0Var = this.e;
            switch (c) {
                case 0:
                    a = hpy0.a(context, "M11.6917 2C9.24388 2 8.16477 2.21562 7.06946 2.8014C6.09426 3.32294 5.32294 4.09426 4.8014 5.06946C4.21562 6.16477 4 7.24388 4 9.69166V18.3083C4 20.7561 4.21562 21.8352 4.8014 22.9305C5.32294 23.9057 6.09426 24.6771 7.06946 25.1986C8.16477 25.7844 9.24388 26 11.6917 26H16.3083C18.7561 26 19.8352 25.7844 20.9305 25.1986C21.9057 24.6771 22.6771 23.9057 23.1986 22.9305C23.7844 21.8352 24 20.7561 24 18.3083V12.3588C24 11.5621 23.9722 11.2037 23.878 10.7947C23.7846 10.3895 23.6329 10.0234 23.4125 9.67084C23.1899 9.31494 22.9561 9.04186 22.3927 8.47851L17.5215 3.60727C16.9581 3.04393 16.6851 2.81012 16.3292 2.58754C15.9766 2.36706 15.6105 2.21543 15.2053 2.12204C14.8634 2.04323 14.5568 2.0109 14 2.00241V2H11.6917ZM11.6917 4C9.35671 4 8.67339 4.21166 8.01266 4.56502C7.386 4.90017 6.90017 5.386 6.56503 6.01266C6.21167 6.67339 6 7.35671 6 9.69166V18.3083C6 20.6433 6.21167 21.3266 6.56503 21.9873C6.90017 22.614 7.386 23.0998 8.01266 23.435C8.67339 23.7883 9.35671 24 11.6917 24H16.3083C18.6433 24 19.3266 23.7883 19.9873 23.435C20.614 23.0998 21.0998 22.614 21.435 21.9873C21.7883 21.3266 22 20.6433 22 18.3083V12.3588C22 12.2215 21.9992 12.1031 21.9976 11.9996L16.5 12C15.1193 12 14 10.8807 14 9.5L14.0015 4.00245C13.9473 4.00157 13.8891 4.00094 13.8261 4.00054L11.6917 4ZM16.1073 5.02149L16 4.915V9.5C16 9.74546 16.1769 9.94961 16.4101 9.99194L16.5 10L21.0873 10.0021C21.0531 9.9675 21.0169 9.93111 20.9785 9.89273L16.1073 5.02149Z", i, rvy0Var.a.get(rvy0.n));
                    break;
                case 1:
                    a = hpy0.a(context, "M17.379,2C18.042,2 18.678,2.263 19.146,2.732L25.268,8.854C25.737,9.322 26,9.958 26,10.621V17.379C26,18.042 25.737,18.678 25.268,19.146L19.146,25.268C18.678,25.737 18.042,26 17.379,26H10.621C9.958,26 9.322,25.737 8.854,25.268L2.732,19.146C2.263,18.678 2,18.042 2,17.379V10.621C2,9.958 2.263,9.322 2.732,8.854L8.854,2.732C9.322,2.263 9.958,2 10.621,2H17.379ZM17.379,4H10.621C10.489,4 10.361,4.053 10.268,4.146L4.146,10.268C4.053,10.361 4,10.489 4,10.621V17.379C4,17.511 4.053,17.639 4.146,17.732L10.268,23.854C10.361,23.947 10.489,24 10.621,24H17.379C17.511,24 17.639,23.947 17.732,23.854L23.854,17.732C23.947,17.639 24,17.511 24,17.379V10.621C24,10.489 23.947,10.361 23.854,10.268L17.732,4.146C17.639,4.053 17.511,4 17.379,4ZM14,16.8L14.123,16.806C14.728,16.868 15.2,17.379 15.2,18C15.2,18.663 14.663,19.2 14,19.2L13.877,19.194C13.272,19.132 12.8,18.621 12.8,18C12.8,17.337 13.337,16.8 14,16.8ZM14,8C14.552,8 15,8.448 15,9V14C15,14.552 14.552,15 14,15C13.448,15 13,14.552 13,14V9C13,8.448 13.448,8 14,8Z", i, rvy0Var.a.get(rvy0.n));
                    break;
                case 2:
                    a = hpy0.a(context, "M17,2C18.306,2 19.417,2.835 19.829,4L10.128,4C8.345,4 7.698,4.186 7.046,4.534C6.394,4.883 5.883,5.394 5.534,6.046C5.186,6.698 5,7.345 5,9.128L5,19.829C3.835,19.417 3,18.306 3,17V8C3,4.686 5.686,2 9,2H17ZM21,6C22.657,6 24,7.343 24,9V22C24,23.657 22.657,25 21,25H10C8.343,25 7,23.657 7,22V9C7,7.343 8.343,6 10,6H21ZM21,8H10C9.448,8 9,8.448 9,9V22C9,22.552 9.448,23 10,23H21C21.552,23 22,22.552 22,22V9C22,8.448 21.552,8 21,8Z", i, rvy0Var.a.get(rvy0.n));
                    break;
                case 3:
                    a = hpy0.a(context, "M14 2C20.6274 2 26 7.37258 26 14C26 20.6274 20.6274 26 14 26C7.37258 26 2 20.6274 2 14C2 7.37258 7.37258 2 14 2ZM14 4C8.47715 4 4 8.47715 4 14C4 19.5228 8.47715 24 14 24C19.5228 24 24 19.5228 24 14C24 8.47715 19.5228 4 14 4ZM19 13C19.5523 13 20 13.4477 20 14C20 14.5523 19.5523 15 19 15H9C8.44772 15 8 14.5523 8 14C8 13.4477 8.44772 13 9 13H19Z", i, rvy0Var.a.get(rvy0.n));
                    break;
                case 4:
                    a = hpy0.a(context, "M14,2C20.627,2 26,7.373 26,14C26,20.627 20.627,26 14,26C7.373,26 2,20.627 2,14C2,7.373 7.373,2 14,2ZM14,4C8.477,4 4,8.477 4,14C4,19.523 8.477,24 14,24C19.523,24 24,19.523 24,14C24,8.477 19.523,4 14,4ZM14.074,12C14.311,12 14.46,12.037 14.591,12.107C14.721,12.177 14.823,12.279 14.893,12.409C14.963,12.54 15,12.689 15,12.926V19.074C15,19.311 14.963,19.46 14.893,19.591C14.823,19.721 14.721,19.823 14.591,19.893C14.46,19.963 14.311,20 14.074,20H13.926C13.689,20 13.54,19.963 13.409,19.893C13.279,19.823 13.177,19.721 13.107,19.591C13.037,19.46 13,19.311 13,19.074V12.926C13,12.689 13.037,12.54 13.107,12.409C13.177,12.279 13.279,12.177 13.409,12.107C13.54,12.037 13.689,12 13.926,12H14.074ZM14,7.6C14.773,7.6 15.4,8.227 15.4,9C15.4,9.773 14.773,10.4 14,10.4C13.227,10.4 12.6,9.773 12.6,9C12.6,8.227 13.227,7.6 14,7.6Z", i, rvy0Var.a.get(rvy0.n));
                    break;
                case 5:
                    a = hpy0.a(context, "M14,2C20.627,2 26,7.373 26,14C26,20.627 20.627,26 14,26C7.373,26 2,20.627 2,14C2,7.373 7.373,2 14,2ZM14,4C8.477,4 4,8.477 4,14C4,19.523 8.477,24 14,24C19.523,24 24,19.523 24,14C24,8.477 19.523,4 14,4ZM18,9C18.552,9 19,9.448 19,10V16C19,16.552 18.552,17 18,17C17.448,17 17,16.552 17,16V12.414L10.707,18.707C10.347,19.068 9.779,19.095 9.387,18.79L9.293,18.707C8.902,18.317 8.902,17.683 9.293,17.293L15.584,11H12C11.487,11 11.064,10.614 11.007,10.117L11,10C11,9.448 11.448,9 12,9H18Z", i, rvy0Var.a.get(rvy0.n));
                    break;
                default:
                    a = null;
                    break;
            }
            imageView.setImageBitmap(a);
            if (b520Var.c.equalsIgnoreCase("complain")) {
                imageView.setColorFilter(Color.parseColor("#E64646"));
            }
        }
        this.c.setText(b520Var.a);
    }
}
