package xsna;

import com.vk.channels.impl.comments.domain.RestoreCommentFailedException;
import io.jsonwebtoken.JwtParser;
import xsna.mwa;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class kwa implements izs {
    public final /* synthetic */ mwa b;
    public final /* synthetic */ int c;

    public /* synthetic */ kwa(mwa mwaVar, int i) {
        this.b = mwaVar;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.c;
        if (!booleanValue) {
            return io.reactivex.rxjava3.core.x.i(new RestoreCommentFailedException(uqi.a("Couldn't restore comment with id=", i, JwtParser.SEPARATOR_CHAR)));
        }
        mwa.a a = this.b.a();
        return io.reactivex.rxjava3.core.x.k(mwa.a.a(a, rbg.d(a.b, i, false), null, 5));
    }
}
