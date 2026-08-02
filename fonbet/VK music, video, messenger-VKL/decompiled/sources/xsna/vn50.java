package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ao50;
import xsna.kj50;

/* compiled from: MviView.kt */
/* loaded from: classes7.dex */
public abstract class vn50<VS extends ao50, A extends kj50> implements gm50 {
    public final Context b;
    public final FunctionReferenceImpl c;
    public final View d;

    /* JADX WARN: Multi-variable type inference failed */
    public vn50(int i, Context context, izs izsVar) {
        this.b = context;
        this.c = (FunctionReferenceImpl) izsVar;
        this.d = LayoutInflater.from(context).inflate(i, (ViewGroup) null);
    }
}
