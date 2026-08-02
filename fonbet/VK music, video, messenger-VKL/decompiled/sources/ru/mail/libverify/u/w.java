package ru.mail.libverify.u;

import android.content.Context;
import io.michaelrocks.libphonenumber.android.PhoneNumberUtil;
import java.io.File;
import java.util.Locale;
import java.util.Map;
import ru.mail.libverify.platform.storage.KeyValueStorage;
import ru.mail.libverify.storage.DecryptionError;

/* loaded from: classes9.dex */
public interface w {
    String A();

    String B();

    ru.mail.libverify.h0.a C();

    ru.mail.libverify.g0.q D();

    String E();

    void F();

    String G();

    ru.mail.libverify.z.c H();

    boolean I();

    String J();

    ru.mail.libverify.n.c K();

    void L();

    String M();

    void N();

    String a(String str, String str2) throws DecryptionError;

    void a();

    void a(Object obj);

    void a(Object obj, boolean z, int i);

    void a(String str, Boolean bool);

    void a(ru.mail.libverify.m.m mVar);

    void a(boolean z);

    boolean a(String str);

    boolean a(Map map);

    ru.mail.libverify.f0.a b();

    boolean b(String str);

    KeyValueStorage c();

    boolean c(String str);

    Locale d();

    boolean d(String str);

    int e();

    boolean f();

    void g();

    Context getContext();

    String getId();

    String h();

    int i();

    void j();

    String k();

    String l();

    String m();

    boolean n();

    void o();

    Map<String, String> p();

    PhoneNumberUtil q();

    String r();

    File s();

    boolean setApiEndpoints(Map<String, String> map);

    void setCustomLocale(Locale locale);

    void setSimDataSendDisabled(boolean z);

    String t();

    ru.mail.libverify.i0.b u();

    boolean v();

    w w();

    void x();

    ru.mail.libverify.api.k y();

    ru.mail.libverify.m.m z();
}
