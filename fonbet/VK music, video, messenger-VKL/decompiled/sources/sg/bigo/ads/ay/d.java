package sg.bigo.ads.ay;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import sg.bigo.ads.bo.g;
import sg.bigo.ads.bo.h;
import sg.bigo.ads.bp.e;
import xsna.bd3;

/* loaded from: classes9.dex */
public abstract class d {
    public String a = "";
    public boolean b = false;
    protected int c = 0;
    protected boolean d = false;

    public abstract String a();

    public abstract String a(Context context);

    public void a(Context context, String str, String str2) {
        File file = new File(a(context));
        if (file.exists() || file.mkdir()) {
            try {
                FileWriter fileWriter = new FileWriter(new File(file, b()));
                fileWriter.write(str);
                fileWriter.flush();
                fileWriter.close();
                a();
                a(str2);
            } catch (Exception e) {
                sg.bigo.ads.bn.a.a(0, a(), "write JS file error: " + e.getMessage());
            }
        }
    }

    public abstract void a(String str);

    public abstract boolean a(String str, String str2);

    public abstract String b();

    public final void b(Context context) {
        if (a(d(), e())) {
            a();
            d();
            a(d(), context);
        }
    }

    public abstract boolean b(String str);

    public abstract String c();

    public final void c(Context context) {
        String c;
        if (this.b) {
            return;
        }
        if (this.c >= 2) {
            sg.bigo.ads.bn.a.a(0, 5, a(), "the retry times has reached the limit");
            if (this.d) {
                return;
            }
            this.d = true;
            if (TextUtils.isEmpty(d())) {
                return;
            }
            a();
            d();
            c = d();
        } else {
            a();
            this.c++;
            c = c();
        }
        a(c, context);
    }

    public abstract String d();

    /* JADX WARN: Removed duplicated region for block: B:45:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String d(Context context) {
        BufferedReader bufferedReader;
        Throwable th;
        FileInputStream fileInputStream;
        File file = new File(a(context) + File.separator + b());
        if (!file.exists()) {
            return null;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
                try {
                    try {
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            sb.append(readLine);
                        }
                        String sb2 = sb.toString();
                        try {
                            bufferedReader.close();
                        } catch (Exception unused) {
                        }
                        try {
                            fileInputStream.close();
                        } catch (Exception unused2) {
                        }
                        return sb2;
                    } catch (Exception e) {
                        e = e;
                        sg.bigo.ads.bn.a.a(0, a(), "get JS from file error: " + e.getMessage());
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (Exception unused3) {
                            }
                        }
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (Exception unused4) {
                            }
                        }
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Exception unused5) {
                        }
                    }
                    if (fileInputStream != null) {
                        throw th;
                    }
                    try {
                        fileInputStream.close();
                        throw th;
                    } catch (Exception unused6) {
                        throw th;
                    }
                }
            } catch (Exception e2) {
                e = e2;
                bufferedReader = null;
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
                if (bufferedReader != null) {
                }
                if (fileInputStream != null) {
                }
            }
        } catch (Exception e3) {
            e = e3;
            fileInputStream = null;
            bufferedReader = null;
        } catch (Throwable th4) {
            bufferedReader = null;
            th = th4;
            fileInputStream = null;
        }
    }

    public abstract String e();

    public final boolean e(Context context) {
        return bd3.d(a(context) + File.separator + b());
    }

    private void a(final String str, final Context context) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        sg.bigo.ads.bs.a aVar = new sg.bigo.ads.bs.a(sg.bigo.ads.bx.a.a(), new sg.bigo.ads.bs.d(str), context);
        aVar.l = e.h();
        g.a(aVar, new sg.bigo.ads.bo.b<sg.bigo.ads.bs.a, sg.bigo.ads.bt.d>() { // from class: sg.bigo.ads.ay.d.1
            @Override // sg.bigo.ads.bo.b
            public final /* synthetic */ sg.bigo.ads.bt.d a(@NonNull sg.bigo.ads.bt.a aVar2) {
                return new sg.bigo.ads.bt.d(aVar2);
            }

            @Override // sg.bigo.ads.bo.b
            public final /* synthetic */ void a(@NonNull sg.bigo.ads.bs.a aVar2, @NonNull h hVar) {
                sg.bigo.ads.bn.a.a(0, 5, d.this.a(), "fetch js from network fail: " + hVar.getMessage());
                d.this.c(context);
            }

            @Override // sg.bigo.ads.bo.b
            public final /* synthetic */ void a(@NonNull sg.bigo.ads.bs.a aVar2, @NonNull sg.bigo.ads.bt.d dVar) {
                String a = dVar.a();
                if (TextUtils.isEmpty(a) || !d.this.b(a)) {
                    d.this.c(context);
                    return;
                }
                d dVar2 = d.this;
                dVar2.a = a;
                dVar2.b = true;
                dVar2.a();
                sg.bigo.ads.bh.d.a(0, new Runnable() { // from class: sg.bigo.ads.ay.d.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        d dVar3 = d.this;
                        dVar3.a(context, dVar3.a, str);
                    }
                });
            }
        });
    }
}
