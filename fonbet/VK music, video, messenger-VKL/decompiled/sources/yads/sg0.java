package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes10.dex */
public final class sg0 {
    public long a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final List h;

    public sg0(String str, String str2, long j, long j2, long j3, long j4, List list) {
        this.b = str;
        this.c = "".equals(str2) ? null : str2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = list;
    }

    public static List a(lr lrVar) {
        List list = lrVar.h;
        if (list != null) {
            return list;
        }
        Map map = lrVar.g;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new r01((String) entry.getKey(), (String) entry.getValue()));
        }
        return arrayList;
    }

    public static sg0 a(tg0 tg0Var) {
        if (ug0.a(tg0Var) == 538247942) {
            String str = new String(ug0.a(tg0Var, ug0.b(tg0Var)), C.UTF8_NAME);
            String str2 = new String(ug0.a(tg0Var, ug0.b(tg0Var)), C.UTF8_NAME);
            long b = ug0.b(tg0Var);
            long b2 = ug0.b(tg0Var);
            long b3 = ug0.b(tg0Var);
            long b4 = ug0.b(tg0Var);
            int a = ug0.a(tg0Var);
            if (a >= 0) {
                List arrayList = a == 0 ? Collections.EMPTY_LIST : new ArrayList();
                int i = 0;
                while (i < a) {
                    arrayList.add(new r01(new String(ug0.a(tg0Var, ug0.b(tg0Var)), C.UTF8_NAME).intern(), new String(ug0.a(tg0Var, ug0.b(tg0Var)), C.UTF8_NAME).intern()));
                    i++;
                    str = str;
                    str2 = str2;
                    b = b;
                }
                return new sg0(str, str2, b, b2, b3, b4, arrayList);
            }
            throw new IOException(nh2.a("readHeaderList size=", a));
        }
        throw new IOException();
    }

    public final lr a(byte[] bArr) {
        lr lrVar = new lr();
        lrVar.a = bArr;
        lrVar.b = this.c;
        lrVar.c = this.d;
        lrVar.d = this.e;
        lrVar.e = this.f;
        lrVar.f = this.g;
        List<r01> list = this.h;
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (r01 r01Var : list) {
            treeMap.put(r01Var.a, r01Var.b);
        }
        lrVar.g = treeMap;
        lrVar.h = Collections.unmodifiableList(this.h);
        return lrVar;
    }

    public final boolean a(BufferedOutputStream bufferedOutputStream) {
        try {
            ug0.a(bufferedOutputStream, 538247942);
            byte[] bytes = this.b.getBytes(C.UTF8_NAME);
            ug0.a(bufferedOutputStream, bytes.length);
            bufferedOutputStream.write(bytes, 0, bytes.length);
            String str = this.c;
            if (str == null) {
                str = "";
            }
            byte[] bytes2 = str.getBytes(C.UTF8_NAME);
            ug0.a(bufferedOutputStream, bytes2.length);
            bufferedOutputStream.write(bytes2, 0, bytes2.length);
            ug0.a(bufferedOutputStream, this.d);
            ug0.a(bufferedOutputStream, this.e);
            ug0.a(bufferedOutputStream, this.f);
            ug0.a(bufferedOutputStream, this.g);
            List<r01> list = this.h;
            if (list != null) {
                ug0.a(bufferedOutputStream, list.size());
                for (r01 r01Var : list) {
                    byte[] bytes3 = r01Var.a.getBytes(C.UTF8_NAME);
                    ug0.a(bufferedOutputStream, bytes3.length);
                    bufferedOutputStream.write(bytes3, 0, bytes3.length);
                    byte[] bytes4 = r01Var.b.getBytes(C.UTF8_NAME);
                    ug0.a(bufferedOutputStream, bytes4.length);
                    bufferedOutputStream.write(bytes4, 0, bytes4.length);
                }
            } else {
                ug0.a(bufferedOutputStream, 0);
            }
            bufferedOutputStream.flush();
            return true;
        } catch (IOException unused) {
            boolean z = pn3.a;
            return false;
        }
    }
}
