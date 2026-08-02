package xsna;

import android.content.Context;
import com.vk.core.preference.Preference;
import java.io.File;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$IntRef;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class rcp implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rcp(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                Ref$FloatRef ref$FloatRef = (Ref$FloatRef) this.c;
                Ref$IntRef ref$IntRef = (Ref$IntRef) this.d;
                StringBuilder sb = new StringBuilder("emojiSpriteActualWidth=");
                sb.append(ref$FloatRef.element);
                sb.append(" emojiSizeInSprite=");
                sb.append(ucp.k);
                sb.append(" emojiSizeInSpriteIfDownloaded=");
                sb.append(ucp.j);
                sb.append(" emojiSizeInSpriteDefault=");
                sb.append(ref$IntRef.element);
                sb.append(" wereSpritesInitiallyDownloaded=");
                sb.append(ucp.o);
                sb.append(" downloadedEmojiSpritesFiles=");
                File[] fileArr = ucp.m;
                sb.append(fileArr != null ? Integer.valueOf(fileArr.length) : "empty");
                return sb.toString();
            default:
                Context context = (Context) this.c;
                im20 im20Var = (im20) this.d;
                ReentrantLock reentrantLock = Preference.n;
                ReentrantReadWriteLock reentrantReadWriteLock = Preference.o;
                return new lvj0(reentrantLock, reentrantReadWriteLock.writeLock(), reentrantReadWriteLock.writeLock(), context, im20Var.a);
        }
    }
}
