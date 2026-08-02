package com.yandex.passport.internal.ui.domik.call;

import android.view.View;
import android.widget.TextView;
import com.yandex.passport.R;
import com.yandex.passport.internal.widget.ConfirmationCodeInput;

/* loaded from: classes2.dex */
public final class d {
    public final ConfirmationCodeInput a;
    public final TextView b;
    public final View c;

    public d(View view) {
        this.a = (ConfirmationCodeInput) view.findViewById(R.id.input_phone_code);
        this.b = (TextView) view.findViewById(R.id.text_message);
        this.c = view.findViewById(R.id.scroll_view_content);
    }
}
