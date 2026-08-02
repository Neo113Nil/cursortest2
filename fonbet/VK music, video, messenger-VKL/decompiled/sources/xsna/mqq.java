package xsna;

import android.content.Context;
import android.text.Editable;
import com.vk.dto.newsfeed.FaveTag;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.eeu0;
import xsna.h7u0;

/* compiled from: FaveInputFunctions.kt */
/* loaded from: classes4.dex */
public final class mqq {

    /* compiled from: FaveInputFunctions.kt */
    public static final class a extends rno0 {
        @Override // xsna.rno0, android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            ucp ucpVar = ucp.a;
            ucp.i(editable);
        }
    }

    /* compiled from: FaveInputFunctions.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        public static final b b = new b(1, h03.class, "showToastError", "showToastError(Ljava/lang/Throwable;)V", 1);

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            h03.b(th);
            return s3q0.a;
        }
    }

    public static final void a(Context context, FaveTag faveTag) {
        String str;
        String e = y8g0.e(faveTag != null ? R.string.fave_tags_edit : R.string.fave_tags_create);
        String e2 = y8g0.e(R.string.fave_cancel_remove);
        String e3 = y8g0.e(R.string.fave_tags_create_title_2);
        eeu0.a.C2801a c2801a = new eeu0.a.C2801a(new h7u0.a(context));
        c2801a.m = 8;
        if (faveTag == null || (str = faveTag.c) == null) {
            str = "";
        }
        c2801a.g = str;
        c2801a.c = 8388611;
        c2801a.b = e3;
        c2801a.n = true;
        c2801a.q = true;
        c2801a.d = "";
        c2801a.s = new e69((byte) 0, 4);
        j89 j89Var = new j89(5);
        c2801a.l = e2;
        c2801a.u = j89Var;
        e5l e5lVar = new e5l(1, faveTag, context);
        c2801a.k = e;
        c2801a.t = e5lVar;
        c2801a.g();
    }
}
