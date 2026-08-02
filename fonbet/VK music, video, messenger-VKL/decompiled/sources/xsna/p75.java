package xsna;

import android.content.Context;
import android.view.ContextThemeWrapper;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import java.util.Iterator;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.yks0;

/* compiled from: AuthorActionHandler.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class p75 extends FunctionReferenceImpl implements gzs<s3q0> {
    @Override // xsna.gzs
    public final s3q0 invoke() {
        q75 q75Var = (q75) this.receiver;
        yks0 yks0Var = q75Var.b;
        Owner s = yks0Var.e.s();
        UserId userId = s != null ? s.b : null;
        if (userId != null) {
            Context context = q75Var.a;
            dhr0.a.getClass();
            new ContextThemeWrapper(context, dhr0.u().c);
            VideoFile videoFile = yks0Var.e;
            g7s0 B = fxc0.B();
            videoFile.getClass();
            B.getClass();
            VideoFile videoFile2 = yks0Var.e;
            videoFile2.q6(videoFile2.m3() != null ? Boolean.valueOf(!r4.booleanValue()) : null);
            Iterator<T> it = yks0Var.f.iterator();
            while (it.hasNext()) {
                ((yks0.a) it.next()).He(EmptyList.b, yks0Var.e);
            }
            m3v m3vVar = m3v.c;
            long j = userId.b;
            m3vVar.getClass();
            m3v.e(j);
        }
        return s3q0.a;
    }
}
