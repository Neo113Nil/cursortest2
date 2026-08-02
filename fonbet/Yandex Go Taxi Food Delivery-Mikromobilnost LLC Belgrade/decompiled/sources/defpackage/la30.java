package defpackage;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.ArrayList;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes.dex */
public final class la30 {
    public long a;
    public final SparseLongArray b = new SparseLongArray();
    public final SparseBooleanArray c = new SparseBooleanArray();
    public final ArrayList d = new ArrayList();
    public final rnz e = new rnz((Object) null);
    public int f = -1;
    public int g = -1;
    public boolean h;
    public boolean i;
    public wu60 j;

    public final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        SparseLongArray sparseLongArray = this.b;
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            if (sparseLongArray.indexOfKey(pointerId) < 0) {
                long j = this.a;
                this.a = 1 + j;
                sparseLongArray.put(pointerId, j);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (sparseLongArray.indexOfKey(pointerId2) < 0) {
            long j2 = this.a;
            this.a = 1 + j2;
            sparseLongArray.put(pointerId2, j2);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.c.put(pointerId2, true);
            }
        }
    }

    public final void b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.f && source == this.g) {
            return;
        }
        this.f = toolType;
        this.g = source;
        this.c.clear();
        this.b.clear();
    }

    public final y4a0 c(AndroidComposeView androidComposeView, MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        SparseBooleanArray sparseBooleanArray = this.c;
        if (actionMasked == 3 || actionMasked == 4) {
            this.b.clear();
            sparseBooleanArray.clear();
            this.h = false;
            this.i = false;
            this.j = null;
            return null;
        }
        b(motionEvent);
        a(motionEvent);
        boolean z = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
        boolean z2 = actionMasked == 8;
        if (z) {
            sparseBooleanArray.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        if (actionMasked != 1) {
            i = actionMasked != 6 ? -1 : motionEvent.getActionIndex();
        } else {
            i = 0;
        }
        ArrayList arrayList = this.d;
        arrayList.clear();
        if (motionEvent.getActionMasked() == 0) {
            boolean z3 = Build.VERSION.SDK_INT >= 34 && (motionEvent.getClassification() == 3 || motionEvent.getClassification() == 5);
            boolean z4 = motionEvent.getButtonState() == 0 && (motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584));
            if (z3 || z4) {
                this.h = true;
            }
        }
        if (Build.VERSION.SDK_INT < 34 || motionEvent.getClassification() != 3) {
            this.i = false;
            int pointerCount = motionEvent.getPointerCount();
            int i2 = 0;
            while (i2 < pointerCount) {
                arrayList.add(d(androidComposeView, motionEvent, null, i2, (z || i2 == i || (z2 && motionEvent.getButtonState() == 0)) ? false : true));
                i2++;
            }
        } else {
            this.i = true;
            if (motionEvent.getActionMasked() == 0) {
                float rawX = motionEvent.getRawX(0);
                this.j = new wu60((Float.floatToRawIntBits(motionEvent.getRawY(0)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(rawX) << 32));
            }
            arrayList.add(d(androidComposeView, motionEvent, this.j, 0, false));
        }
        if (motionEvent.getActionMasked() == 1) {
            this.h = false;
            this.i = false;
            this.j = null;
        }
        e(motionEvent);
        motionEvent.getEventTime();
        return new y4a0(arrayList, motionEvent, false, 17);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x008e, code lost:
    
        if (r1 != 4) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0151 A[EDGE_INSN: B:40:0x0151->B:41:0x0151 BREAK  A[LOOP:0: B:20:0x00c3->B:36:0x0149], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final cwd0 d(AndroidComposeView androidComposeView, MotionEvent motionEvent, wu60 wu60Var, int i, boolean z) {
        long j;
        long e;
        long mo69screenToLocalMKHz9U;
        int i2;
        int historySize;
        int i3;
        char c;
        float f;
        int pointerId = motionEvent.getPointerId(i);
        SparseLongArray sparseLongArray = this.b;
        int indexOfKey = sparseLongArray.indexOfKey(pointerId);
        if (indexOfKey >= 0) {
            j = sparseLongArray.valueAt(indexOfKey);
        } else {
            long j2 = this.a;
            this.a = 1 + j2;
            sparseLongArray.put(pointerId, j2);
            j = j2;
        }
        float pressure = motionEvent.getPressure(i);
        float x = motionEvent.getX(i);
        float y = motionEvent.getY(i);
        long floatToRawIntBits = Float.floatToRawIntBits(x);
        long floatToRawIntBits2 = Float.floatToRawIntBits(y);
        char c2 = HexString.CHAR_SPACE;
        long j3 = _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
        long j4 = (floatToRawIntBits << 32) | (floatToRawIntBits2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        if (i == 0) {
            e = wu60Var != null ? wu60Var.a : (Float.floatToRawIntBits(motionEvent.getRawX()) << 32) | (Float.floatToRawIntBits(motionEvent.getRawY()) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
            mo69screenToLocalMKHz9U = androidComposeView.mo69screenToLocalMKHz9U(e);
        } else {
            e = wu60Var != null ? wu60Var.a : gob1.e(motionEvent, i);
            mo69screenToLocalMKHz9U = androidComposeView.mo69screenToLocalMKHz9U(e);
        }
        long j5 = e;
        long j6 = mo69screenToLocalMKHz9U;
        int toolType = motionEvent.getToolType(i);
        if (toolType != 0) {
            int i4 = 2;
            if (toolType == 1) {
                if ((!motionEvent.isFromSource(8194) && !motionEvent.isFromSource(1048584)) || (this.h && !this.i)) {
                    i2 = 1;
                }
                i2 = i4;
            } else if (toolType != 2) {
                if (toolType != 3) {
                    i4 = 4;
                }
                i2 = i4;
            } else {
                i2 = 3;
            }
            ArrayList arrayList = new ArrayList(motionEvent.getHistorySize());
            historySize = motionEvent.getHistorySize();
            i3 = 0;
            while (true) {
                c = c2;
                if (i3 < historySize) {
                    break;
                }
                float historicalX = motionEvent.getHistoricalX(i, i3);
                float historicalY = motionEvent.getHistoricalY(i, i3);
                long j7 = j3;
                if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(historicalY) & Integer.MAX_VALUE) < 2139095040) {
                    long floatToRawIntBits3 = (Float.floatToRawIntBits(historicalX) << c) | (Float.floatToRawIntBits(historicalY) & j7);
                    long historicalEventTime = motionEvent.getHistoricalEventTime(i3);
                    float historicalAxisValue = motionEvent.getHistoricalAxisValue(52, i, i3);
                    Float valueOf = historicalAxisValue > 0.0f ? Float.valueOf(historicalAxisValue) : null;
                    arrayList.add(new plu(historicalEventTime, floatToRawIntBits3, valueOf != null ? valueOf.floatValue() : 1.0f, motionEvent.getClassification() == 3 ? (Float.floatToRawIntBits(motionEvent.getHistoricalAxisValue(50, i, i3)) << c) | (Float.floatToRawIntBits(motionEvent.getHistoricalAxisValue(51, i, i3)) & j7) : 0L, floatToRawIntBits3));
                }
                i3++;
                c2 = c;
                j3 = j7;
            }
            long j8 = j3;
            long floatToRawIntBits4 = motionEvent.getActionMasked() != 8 ? (Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + 0.0f) & j8) | (Float.floatToRawIntBits(motionEvent.getAxisValue(10)) << c) : 0L;
            if (motionEvent.getClassification() == 5) {
                float axisValue = motionEvent.getAxisValue(52, i);
                Float valueOf2 = axisValue > 0.0f ? Float.valueOf(axisValue) : null;
                if (valueOf2 != null) {
                    f = valueOf2.floatValue();
                }
            }
            return new cwd0(j, motionEvent.getEventTime(), j5, j6, z, pressure, i2, this.c.get(motionEvent.getPointerId(i), false), arrayList, floatToRawIntBits4, f, motionEvent.getClassification() == 3 ? (Float.floatToRawIntBits(motionEvent.getAxisValue(50, i)) << c) | (Float.floatToRawIntBits(motionEvent.getAxisValue(51, i)) & j8) : 0L, j4);
        }
        i2 = 0;
        ArrayList arrayList2 = new ArrayList(motionEvent.getHistorySize());
        historySize = motionEvent.getHistorySize();
        i3 = 0;
        while (true) {
            c = c2;
            if (i3 < historySize) {
            }
            i3++;
            c2 = c;
            j3 = j7;
        }
        long j82 = j3;
        if (motionEvent.getActionMasked() != 8) {
        }
        if (motionEvent.getClassification() == 5) {
        }
        return new cwd0(j, motionEvent.getEventTime(), j5, j6, z, pressure, i2, this.c.get(motionEvent.getPointerId(i), false), arrayList2, floatToRawIntBits4, f, motionEvent.getClassification() == 3 ? (Float.floatToRawIntBits(motionEvent.getAxisValue(50, i)) << c) | (Float.floatToRawIntBits(motionEvent.getAxisValue(51, i)) & j82) : 0L, j4);
    }

    public final void e(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        SparseBooleanArray sparseBooleanArray = this.c;
        SparseLongArray sparseLongArray = this.b;
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!sparseBooleanArray.get(pointerId, false)) {
                sparseLongArray.delete(pointerId);
                sparseBooleanArray.delete(pointerId);
            }
        }
        if (sparseLongArray.size() > motionEvent.getPointerCount()) {
            for (int size = sparseLongArray.size() - 1; -1 < size; size--) {
                int keyAt = sparseLongArray.keyAt(size);
                int pointerCount = motionEvent.getPointerCount();
                int i = 0;
                while (true) {
                    if (i >= pointerCount) {
                        sparseLongArray.removeAt(size);
                        sparseBooleanArray.delete(keyAt);
                        break;
                    } else if (motionEvent.getPointerId(i) == keyAt) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
    }
}
