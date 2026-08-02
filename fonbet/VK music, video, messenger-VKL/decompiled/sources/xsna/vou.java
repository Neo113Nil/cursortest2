package xsna;

import android.content.ComponentCallbacks2;
import android.content.Context;
import androidx.annotation.NonNull;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Attachment;
import com.vk.dto.group.Group;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.dto.reactions.ReactionMeta;
import com.vk.dto.reactions.ReactionSet;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: Groups.java */
/* loaded from: classes5.dex */
public final class vou implements hx2, x64, ws01 {
    public Object b;

    public /* synthetic */ vou(Object obj) {
        this.b = obj;
    }

    @Override // xsna.x64
    public void a(Attachment attachment) {
        z84 z84Var = ((b94) this.b).t;
        if (z84Var != null) {
            z84Var.u0(attachment);
        }
    }

    @Override // xsna.hx2
    public void b(Object obj) {
        Group group = (Group) obj;
        uou uouVar = (uou) this.b;
        uouVar.f.getClass();
        epu.d(group);
        uouVar.d(group);
    }

    @Override // xsna.x64
    public void c(Attachment attachment) {
        z84 z84Var = ((b94) this.b).t;
        if (z84Var == null || attachment == null) {
            return;
        }
        z84Var.D0(attachment);
    }

    @Override // xsna.x64
    public void d(int i, int i2) {
        z84 z84Var = ((b94) this.b).t;
        if (z84Var != null) {
            z84Var.b.Uf();
        }
    }

    @Override // xsna.hx2
    public void e(@NonNull VKApiExecutionException vKApiExecutionException) {
        com.vk.metrics.eventtracking.b.a.a(vKApiExecutionException);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.x64
    public void f(Attachment attachment) {
        b94 b94Var = (b94) this.b;
        if (attachment == 0) {
            return;
        }
        b94Var.getClass();
        if (attachment instanceof ju90) {
            ju90<?> ju90Var = (ju90) attachment;
            ju90Var.O3(com.vk.upload.impl.a.d.getAndIncrement());
            b94Var.l(ju90Var);
        }
    }

    public ckm g(Context context, gzs gzsVar, gzs gzsVar2) {
        ww50<?> Y;
        if (((Integer) this.b) == null) {
            ComponentCallbacks2 h = e3m.h(context);
            ey50 ey50Var = h instanceof ey50 ? (ey50) h : null;
            if (ey50Var != null && (Y = ey50Var.Y()) != null) {
                this.b = Integer.valueOf(Y.y());
            }
        }
        Integer num = (Integer) this.b;
        return new ckm(num != null ? num.intValue() : 0, context, gzsVar, gzsVar2);
    }

    public l6z h(c6z c6zVar) {
        ReactionSet s4;
        ReactionMeta reactionMeta = null;
        o2f0 o2f0Var = c6zVar instanceof o2f0 ? (o2f0) c6zVar : null;
        if (o2f0Var != null && (s4 = o2f0Var.s4()) != null) {
            reactionMeta = c2f0.d(s4, 0);
        }
        ReactionMeta reactionMeta2 = reactionMeta;
        boolean z = !c6zVar.J();
        String str = (String) this.b;
        String r = c6zVar.r();
        if (c6zVar instanceof bss0) {
            Serializer.c<Videos> cVar = Videos.CREATOR;
            c6zVar = Videos.a.a(((bss0) c6zVar).t());
        }
        return new l6z(c6zVar, z, reactionMeta2, str, r, null);
    }

    public void i(Exception exc) {
        e5o0 e5o0Var = (e5o0) this.b;
        synchronized (e5o0Var.a) {
            try {
                if (e5o0Var.b) {
                    throw new IllegalStateException("Cannot set the error on a completed task.");
                }
                e5o0Var.b = true;
                e5o0Var.e = exc;
                e5o0Var.a.notifyAll();
                e5o0Var.f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.ws01
    public void zza() {
        XmlPullParser xmlPullParser;
        ytz0 ytz0Var = (ytz0) this.b;
        int i = 0;
        String str = null;
        String str2 = null;
        while (true) {
            xmlPullParser = ytz0Var.a;
            if (i >= xmlPullParser.getAttributeCount()) {
                break;
            }
            if ("module".equals(xmlPullParser.getAttributeName(i))) {
                str = xmlPullParser.getAttributeValue(i);
            }
            if ("errorCode".equals(xmlPullParser.getAttributeName(i))) {
                str2 = xmlPullParser.getAttributeValue(i);
            }
            i++;
        }
        if (str == null || str2 == null) {
            throw new XmlPullParserException("'split-install-error' element does not contain 'module'/'errorCode' attributes.", xmlPullParser, null);
        }
        ktz0 ktz0Var = ytz0Var.b;
        Integer num = (Integer) jtz0.c.get(str2);
        if (num == null) {
            throw new IllegalArgumentException(str2.concat(" is unknown error."));
        }
        Map map = ktz0Var.d;
        if (map == null) {
            throw new IllegalStateException("Property \"splitInstallErrorCodeByModule\" has not been set");
        }
        map.put(str, num);
        while (xmlPullParser.next() != 3) {
        }
    }

    public vou() {
        this.b = new e5o0();
    }
}
