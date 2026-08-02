package io.requery.android.database.sqlite;

import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.ji;

/* loaded from: classes8.dex */
public class SQLiteFunction {
    private final MyArgs args;
    public final SQLiteDatabase.Function callback;
    final int flags;
    public final String name;
    public final int numArgs;
    private final MyResult result;

    public static class MyArgs implements SQLiteDatabase.Function.Args {
        int argsCount;
        long argsPtr;

        public /* synthetic */ MyArgs(int i) {
            this();
        }

        private int checkArg(int i) {
            if (i >= 0 && i < this.argsCount) {
                return i;
            }
            StringBuilder b = ji.b(i, "Requested arg ", " but had ");
            b.append(this.argsCount);
            throw new IllegalArgumentException(b.toString());
        }

        @Override // io.requery.android.database.sqlite.SQLiteDatabase.Function.Args
        public byte[] getBlob(int i) {
            return SQLiteFunction.nativeGetArgBlob(this.argsPtr, checkArg(i));
        }

        @Override // io.requery.android.database.sqlite.SQLiteDatabase.Function.Args
        public double getDouble(int i) {
            return SQLiteFunction.nativeGetArgDouble(this.argsPtr, checkArg(i));
        }

        @Override // io.requery.android.database.sqlite.SQLiteDatabase.Function.Args
        public int getInt(int i) {
            return SQLiteFunction.nativeGetArgInt(this.argsPtr, checkArg(i));
        }

        @Override // io.requery.android.database.sqlite.SQLiteDatabase.Function.Args
        public long getLong(int i) {
            return SQLiteFunction.nativeGetArgLong(this.argsPtr, checkArg(i));
        }

        @Override // io.requery.android.database.sqlite.SQLiteDatabase.Function.Args
        public String getString(int i) {
            return SQLiteFunction.nativeGetArgString(this.argsPtr, checkArg(i));
        }

        private MyArgs() {
        }
    }

    public static class MyResult implements SQLiteDatabase.Function.Result {
        long contextPtr;
        boolean isSet;

        public /* synthetic */ MyResult(int i) {
            this();
        }

        private void checkSet() {
            if (this.isSet) {
                throw new IllegalStateException("Result is already set");
            }
            this.isSet = true;
        }

        @Override // io.requery.android.database.sqlite.SQLiteDatabase.Function.Result
        public void set(byte[] bArr) {
            checkSet();
            SQLiteFunction.nativeSetResultBlob(this.contextPtr, bArr);
        }

        @Override // io.requery.android.database.sqlite.SQLiteDatabase.Function.Result
        public void setError(String str) {
            checkSet();
            SQLiteFunction.nativeSetResultError(this.contextPtr, str);
        }

        @Override // io.requery.android.database.sqlite.SQLiteDatabase.Function.Result
        public void setNull() {
            checkSet();
            SQLiteFunction.nativeSetResultNull(this.contextPtr);
        }

        private MyResult() {
        }

        @Override // io.requery.android.database.sqlite.SQLiteDatabase.Function.Result
        public void set(double d) {
            checkSet();
            SQLiteFunction.nativeSetResultDouble(this.contextPtr, d);
        }

        @Override // io.requery.android.database.sqlite.SQLiteDatabase.Function.Result
        public void set(int i) {
            checkSet();
            SQLiteFunction.nativeSetResultInt(this.contextPtr, i);
        }

        @Override // io.requery.android.database.sqlite.SQLiteDatabase.Function.Result
        public void set(long j) {
            checkSet();
            SQLiteFunction.nativeSetResultLong(this.contextPtr, j);
        }

        @Override // io.requery.android.database.sqlite.SQLiteDatabase.Function.Result
        public void set(String str) {
            checkSet();
            SQLiteFunction.nativeSetResultString(this.contextPtr, str);
        }
    }

    public SQLiteFunction(String str, int i, SQLiteDatabase.Function function) {
        this(str, i, function, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void dispatchCallback(long j, long j2, int i) {
        MyResult myResult = this.result;
        myResult.contextPtr = j;
        MyArgs myArgs = this.args;
        myArgs.argsPtr = j2;
        myArgs.argsCount = i;
        try {
            this.callback.callback(myArgs, myResult);
            MyResult myResult2 = this.result;
            if (!myResult2.isSet) {
                myResult2.setNull();
            }
        } finally {
            MyResult myResult3 = this.result;
            myResult3.contextPtr = 0L;
            myResult3.isSet = false;
            MyArgs myArgs2 = this.args;
            myArgs2.argsPtr = 0L;
            myArgs2.argsCount = 0;
        }
    }

    public static native byte[] nativeGetArgBlob(long j, int i);

    public static native double nativeGetArgDouble(long j, int i);

    public static native int nativeGetArgInt(long j, int i);

    public static native long nativeGetArgLong(long j, int i);

    public static native String nativeGetArgString(long j, int i);

    public static native void nativeSetResultBlob(long j, byte[] bArr);

    public static native void nativeSetResultDouble(long j, double d);

    public static native void nativeSetResultError(long j, String str);

    public static native void nativeSetResultInt(long j, int i);

    public static native void nativeSetResultLong(long j, long j2);

    public static native void nativeSetResultNull(long j);

    public static native void nativeSetResultString(long j, String str);

    public SQLiteFunction(String str, int i, SQLiteDatabase.Function function, int i2) {
        int i3 = 0;
        this.args = new MyArgs(i3);
        this.result = new MyResult(i3);
        if (str == null) {
            throw new IllegalArgumentException("name must not be null.");
        }
        this.name = str;
        this.numArgs = i;
        this.callback = function;
        this.flags = i2;
    }
}
