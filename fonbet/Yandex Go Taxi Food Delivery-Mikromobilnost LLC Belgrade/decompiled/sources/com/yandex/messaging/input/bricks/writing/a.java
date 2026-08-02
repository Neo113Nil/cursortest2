package com.yandex.messaging.input.bricks.writing;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.images.utils.ScaleMode;
import com.yandex.messaging.internal.view.attach.AttachInfo;
import com.yandex.messaging.internal.view.chat.input.InputTextController;
import defpackage.cvu0;
import defpackage.e9h0;
import defpackage.ewh0;
import defpackage.g8a1;
import defpackage.gvg0;
import defpackage.h3y;
import defpackage.hi91;
import defpackage.kjs0;
import defpackage.oyh0;
import defpackage.xav;
import defpackage.xb3;
import defpackage.xn50;
import defpackage.yn50;
import defpackage.z83;
import java.util.ArrayList;
import java.util.Iterator;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class a {
    public final h3y a;
    public final e b;
    public final xb3 c;
    public final InputTextController d;

    public a(h3y h3yVar, e eVar, xb3 xb3Var, InputTextController inputTextController) {
        this.a = h3yVar;
        this.b = eVar;
        this.c = xb3Var;
        this.d = inputTextController;
    }

    public final void a(ArrayList arrayList) {
        String string;
        Object obj;
        arrayList.isEmpty();
        z83.i();
        xb3 xb3Var = this.c;
        xb3Var.a.c(0);
        DisplayMetrics displayMetrics = kjs0.a;
        View a = xb3Var.a((int) (displayMetrics.density * 32.0f));
        TextView textView = (TextView) a.findViewById(e9h0.chat_input_panel_first_line);
        View a2 = xb3Var.a((int) (displayMetrics.density * 32.0f));
        int size = arrayList.size();
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = ((AttachInfo) it.next()).mimeType;
                if (str == null || !cvu0.x(str, "image/", false)) {
                    Resources resources = a2.getResources();
                    int i = ewh0.chat_attach_send_files;
                    int i2 = oyh0.chat_attach_send_files_reserve;
                    Object[] objArr = {Integer.valueOf(size)};
                    try {
                        string = resources.getQuantityString(i, size, objArr);
                        break;
                    } catch (Resources.NotFoundException unused) {
                        string = resources.getString(i2, objArr);
                    }
                }
            }
        }
        int i3 = (size == 1 && ((AttachInfo) arrayList.get(0)).isAnimated()) ? ewh0.chat_attach_send_gif : ewh0.chat_attach_send_images;
        Resources resources2 = a2.getResources();
        int i4 = oyh0.chat_attach_send_images_reserve;
        Object[] objArr2 = {Integer.valueOf(size)};
        try {
            string = resources2.getQuantityString(i3, size, objArr2);
        } catch (Resources.NotFoundException unused2) {
            string = resources2.getString(i4, objArr2);
        }
        textView.setText(string);
        TextView textView2 = (TextView) a.findViewById(e9h0.chat_input_panel_second_line);
        int size2 = arrayList.size();
        StringBuilder sb = new StringBuilder();
        Iterator it2 = arrayList.iterator();
        int i5 = 0;
        while (it2.hasNext()) {
            sb.append(((AttachInfo) it2.next()).fileName);
            i5++;
            if (i5 < size2) {
                sb.append(Extension.FIX_SPACE);
            }
        }
        textView2.setText(sb.toString());
        hi91.g(new ChatInputAttachController$addAttachMessage$2$1$3$1(this, null), (ImageButton) a.findViewById(e9h0.chat_input_clear));
        View a3 = xb3Var.a((int) (32.0f * kjs0.a.density));
        ImageView imageView = (ImageView) g8a1.e(e9h0.chat_input_panel_image_preview, a3);
        View e = g8a1.e(e9h0.chat_input_panel_image_preview_container, a3);
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj = null;
                break;
            }
            obj = it3.next();
            String str2 = ((AttachInfo) obj).mimeType;
            if (str2 != null && cvu0.x(str2, "image/", false)) {
                break;
            }
        }
        AttachInfo attachInfo = (AttachInfo) obj;
        if (attachInfo != null) {
            e.setVisibility(0);
            int dimensionPixelSize = a3.getResources().getDimensionPixelSize(gvg0.chat_input_panel_preview_size);
            yn50 yn50Var = (yn50) ((xav) this.a.get()).load(attachInfo.uri.toString());
            xn50 xn50Var = yn50Var.b;
            xn50Var.i = dimensionPixelSize;
            xn50Var.j = dimensionPixelSize;
            xn50Var.k = ScaleMode.CENTER_CROP;
            yn50Var.b(imageView, null);
        } else {
            e.setVisibility(8);
        }
        this.b.e(arrayList);
        this.d.requestFocusAndOpenKeyboard();
    }
}
