package com.yandex.messaging.views;

import android.content.Context;
import android.text.InputFilter;
import android.text.Spanned;
import android.widget.Toast;
import defpackage.oyh0;

/* loaded from: classes15.dex */
public class MaxLengthInputFilter extends InputFilter.LengthFilter {
    public static final int CHAT_DESCRIPTION_LENGTH_LIMIT = 500;
    public static final int CHAT_NAME_LENGTH_LIMIT = 250;
    public static final int MESSAGE_LENGTH_LIMIT = 4096;
    private Context mContext;
    private int mMessageLengthLimit;
    private final Toast mToast;

    public MaxLengthInputFilter(int i, Context context) {
        super(i);
        this.mMessageLengthLimit = i;
        this.mContext = context;
        this.mToast = Toast.makeText(this.mContext, context.getString(oyh0.messenger_max_limit_length_exceeded_error, Integer.valueOf(i)), 0);
    }

    @Override // android.text.InputFilter.LengthFilter, android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (isMaxMessageLengthExceeded(i, i2, spanned, i3, i4)) {
            this.mToast.show();
        }
        return super.filter(charSequence, i, i2, spanned, i3, i4);
    }

    public boolean isMaxMessageLengthExceeded(int i, int i2, Spanned spanned, int i3, int i4) {
        return (i2 - i) + (spanned.length() - (i4 - i3)) > this.mMessageLengthLimit;
    }
}
