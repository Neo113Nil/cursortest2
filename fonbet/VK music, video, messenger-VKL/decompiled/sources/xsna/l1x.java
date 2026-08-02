package xsna;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.appcompat.widget.AppCompatEditText;
import xsna.chj;
import xsna.n1x;

/* compiled from: InputConnectionCompat.java */
/* loaded from: classes12.dex */
public final class l1x extends InputConnectionWrapper {
    public final /* synthetic */ vj0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1x(InputConnection inputConnection, vj0 vj0Var) {
        super(inputConnection, false);
        this.a = vj0Var;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Bundle bundle2;
        chj.b bVar;
        n1x n1xVar = inputContentInfo == null ? null : new n1x(new n1x.a(inputContentInfo));
        AppCompatEditText appCompatEditText = (AppCompatEditText) this.a.c;
        if ((i & 1) != 0) {
            try {
                n1xVar.a.a.requestPermission();
                InputContentInfo inputContentInfo2 = n1xVar.a.a;
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception unused) {
            }
        } else {
            bundle2 = bundle;
        }
        n1x.a aVar = n1xVar.a;
        ClipData clipData = new ClipData(aVar.a.getDescription(), new ClipData.Item(aVar.a.getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            bVar = new chj.a(clipData, 2);
        } else {
            chj.c cVar = new chj.c();
            cVar.a = clipData;
            cVar.b = 2;
            bVar = cVar;
        }
        bVar.b(aVar.a.getLinkUri());
        bVar.setExtras(bundle2);
        if (iut0.m(appCompatEditText, bVar.build()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
