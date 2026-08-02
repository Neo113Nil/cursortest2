package com.yandex.messaging.div;

import android.net.Uri;
import android.text.TextUtils;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.yandex.div.legacy.view.DivView;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.core.net.entities.directives.Directive;
import defpackage.b0x;
import defpackage.e2b;
import defpackage.k9y;
import defpackage.sml;
import defpackage.w3i;
import defpackage.w7b;
import defpackage.ydz;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes15.dex */
public final class a extends k9y {
    public final sml a;
    public final w3i b;
    public w7b c;
    public ChatRequest d;
    public String e;
    public final JsonAdapter f;
    public final ArrayList g = new ArrayList();

    public a(sml smlVar, w3i w3iVar, Moshi moshi) {
        this.a = smlVar;
        this.b = w3iVar;
        this.f = moshi.adapter(Directive[].class);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        return true;
     */
    @Override // defpackage.k9y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(Uri uri, DivView divView) {
        Iterator it = this.g.iterator();
        while (true) {
            if (it.hasNext()) {
                e2b e2bVar = (e2b) it.next();
                if (divView.getView() == e2bVar.a && ((Boolean) ((DivMessageViewControllerImpl$singleViewHandler$1) e2bVar.b).invoke(uri, divView)).booleanValue()) {
                    break;
                }
            } else if (!super.a(uri, divView)) {
                String scheme = uri.getScheme();
                if (scheme != null) {
                    if (scheme.equals("dialog-action")) {
                        b(uri);
                        return true;
                    }
                    if (scheme.equals("messenger-action")) {
                        b(uri);
                        return true;
                    }
                }
                ((b0x) this.a.a).d.a(uri);
                return true;
            }
        }
    }

    public final void b(Uri uri) {
        ChatRequest chatRequest;
        w7b w7bVar;
        String queryParameter = uri.getQueryParameter("directives");
        if (TextUtils.isEmpty(queryParameter)) {
            ydz.b("ChatDivUriHandler", "No directives");
            return;
        }
        try {
            Directive[] directiveArr = (Directive[]) this.f.fromJson(queryParameter);
            if (directiveArr == null || (chatRequest = this.d) == null || (w7bVar = this.c) == null) {
                return;
            }
            this.b.k(chatRequest, w7bVar, directiveArr, this.e);
        } catch (IOException e) {
            ydz.c("ChatDivUriHandler", "Failed to parse directives", e);
        }
    }
}
