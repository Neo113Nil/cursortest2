package defpackage;

import com.monetization.ads.network.core.Header;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes7.dex */
public final class cc81 {
    public long a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final List h;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public cc81(String str, et81 et81Var) {
        this(str, r2, r3, r5, r7, r9, r0);
        String str2 = et81Var.b;
        long j = et81Var.c;
        long j2 = et81Var.d;
        long j3 = et81Var.e;
        long j4 = et81Var.f;
        List list = et81Var.h;
        if (list == 0) {
            Map map = et81Var.g;
            list = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                list.add(new Header((String) entry.getKey(), (String) entry.getValue()));
            }
        }
    }

    public static cc81 a(o77 o77Var) {
        if (oi81.b(o77Var) != 538247942) {
            throw new IOException();
        }
        String str = new String(oi81.e(o77Var, oi81.f(o77Var)), "UTF-8");
        String str2 = new String(oi81.e(o77Var, oi81.f(o77Var)), "UTF-8");
        long f = oi81.f(o77Var);
        long f2 = oi81.f(o77Var);
        long f3 = oi81.f(o77Var);
        long f4 = oi81.f(o77Var);
        int b = oi81.b(o77Var);
        if (b < 0) {
            ny61.v(q8a1.c(b, "readHeaderList size="));
            return null;
        }
        List arrayList = b == 0 ? Collections.EMPTY_LIST : new ArrayList();
        int i = 0;
        while (i < b) {
            arrayList.add(new Header(new String(oi81.e(o77Var, oi81.f(o77Var)), "UTF-8").intern(), new String(oi81.e(o77Var, oi81.f(o77Var)), "UTF-8").intern()));
            i++;
            str = str;
            str2 = str2;
            f = f;
        }
        return new cc81(str, str2, f, f2, f3, f4, arrayList);
    }

    public final et81 b(byte[] bArr) {
        et81 et81Var = new et81();
        et81Var.a = bArr;
        et81Var.b = this.c;
        et81Var.c = this.d;
        et81Var.d = this.e;
        et81Var.e = this.f;
        et81Var.f = this.g;
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        List<Header> list = this.h;
        for (Header header : list) {
            treeMap.put(header.getName(), header.getValue());
        }
        et81Var.g = treeMap;
        et81Var.h = Collections.unmodifiableList(list);
        return et81Var;
    }

    public final boolean c(BufferedOutputStream bufferedOutputStream) {
        try {
            oi81.c(bufferedOutputStream, 538247942);
            byte[] bytes = this.b.getBytes("UTF-8");
            oi81.d(bufferedOutputStream, bytes.length);
            bufferedOutputStream.write(bytes, 0, bytes.length);
            String str = this.c;
            if (str == null) {
                str = "";
            }
            byte[] bytes2 = str.getBytes("UTF-8");
            oi81.d(bufferedOutputStream, bytes2.length);
            bufferedOutputStream.write(bytes2, 0, bytes2.length);
            oi81.d(bufferedOutputStream, this.d);
            oi81.d(bufferedOutputStream, this.e);
            oi81.d(bufferedOutputStream, this.f);
            oi81.d(bufferedOutputStream, this.g);
            List<Header> list = this.h;
            if (list != null) {
                oi81.c(bufferedOutputStream, list.size());
                for (Header header : list) {
                    byte[] bytes3 = header.getName().getBytes("UTF-8");
                    oi81.d(bufferedOutputStream, bytes3.length);
                    bufferedOutputStream.write(bytes3, 0, bytes3.length);
                    byte[] bytes4 = header.getValue().getBytes("UTF-8");
                    oi81.d(bufferedOutputStream, bytes4.length);
                    bufferedOutputStream.write(bytes4, 0, bytes4.length);
                }
            } else {
                oi81.c(bufferedOutputStream, 0);
            }
            bufferedOutputStream.flush();
            return true;
        } catch (IOException unused) {
            boolean z = ew71.a;
            return false;
        }
    }

    public cc81(String str, String str2, long j, long j2, long j3, long j4, List list) {
        this.b = str;
        this.c = "".equals(str2) ? null : str2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = list;
    }
}
