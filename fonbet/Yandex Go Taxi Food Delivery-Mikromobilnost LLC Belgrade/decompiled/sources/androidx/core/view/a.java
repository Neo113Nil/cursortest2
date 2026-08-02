package androidx.core.view;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import defpackage.h070;
import defpackage.mge;
import defpackage.rt7;
import defpackage.sae;
import java.util.Objects;

/* loaded from: classes10.dex */
public abstract class a {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static mge b(View view, mge mgeVar) {
        ContentInfo b = mgeVar.a.b();
        Objects.requireNonNull(b);
        ContentInfo j = rt7.j(b);
        ContentInfo performReceiveContent = view.performReceiveContent(j);
        if (performReceiveContent == null) {
            return null;
        }
        return performReceiveContent == j ? mgeVar : new mge(new sae(performReceiveContent));
    }

    public static void c(View view, String[] strArr, final h070 h070Var) {
        if (h070Var == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new OnReceiveContentListener(h070Var) { // from class: androidx.core.view.ViewCompat$OnReceiveContentListenerAdapter
                private final h070 mJetpackListener;

                {
                    this.mJetpackListener = h070Var;
                }

                public ContentInfo onReceiveContent(View view2, ContentInfo contentInfo) {
                    mge mgeVar = new mge(new sae(contentInfo));
                    mge a = this.mJetpackListener.a(view2, mgeVar);
                    if (a == null) {
                        return null;
                    }
                    if (a == mgeVar) {
                        return contentInfo;
                    }
                    ContentInfo b = a.a.b();
                    Objects.requireNonNull(b);
                    return rt7.j(b);
                }
            });
        }
    }
}
