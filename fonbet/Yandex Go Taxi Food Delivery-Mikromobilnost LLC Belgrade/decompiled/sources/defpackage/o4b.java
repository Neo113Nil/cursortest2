package defpackage;

import android.database.Cursor;
import java.io.Closeable;
import java.util.ArrayList;

/* loaded from: classes15.dex */
public final class o4b implements Closeable {
    public final /* synthetic */ int a;
    public final Cursor b;

    public /* synthetic */ o4b(Cursor cursor, int i) {
        this.a = i;
        this.b = cursor;
    }

    public String a() {
        Object valueOf;
        Cursor cursor = this.b;
        if (cursor.isNull(6)) {
            return null;
        }
        g0c a = qoi0.a(String.class);
        if (a.equals(qoi0.a(String.class))) {
            valueOf = cursor.getString(6);
        } else if (a.equals(qoi0.a(Long.TYPE))) {
            valueOf = Long.valueOf(cursor.getLong(6));
        } else if (a.equals(qoi0.a(Integer.TYPE))) {
            valueOf = Integer.valueOf(cursor.getInt(6));
        } else if (a.equals(qoi0.a(Short.TYPE))) {
            valueOf = Short.valueOf(cursor.getShort(6));
        } else if (a.equals(qoi0.a(Float.TYPE))) {
            valueOf = Float.valueOf(cursor.getFloat(6));
        } else if (a.equals(qoi0.a(Double.TYPE))) {
            valueOf = Double.valueOf(cursor.getDouble(6));
        } else if (a.equals(qoi0.a(byte[].class))) {
            valueOf = cursor.getBlob(6);
        } else {
            if (!a.equals(qoi0.a(Boolean.TYPE))) {
                qir.p(g8e.o("No mapping defined for class ", qoi0.a(String.class).c()));
                return null;
            }
            valueOf = Boolean.valueOf(cursor.getInt(6) != 0);
        }
        return (String) valueOf;
    }

    public String c() {
        Object valueOf;
        g0c a = qoi0.a(String.class);
        boolean equals = a.equals(qoi0.a(String.class));
        Cursor cursor = this.b;
        if (equals) {
            valueOf = cursor.getString(1);
        } else if (a.equals(qoi0.a(Long.TYPE))) {
            valueOf = Long.valueOf(cursor.getLong(1));
        } else if (a.equals(qoi0.a(Integer.TYPE))) {
            valueOf = Integer.valueOf(cursor.getInt(1));
        } else if (a.equals(qoi0.a(Short.TYPE))) {
            valueOf = Short.valueOf(cursor.getShort(1));
        } else if (a.equals(qoi0.a(Float.TYPE))) {
            valueOf = Float.valueOf(cursor.getFloat(1));
        } else if (a.equals(qoi0.a(Double.TYPE))) {
            valueOf = Double.valueOf(cursor.getDouble(1));
        } else if (a.equals(qoi0.a(byte[].class))) {
            valueOf = cursor.getBlob(1);
        } else {
            if (!a.equals(qoi0.a(Boolean.TYPE))) {
                qir.p(g8e.o("No mapping defined for class ", qoi0.a(String.class).c()));
                return null;
            }
            valueOf = Boolean.valueOf(cursor.getInt(1) != 0);
        }
        return (String) valueOf;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.a) {
            case 0:
                this.b.close();
                break;
            case 1:
                this.b.close();
                break;
            default:
                this.b.close();
                break;
        }
    }

    public String d() {
        Object valueOf;
        g0c a = qoi0.a(String.class);
        boolean equals = a.equals(qoi0.a(String.class));
        Cursor cursor = this.b;
        if (equals) {
            valueOf = cursor.getString(3);
        } else if (a.equals(qoi0.a(Long.TYPE))) {
            valueOf = Long.valueOf(cursor.getLong(3));
        } else if (a.equals(qoi0.a(Integer.TYPE))) {
            valueOf = Integer.valueOf(cursor.getInt(3));
        } else if (a.equals(qoi0.a(Short.TYPE))) {
            valueOf = Short.valueOf(cursor.getShort(3));
        } else if (a.equals(qoi0.a(Float.TYPE))) {
            valueOf = Float.valueOf(cursor.getFloat(3));
        } else if (a.equals(qoi0.a(Double.TYPE))) {
            valueOf = Double.valueOf(cursor.getDouble(3));
        } else if (a.equals(qoi0.a(byte[].class))) {
            valueOf = cursor.getBlob(3);
        } else {
            if (!a.equals(qoi0.a(Boolean.TYPE))) {
                qir.p(g8e.o("No mapping defined for class ", qoi0.a(String.class).c()));
                return null;
            }
            valueOf = Boolean.valueOf(cursor.getInt(3) != 0);
        }
        return (String) valueOf;
    }

    public long e() {
        Object valueOf;
        g0c a = qoi0.a(Long.class);
        boolean equals = a.equals(qoi0.a(String.class));
        Cursor cursor = this.b;
        if (equals) {
            valueOf = cursor.getString(7);
        } else if (a.equals(qoi0.a(Long.TYPE))) {
            valueOf = Long.valueOf(cursor.getLong(7));
        } else if (a.equals(qoi0.a(Integer.TYPE))) {
            valueOf = Integer.valueOf(cursor.getInt(7));
        } else if (a.equals(qoi0.a(Short.TYPE))) {
            valueOf = Short.valueOf(cursor.getShort(7));
        } else if (a.equals(qoi0.a(Float.TYPE))) {
            valueOf = Float.valueOf(cursor.getFloat(7));
        } else if (a.equals(qoi0.a(Double.TYPE))) {
            valueOf = Double.valueOf(cursor.getDouble(7));
        } else if (a.equals(qoi0.a(byte[].class))) {
            valueOf = cursor.getBlob(7);
        } else {
            if (!a.equals(qoi0.a(Boolean.TYPE))) {
                qir.p(g8e.o("No mapping defined for class ", qoi0.a(Long.class).c()));
                return 0L;
            }
            valueOf = Boolean.valueOf(cursor.getInt(7) != 0);
        }
        return ((Long) valueOf).longValue();
    }

    public long k() {
        Object valueOf;
        g0c a = qoi0.a(Long.class);
        boolean equals = a.equals(qoi0.a(String.class));
        Cursor cursor = this.b;
        if (equals) {
            valueOf = cursor.getString(0);
        } else if (a.equals(qoi0.a(Long.TYPE))) {
            valueOf = Long.valueOf(cursor.getLong(0));
        } else if (a.equals(qoi0.a(Integer.TYPE))) {
            valueOf = Integer.valueOf(cursor.getInt(0));
        } else if (a.equals(qoi0.a(Short.TYPE))) {
            valueOf = Short.valueOf(cursor.getShort(0));
        } else if (a.equals(qoi0.a(Float.TYPE))) {
            valueOf = Float.valueOf(cursor.getFloat(0));
        } else if (a.equals(qoi0.a(Double.TYPE))) {
            valueOf = Double.valueOf(cursor.getDouble(0));
        } else if (a.equals(qoi0.a(byte[].class))) {
            valueOf = cursor.getBlob(0);
        } else {
            if (!a.equals(qoi0.a(Boolean.TYPE))) {
                qir.p(g8e.o("No mapping defined for class ", qoi0.a(Long.class).c()));
                return 0L;
            }
            valueOf = Boolean.valueOf(cursor.getInt(0) != 0);
        }
        return ((Long) valueOf).longValue();
    }

    public boolean n() {
        Object valueOf;
        g0c a = qoi0.a(Boolean.class);
        boolean equals = a.equals(qoi0.a(String.class));
        Cursor cursor = this.b;
        if (equals) {
            valueOf = cursor.getString(5);
        } else if (a.equals(qoi0.a(Long.TYPE))) {
            valueOf = Long.valueOf(cursor.getLong(5));
        } else if (a.equals(qoi0.a(Integer.TYPE))) {
            valueOf = Integer.valueOf(cursor.getInt(5));
        } else if (a.equals(qoi0.a(Short.TYPE))) {
            valueOf = Short.valueOf(cursor.getShort(5));
        } else if (a.equals(qoi0.a(Float.TYPE))) {
            valueOf = Float.valueOf(cursor.getFloat(5));
        } else if (a.equals(qoi0.a(Double.TYPE))) {
            valueOf = Double.valueOf(cursor.getDouble(5));
        } else if (a.equals(qoi0.a(byte[].class))) {
            valueOf = cursor.getBlob(5);
        } else {
            if (!a.equals(qoi0.a(Boolean.TYPE))) {
                qir.p(g8e.o("No mapping defined for class ", qoi0.a(Boolean.class).c()));
                return false;
            }
            valueOf = Boolean.valueOf(cursor.getInt(5) != 0);
        }
        return ((Boolean) valueOf).booleanValue();
    }

    public int o() {
        Object valueOf;
        g0c a = qoi0.a(Integer.class);
        boolean equals = a.equals(qoi0.a(String.class));
        Cursor cursor = this.b;
        if (equals) {
            valueOf = cursor.getString(2);
        } else if (a.equals(qoi0.a(Long.TYPE))) {
            valueOf = Long.valueOf(cursor.getLong(2));
        } else if (a.equals(qoi0.a(Integer.TYPE))) {
            valueOf = Integer.valueOf(cursor.getInt(2));
        } else if (a.equals(qoi0.a(Short.TYPE))) {
            valueOf = Short.valueOf(cursor.getShort(2));
        } else if (a.equals(qoi0.a(Float.TYPE))) {
            valueOf = Float.valueOf(cursor.getFloat(2));
        } else if (a.equals(qoi0.a(Double.TYPE))) {
            valueOf = Double.valueOf(cursor.getDouble(2));
        } else if (a.equals(qoi0.a(byte[].class))) {
            valueOf = cursor.getBlob(2);
        } else {
            if (!a.equals(qoi0.a(Boolean.TYPE))) {
                qir.p(g8e.o("No mapping defined for class ", qoi0.a(Integer.class).c()));
                return 0;
            }
            valueOf = Boolean.valueOf(cursor.getInt(2) != 0);
        }
        return ((Integer) valueOf).intValue();
    }

    public boolean v() {
        Object valueOf;
        g0c a = qoi0.a(Boolean.class);
        boolean equals = a.equals(qoi0.a(String.class));
        Cursor cursor = this.b;
        if (equals) {
            valueOf = cursor.getString(4);
        } else if (a.equals(qoi0.a(Long.TYPE))) {
            valueOf = Long.valueOf(cursor.getLong(4));
        } else if (a.equals(qoi0.a(Integer.TYPE))) {
            valueOf = Integer.valueOf(cursor.getInt(4));
        } else if (a.equals(qoi0.a(Short.TYPE))) {
            valueOf = Short.valueOf(cursor.getShort(4));
        } else if (a.equals(qoi0.a(Float.TYPE))) {
            valueOf = Float.valueOf(cursor.getFloat(4));
        } else if (a.equals(qoi0.a(Double.TYPE))) {
            valueOf = Double.valueOf(cursor.getDouble(4));
        } else if (a.equals(qoi0.a(byte[].class))) {
            valueOf = cursor.getBlob(4);
        } else {
            if (!a.equals(qoi0.a(Boolean.TYPE))) {
                qir.p(g8e.o("No mapping defined for class ", qoi0.a(Boolean.class).c()));
                return false;
            }
            valueOf = Boolean.valueOf(cursor.getInt(4) != 0);
        }
        return ((Boolean) valueOf).booleanValue();
    }

    public ArrayList w() {
        Cursor cursor = this.b;
        Cursor cursor2 = cursor;
        try {
            Cursor cursor3 = cursor2;
            ArrayList arrayList = new ArrayList(cursor.getCount());
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                long k = k();
                arrayList.add(new p4b(c(), k, d(), o(), v(), n(), a(), e()));
                cursor.moveToNext();
            }
            ooc.g(cursor2, null);
            return arrayList;
        } finally {
        }
    }
}
