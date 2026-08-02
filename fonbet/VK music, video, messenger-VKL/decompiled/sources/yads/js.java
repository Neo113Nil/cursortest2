package yads;

import android.util.SparseArray;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes10.dex */
public final class js implements ks {
    public final boolean a = false;
    public final Cipher b = null;
    public final SecretKeySpec c = null;
    public final SecureRandom d = null;
    public final gk e;
    public boolean f;
    public jr2 g;

    public js(File file) {
        this.e = new gk(file);
    }

    @Override // yads.ks
    public final void a(long j) {
    }

    @Override // yads.ks
    public final void b() {
        gk gkVar = this.e;
        gkVar.a.delete();
        gkVar.b.delete();
    }

    @Override // yads.ks
    public final boolean a() {
        gk gkVar = this.e;
        return gkVar.a.exists() || gkVar.b.exists();
    }

    public static int a(hs hsVar, int i) {
        int hashCode = hsVar.b.hashCode() + (hsVar.a * 31);
        if (i < 2) {
            long a = qz.a(hsVar.e);
            return (hashCode * 31) + ((int) (a ^ (a >>> 32)));
        }
        return hsVar.e.hashCode() + (hashCode * 31);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.DataOutputStream, java.io.OutputStream] */
    @Override // yads.ks
    public final void b(HashMap hashMap) {
        Object obj = null;
        try {
            fk b = this.e.b();
            jr2 jr2Var = this.g;
            if (jr2Var == null) {
                this.g = new jr2(b);
            } else {
                jr2Var.a(b);
            }
            jr2 jr2Var2 = this.g;
            ?? r2 = new DataOutputStream(jr2Var2);
            try {
                r2.writeInt(2);
                r2.writeInt(this.a ? 1 : 0);
                DataOutputStream dataOutputStream = r2;
                if (this.a) {
                    byte[] bArr = new byte[16];
                    SecureRandom secureRandom = this.d;
                    int i = mc3.a;
                    secureRandom.nextBytes(bArr);
                    r2.write(bArr);
                    try {
                        this.b.init(1, this.c, new IvParameterSpec(bArr));
                        r2.flush();
                        dataOutputStream = new DataOutputStream(new CipherOutputStream(jr2Var2, this.b));
                    } catch (InvalidAlgorithmParameterException e) {
                        e = e;
                        throw new IllegalStateException(e);
                    } catch (InvalidKeyException e2) {
                        e = e2;
                        throw new IllegalStateException(e);
                    }
                }
                try {
                    dataOutputStream.writeInt(hashMap.size());
                    int i2 = 0;
                    for (hs hsVar : hashMap.values()) {
                        dataOutputStream.writeInt(hsVar.a);
                        dataOutputStream.writeUTF(hsVar.b);
                        Set<Map.Entry> entrySet = hsVar.e.b.entrySet();
                        dataOutputStream.writeInt(entrySet.size());
                        for (Map.Entry entry : entrySet) {
                            dataOutputStream.writeUTF((String) entry.getKey());
                            byte[] bArr2 = (byte[]) entry.getValue();
                            dataOutputStream.writeInt(bArr2.length);
                            dataOutputStream.write(bArr2);
                        }
                        i2 += a(hsVar, 2);
                    }
                    dataOutputStream.writeInt(i2);
                    gk gkVar = this.e;
                    gkVar.getClass();
                    dataOutputStream.close();
                    gkVar.b.delete();
                    int i3 = mc3.a;
                    this.f = false;
                } catch (Throwable th) {
                    th = th;
                    obj = dataOutputStream;
                    r2 = obj;
                    mc3.a((Closeable) r2);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                mc3.a((Closeable) r2);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // yads.ks
    public final void a(HashMap hashMap, SparseArray sparseArray) {
        BufferedInputStream bufferedInputStream;
        DataInputStream dataInputStream;
        int readInt;
        if (!this.f) {
            gk gkVar = this.e;
            if (gkVar.a.exists() || gkVar.b.exists()) {
                DataInputStream dataInputStream2 = null;
                try {
                    bufferedInputStream = new BufferedInputStream(this.e.a());
                    dataInputStream = new DataInputStream(bufferedInputStream);
                    try {
                        readInt = dataInputStream.readInt();
                    } catch (IOException unused) {
                        dataInputStream2 = dataInputStream;
                        if (dataInputStream2 != null) {
                            mc3.a((Closeable) dataInputStream2);
                        }
                        hashMap.clear();
                        sparseArray.clear();
                        gk gkVar2 = this.e;
                        gkVar2.a.delete();
                        gkVar2.b.delete();
                        return;
                    } catch (Throwable th) {
                        th = th;
                        dataInputStream2 = dataInputStream;
                        if (dataInputStream2 != null) {
                            mc3.a((Closeable) dataInputStream2);
                        }
                        throw th;
                    }
                } catch (IOException unused2) {
                } catch (Throwable th2) {
                    th = th2;
                }
                if (readInt >= 0 && readInt <= 2) {
                    if ((dataInputStream.readInt() & 1) != 0) {
                        if (this.b != null) {
                            byte[] bArr = new byte[16];
                            dataInputStream.readFully(bArr);
                            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
                            try {
                                Cipher cipher = this.b;
                                SecretKeySpec secretKeySpec = this.c;
                                int i = mc3.a;
                                cipher.init(2, secretKeySpec, ivParameterSpec);
                                dataInputStream = new DataInputStream(new CipherInputStream(bufferedInputStream, this.b));
                            } catch (InvalidAlgorithmParameterException e) {
                                e = e;
                                throw new IllegalStateException(e);
                            } catch (InvalidKeyException e2) {
                                e = e2;
                                throw new IllegalStateException(e);
                            }
                        }
                    } else if (this.a) {
                        this.f = true;
                    }
                    int readInt2 = dataInputStream.readInt();
                    int i2 = 0;
                    for (int i3 = 0; i3 < readInt2; i3++) {
                        hs a = a(readInt, dataInputStream);
                        hashMap.put(a.b, a);
                        sparseArray.put(a.a, a.b);
                        i2 += a(a, readInt);
                    }
                    int readInt3 = dataInputStream.readInt();
                    boolean z = dataInputStream.read() == -1;
                    if (readInt3 == i2 && z) {
                        mc3.a((Closeable) dataInputStream);
                        return;
                    }
                    mc3.a((Closeable) dataInputStream);
                    hashMap.clear();
                    sparseArray.clear();
                    gk gkVar22 = this.e;
                    gkVar22.a.delete();
                    gkVar22.b.delete();
                    return;
                }
                mc3.a((Closeable) dataInputStream);
                hashMap.clear();
                sparseArray.clear();
                gk gkVar222 = this.e;
                gkVar222.a.delete();
                gkVar222.b.delete();
                return;
            }
            return;
        }
        throw new IllegalStateException();
    }

    @Override // yads.ks
    public final void a(hs hsVar, boolean z) {
        this.f = true;
    }

    @Override // yads.ks
    public final void a(hs hsVar) {
        this.f = true;
    }

    public static hs a(int i, DataInputStream dataInputStream) {
        jc0 a;
        int readInt = dataInputStream.readInt();
        String readUTF = dataInputStream.readUTF();
        if (i < 2) {
            long readLong = dataInputStream.readLong();
            rz rzVar = new rz();
            rzVar.a.put("exo_len", Long.valueOf(readLong));
            rzVar.b.remove("exo_len");
            a = jc0.c.a(rzVar);
        } else {
            a = ls.a(dataInputStream);
        }
        return new hs(readInt, readUTF, a);
    }

    @Override // yads.ks
    public final void a(HashMap hashMap) {
        if (this.f) {
            b(hashMap);
        }
    }
}
