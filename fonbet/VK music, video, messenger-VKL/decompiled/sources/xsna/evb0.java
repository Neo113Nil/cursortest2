package xsna;

import com.facebook.imagepipeline.memory.AshmemMemoryChunkPool;
import com.facebook.imagepipeline.memory.BufferMemoryChunkPool;
import com.facebook.imagepipeline.memory.NativeMemoryChunkPool;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PoolFactory.java */
/* loaded from: classes.dex */
public class evb0 {
    public final dvb0 a;
    public com.facebook.imagepipeline.memory.b b;
    public sc7 c;
    public com.facebook.imagepipeline.memory.b d;
    public com.facebook.imagepipeline.memory.b e;
    public b320 f;
    public mvb0 g;
    public com.facebook.imagepipeline.memory.a h;

    public evb0(dvb0 dvb0Var) {
        this.a = dvb0Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public sc7 a() {
        char c;
        dvb0 dvb0Var = this.a;
        u370 u370Var = dvb0Var.b;
        n370 n370Var = dvb0Var.d;
        if (this.c == null) {
            String str = dvb0Var.i;
            switch (str.hashCode()) {
                case -1868884870:
                    if (str.equals("legacy_default_params")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1106578487:
                    if (str.equals("legacy")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -404562712:
                    if (str.equals("experimental")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -402149703:
                    if (str.equals("dummy_with_tracking")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 95945896:
                    if (str.equals("dummy")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                this.c = new mno();
            } else if (c == 1) {
                this.c = new vno();
            } else if (c == 2) {
                this.c = new k900(dvb0Var.j, u370.c());
            } else if (c != 3) {
                this.c = new tl8(n370Var, dvb0Var.a, u370Var);
            } else {
                this.c = new tl8(n370Var, vbl.a(), u370Var);
            }
        }
        return this.c;
    }

    public final b320 b(int i) {
        com.facebook.imagepipeline.memory.b bVar;
        if (this.f == null) {
            dvb0 dvb0Var = this.a;
            u370 u370Var = dvb0Var.f;
            fvb0 fvb0Var = dvb0Var.e;
            n370 n370Var = dvb0Var.d;
            if (i == 0) {
                if (this.e == null) {
                    try {
                        this.e = (com.facebook.imagepipeline.memory.b) NativeMemoryChunkPool.class.getConstructor(g320.class, fvb0.class, gvb0.class).newInstance(n370Var, fvb0Var, u370Var);
                    } catch (ClassNotFoundException e) {
                        ahq.e("PoolFactory", "", e);
                        this.e = null;
                    } catch (IllegalAccessException e2) {
                        ahq.e("PoolFactory", "", e2);
                        this.e = null;
                    } catch (InstantiationException e3) {
                        ahq.e("PoolFactory", "", e3);
                        this.e = null;
                    } catch (NoSuchMethodException e4) {
                        ahq.e("PoolFactory", "", e4);
                        this.e = null;
                    } catch (InvocationTargetException e5) {
                        ahq.e("PoolFactory", "", e5);
                        this.e = null;
                    }
                }
                bVar = this.e;
            } else if (i == 1) {
                if (this.d == null) {
                    try {
                        this.d = (com.facebook.imagepipeline.memory.b) BufferMemoryChunkPool.class.getConstructor(g320.class, fvb0.class, gvb0.class).newInstance(n370Var, fvb0Var, u370Var);
                    } catch (ClassNotFoundException unused) {
                        this.d = null;
                    } catch (IllegalAccessException unused2) {
                        this.d = null;
                    } catch (InstantiationException unused3) {
                        this.d = null;
                    } catch (NoSuchMethodException unused4) {
                        this.d = null;
                    } catch (InvocationTargetException unused5) {
                        this.d = null;
                    }
                }
                bVar = this.d;
            } else {
                if (i != 2) {
                    throw new IllegalArgumentException("Invalid MemoryChunkType");
                }
                if (this.b == null) {
                    try {
                        this.b = (com.facebook.imagepipeline.memory.b) AshmemMemoryChunkPool.class.getConstructor(g320.class, fvb0.class, gvb0.class).newInstance(n370Var, fvb0Var, u370Var);
                    } catch (ClassNotFoundException unused6) {
                        this.b = null;
                    } catch (IllegalAccessException unused7) {
                        this.b = null;
                    } catch (InstantiationException unused8) {
                        this.b = null;
                    } catch (NoSuchMethodException unused9) {
                        this.b = null;
                    } catch (InvocationTargetException unused10) {
                        this.b = null;
                    }
                }
                bVar = this.b;
            }
            sex0.e(bVar, "failed to get pool for chunk type: " + i);
            this.f = new b320(bVar, c());
        }
        return this.f;
    }

    public final mvb0 c() {
        if (this.g == null) {
            if (this.h == null) {
                dvb0 dvb0Var = this.a;
                this.h = new com.facebook.imagepipeline.memory.a(dvb0Var.d, dvb0Var.g, dvb0Var.h);
            }
            this.g = new mvb0(this.h);
        }
        return this.g;
    }
}
