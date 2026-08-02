package com.yandex.passport.internal.ui.common.web;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.TextView;
import com.yandex.passport.R;

/* loaded from: classes2.dex */
public final class f {
    public final j a;

    public f(j jVar) {
        this.a = jVar;
        jVar.z.setOutlineProvider(new ViewOutlineProvider() { // from class: com.yandex.passport.internal.ui.common.web.WebViewController$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                int width = view.getWidth();
                int height = view.getHeight();
                f.this.getClass();
                outline.setRoundRect(0, 0, width, height, 0.0f);
            }
        });
    }

    public final void a(int i) {
        j jVar = this.a;
        jVar.A.setVisibility(0);
        ((TextView) jVar.A.findViewById(R.id.text_error_message)).setText(i);
        jVar.x.setVisibility(8);
        jVar.z.setVisibility(8);
    }
}
