package xsna;

import com.vk.knet.cornet.CronetHttpLogger$DebugType;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.EmptyList;
import org.chromium.net.UrlRequest;
import ru.ok.tracer.base.ucum.UcumUtils;

/* compiled from: CronetClient.kt */
/* loaded from: classes2.dex */
public final class aek {
    public Object a;
    public final Object b;
    public final Object c;

    public /* synthetic */ aek(Object obj, Comparable comparable, Object obj2) {
        this.a = obj;
        this.b = comparable;
        this.c = obj2;
    }

    public void a(Throwable th) {
        k7g0 k7g0Var = (k7g0) this.a;
        ReentrantLock reentrantLock = k7g0Var.h;
        reentrantLock.lock();
        try {
            k7g0Var.g.set(th);
            UrlRequest urlRequest = k7g0Var.e;
            if (urlRequest != null) {
                urlRequest.cancel();
            }
            s3q0 s3q0Var = s3q0.a;
            reentrantLock.unlock();
            throw th;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public ByteBuffer b() {
        k7g0 k7g0Var = (k7g0) this.a;
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        long j = ((ydk) this.c).a.e;
        if (!k7g0Var.k.a(j)) {
            CronetHttpLogger$DebugType cronetHttpLogger$DebugType = CronetHttpLogger$DebugType.CLIENT_TIMEOUTS;
            Object[] objArr = {"[cronet] Await chunk is canceled by timeout."};
            qek qekVar = vek.a;
            if (qekVar != null) {
                qekVar.a(cronetHttpLogger$DebugType, Arrays.copyOf(objArr, 1));
            }
            throw new SocketTimeoutException(qlb0.a(j, "Failed to get response in ", "ms."));
        }
        k7g0Var.d();
        k7g0Var.l.b(false);
        byteBuffer.clear();
        UrlRequest urlRequest = k7g0Var.e;
        if (urlRequest == null) {
            throw new IllegalStateException("You have to create connection and await for response, before read it!");
        }
        urlRequest.read(byteBuffer);
        if (!k7g0Var.l.a(j)) {
            throw new SocketTimeoutException(qlb0.a(j, "Unable to read response's body in ", UcumUtils.UCUM_MILLISECODS));
        }
        k7g0Var.d();
        ReentrantLock reentrantLock = k7g0Var.h;
        reentrantLock.lock();
        try {
            k7g0Var.d();
            k7g0Var.c();
            if (k7g0Var.d < 4) {
                return byteBuffer;
            }
            reentrantLock.unlock();
            return null;
        } finally {
            reentrantLock.unlock();
        }
    }

    public aek() {
        EmptyList emptyList = EmptyList.b;
        this.a = emptyList;
        io.reactivex.rxjava3.subjects.d O0 = io.reactivex.rxjava3.subjects.d.O0(emptyList);
        this.b = O0;
        this.c = O0;
    }
}
