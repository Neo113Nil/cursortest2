package xsna;

import com.vk.instantjobs.InstantJob;
import com.vk.instantjobs.exceptions.JobCauseException;

/* compiled from: InstantJobManager.kt */
/* loaded from: classes.dex */
public interface x6x {
    void a(InstantJob instantJob);

    void b(String str, izs<? super InstantJob, Boolean> izsVar);

    void c(izs<? super InstantJob, Boolean> izsVar);

    void d(u4w u4wVar);

    void e(String str, Throwable th, izs<? super InstantJob, Boolean> izsVar);

    void f(Object obj);

    <T extends InstantJob> void g(Class<T> cls, s7x<T> s7xVar);

    JobCauseException h(String str, Throwable th);

    void i(String str, izs<? super InstantJob, Boolean> izsVar);

    void j(u4w u4wVar, Throwable th);

    void k(String str, izs<? super InstantJob, Boolean> izsVar);

    void l(izs<? super InstantJob, Boolean> izsVar);

    void m(String str);
}
