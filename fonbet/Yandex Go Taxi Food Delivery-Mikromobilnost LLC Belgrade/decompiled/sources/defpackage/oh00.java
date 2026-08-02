package defpackage;

import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.WireFormat$FieldType;
import androidx.datastore.preferences.protobuf.i;

/* loaded from: classes.dex */
public final class oh00 {
    public final am2 a;

    public oh00(WireFormat$FieldType wireFormat$FieldType, WireFormat$FieldType wireFormat$FieldType2, ane0 ane0Var) {
        this.a = new am2(wireFormat$FieldType, wireFormat$FieldType2, ane0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(am2 am2Var, Object obj, Object obj2) {
        int f;
        int c;
        int e;
        WireFormat$FieldType wireFormat$FieldType;
        int c2;
        int e2;
        WireFormat$FieldType wireFormat$FieldType2 = (WireFormat$FieldType) am2Var.a;
        zxq zxqVar = zxq.c;
        int i = 1;
        int d = i.d(1);
        WireFormat$FieldType wireFormat$FieldType3 = WireFormat$FieldType.GROUP;
        if (wireFormat$FieldType2 == wireFormat$FieldType3) {
            d *= 2;
        }
        int[] iArr = wxq.b;
        switch (iArr[wireFormat$FieldType2.ordinal()]) {
            case 1:
                ((Double) obj).getClass();
                f = 8;
                int i2 = f + d;
                wireFormat$FieldType = (WireFormat$FieldType) am2Var.b;
                int d2 = i.d(2);
                if (wireFormat$FieldType == wireFormat$FieldType3) {
                    d2 *= 2;
                }
                switch (iArr[wireFormat$FieldType.ordinal()]) {
                    case 1:
                        ((Double) obj2).getClass();
                        i = 8;
                        break;
                    case 2:
                        ((Float) obj2).getClass();
                        i = 4;
                        break;
                    case 3:
                        i = i.f(((Long) obj2).longValue());
                        break;
                    case 4:
                        i = i.f(((Long) obj2).longValue());
                        break;
                    case 5:
                        i = i.f(((Integer) obj2).intValue());
                        break;
                    case 6:
                        ((Long) obj2).getClass();
                        i = 8;
                        break;
                    case 7:
                        ((Integer) obj2).getClass();
                        i = 4;
                        break;
                    case 8:
                        ((Boolean) obj2).getClass();
                        break;
                    case 9:
                        i = ((GeneratedMessageLite) ((xt10) obj2)).c(null);
                        break;
                    case 10:
                        c2 = ((GeneratedMessageLite) ((xt10) obj2)).c(null);
                        e2 = i.e(c2);
                        i = e2 + c2;
                        break;
                    case 11:
                        if (obj2 instanceof ByteString) {
                            c2 = ((ByteString) obj2).size();
                            e2 = i.e(c2);
                            i = e2 + c2;
                            break;
                        } else {
                            i = i.c((String) obj2);
                        }
                    case 12:
                        if (obj2 instanceof ByteString) {
                            c2 = ((ByteString) obj2).size();
                            e2 = i.e(c2);
                        } else {
                            c2 = ((byte[]) obj2).length;
                            e2 = i.e(c2);
                        }
                        i = e2 + c2;
                        break;
                    case 13:
                        i = i.e(((Integer) obj2).intValue());
                        break;
                    case 14:
                        ((Integer) obj2).getClass();
                        i = 4;
                        break;
                    case 15:
                        ((Long) obj2).getClass();
                        i = 8;
                        break;
                    case 16:
                        int intValue = ((Integer) obj2).intValue();
                        i = i.e((intValue >> 31) ^ (intValue << 1));
                        break;
                    case 17:
                        long longValue = ((Long) obj2).longValue();
                        i = i.f((longValue >> 63) ^ (longValue << 1));
                        break;
                    case 18:
                        i = i.f(((Integer) obj2).intValue());
                        break;
                    default:
                        kbs.g("There is no way to get here, but the compiler thinks otherwise.");
                        break;
                }
            case 2:
                ((Float) obj).getClass();
                f = 4;
                int i22 = f + d;
                wireFormat$FieldType = (WireFormat$FieldType) am2Var.b;
                int d22 = i.d(2);
                if (wireFormat$FieldType == wireFormat$FieldType3) {
                }
                switch (iArr[wireFormat$FieldType.ordinal()]) {
                }
            case 3:
                f = i.f(((Long) obj).longValue());
                int i222 = f + d;
                wireFormat$FieldType = (WireFormat$FieldType) am2Var.b;
                int d222 = i.d(2);
                if (wireFormat$FieldType == wireFormat$FieldType3) {
                }
                switch (iArr[wireFormat$FieldType.ordinal()]) {
                }
            case 4:
                f = i.f(((Long) obj).longValue());
                int i2222 = f + d;
                wireFormat$FieldType = (WireFormat$FieldType) am2Var.b;
                int d2222 = i.d(2);
                if (wireFormat$FieldType == wireFormat$FieldType3) {
                }
                switch (iArr[wireFormat$FieldType.ordinal()]) {
                }
            case 5:
                f = i.f(((Integer) obj).intValue());
                int i22222 = f + d;
                wireFormat$FieldType = (WireFormat$FieldType) am2Var.b;
                int d22222 = i.d(2);
                if (wireFormat$FieldType == wireFormat$FieldType3) {
                }
                switch (iArr[wireFormat$FieldType.ordinal()]) {
                }
            case 6:
                ((Long) obj).getClass();
                f = 8;
                int i222222 = f + d;
                wireFormat$FieldType = (WireFormat$FieldType) am2Var.b;
                int d222222 = i.d(2);
                if (wireFormat$FieldType == wireFormat$FieldType3) {
                }
                switch (iArr[wireFormat$FieldType.ordinal()]) {
                }
            case 7:
                ((Integer) obj).getClass();
                f = 4;
                int i2222222 = f + d;
                wireFormat$FieldType = (WireFormat$FieldType) am2Var.b;
                int d2222222 = i.d(2);
                if (wireFormat$FieldType == wireFormat$FieldType3) {
                }
                switch (iArr[wireFormat$FieldType.ordinal()]) {
                }
            case 8:
                ((Boolean) obj).getClass();
                f = 1;
                int i22222222 = f + d;
                wireFormat$FieldType = (WireFormat$FieldType) am2Var.b;
                int d22222222 = i.d(2);
                if (wireFormat$FieldType == wireFormat$FieldType3) {
                }
                switch (iArr[wireFormat$FieldType.ordinal()]) {
                }
            case 9:
                f = ((GeneratedMessageLite) ((xt10) obj)).c(null);
                int i222222222 = f + d;
                wireFormat$FieldType = (WireFormat$FieldType) am2Var.b;
                int d222222222 = i.d(2);
                if (wireFormat$FieldType == wireFormat$FieldType3) {
                }
                switch (iArr[wireFormat$FieldType.ordinal()]) {
                }
            case 10:
                c = ((GeneratedMessageLite) ((xt10) obj)).c(null);
                e = i.e(c);
                f = c + e;
                int i2222222222 = f + d;
                wireFormat$FieldType = (WireFormat$FieldType) am2Var.b;
                int d2222222222 = i.d(2);
                if (wireFormat$FieldType == wireFormat$FieldType3) {
                }
                switch (iArr[wireFormat$FieldType.ordinal()]) {
                }
            case 11:
                if (obj instanceof ByteString) {
                    c = ((ByteString) obj).size();
                    e = i.e(c);
                    f = c + e;
                    int i22222222222 = f + d;
                    wireFormat$FieldType = (WireFormat$FieldType) am2Var.b;
                    int d22222222222 = i.d(2);
                    if (wireFormat$FieldType == wireFormat$FieldType3) {
                    }
                    switch (iArr[wireFormat$FieldType.ordinal()]) {
                    }
                } else {
                    f = i.c((String) obj);
                    int i222222222222 = f + d;
                    wireFormat$FieldType = (WireFormat$FieldType) am2Var.b;
                    int d222222222222 = i.d(2);
                    if (wireFormat$FieldType == wireFormat$FieldType3) {
                    }
                    switch (iArr[wireFormat$FieldType.ordinal()]) {
                    }
                }
            case 12:
                if (obj instanceof ByteString) {
                    c = ((ByteString) obj).size();
                    e = i.e(c);
                } else {
                    c = ((byte[]) obj).length;
                    e = i.e(c);
                }
                f = c + e;
                int i2222222222222 = f + d;
                wireFormat$FieldType = (WireFormat$FieldType) am2Var.b;
                int d2222222222222 = i.d(2);
                if (wireFormat$FieldType == wireFormat$FieldType3) {
                }
                switch (iArr[wireFormat$FieldType.ordinal()]) {
                }
            case 13:
                f = i.e(((Integer) obj).intValue());
                int i22222222222222 = f + d;
                wireFormat$FieldType = (WireFormat$FieldType) am2Var.b;
                int d22222222222222 = i.d(2);
                if (wireFormat$FieldType == wireFormat$FieldType3) {
                }
                switch (iArr[wireFormat$FieldType.ordinal()]) {
                }
            case 14:
                ((Integer) obj).getClass();
                f = 4;
                int i222222222222222 = f + d;
                wireFormat$FieldType = (WireFormat$FieldType) am2Var.b;
                int d222222222222222 = i.d(2);
                if (wireFormat$FieldType == wireFormat$FieldType3) {
                }
                switch (iArr[wireFormat$FieldType.ordinal()]) {
                }
            case 15:
                ((Long) obj).getClass();
                f = 8;
                int i2222222222222222 = f + d;
                wireFormat$FieldType = (WireFormat$FieldType) am2Var.b;
                int d2222222222222222 = i.d(2);
                if (wireFormat$FieldType == wireFormat$FieldType3) {
                }
                switch (iArr[wireFormat$FieldType.ordinal()]) {
                }
            case 16:
                int intValue2 = ((Integer) obj).intValue();
                f = i.e((intValue2 >> 31) ^ (intValue2 << 1));
                int i22222222222222222 = f + d;
                wireFormat$FieldType = (WireFormat$FieldType) am2Var.b;
                int d22222222222222222 = i.d(2);
                if (wireFormat$FieldType == wireFormat$FieldType3) {
                }
                switch (iArr[wireFormat$FieldType.ordinal()]) {
                }
            case 17:
                long longValue2 = ((Long) obj).longValue();
                f = i.f((longValue2 << 1) ^ (longValue2 >> 63));
                int i222222222222222222 = f + d;
                wireFormat$FieldType = (WireFormat$FieldType) am2Var.b;
                int d222222222222222222 = i.d(2);
                if (wireFormat$FieldType == wireFormat$FieldType3) {
                }
                switch (iArr[wireFormat$FieldType.ordinal()]) {
                }
            case 18:
                f = i.f(((Integer) obj).intValue());
                int i2222222222222222222 = f + d;
                wireFormat$FieldType = (WireFormat$FieldType) am2Var.b;
                int d2222222222222222222 = i.d(2);
                if (wireFormat$FieldType == wireFormat$FieldType3) {
                }
                switch (iArr[wireFormat$FieldType.ordinal()]) {
                }
            default:
                kbs.g("There is no way to get here, but the compiler thinks otherwise.");
                break;
        }
        return 0;
    }
}
