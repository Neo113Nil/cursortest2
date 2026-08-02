package xsna;

import java.io.BufferedReader;
import java.io.Reader;
import java.io.StringWriter;
import java.util.Iterator;

/* compiled from: CastHelper.kt */
/* loaded from: classes.dex */
public class a0a {
    public static boolean b = false;
    public static volatile String d = "vk.com";
    public static final a0a a = new a0a();
    public static final a0a c = new a0a();

    public static final void a(Reader reader, izs izsVar) {
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, 8192);
        try {
            Iterator it = new t5j(new p8z(bufferedReader)).iterator();
            while (it.hasNext()) {
                izsVar.invoke(it.next());
            }
            s3q0 s3q0Var = s3q0.a;
            bufferedReader.close();
        } finally {
        }
    }

    public static final String b(Reader reader) {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int read = reader.read(cArr);
        while (read >= 0) {
            stringWriter.write(cArr, 0, read);
            read = reader.read(cArr);
        }
        return stringWriter.toString();
    }
}
