package com.bumptech.glide.load.engine;

import defpackage.ph91;
import defpackage.v1o;
import defpackage.x1o;

/* loaded from: classes10.dex */
public final class d implements Runnable {
    public final /* synthetic */ int a;
    public final com.bumptech.glide.request.a b;
    public final /* synthetic */ x1o c;

    public /* synthetic */ d(x1o x1oVar, com.bumptech.glide.request.a aVar, int i) {
        this.a = i;
        this.c = x1oVar;
        this.b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CallbackException callbackException;
        switch (this.a) {
            case 0:
                com.bumptech.glide.request.a aVar = this.b;
                aVar.a.a();
                synchronized (aVar.b) {
                    synchronized (this.c) {
                        try {
                            if (this.c.a.a.contains(new v1o(this.b, ph91.b))) {
                                x1o x1oVar = this.c;
                                com.bumptech.glide.request.a aVar2 = this.b;
                                x1oVar.getClass();
                                try {
                                    aVar2.g(x1oVar.J, 5);
                                } finally {
                                }
                            }
                            this.c.b();
                        } finally {
                        }
                    }
                }
                return;
            default:
                com.bumptech.glide.request.a aVar3 = this.b;
                aVar3.a.a();
                synchronized (aVar3.b) {
                    synchronized (this.c) {
                        try {
                            if (this.c.a.a.contains(new v1o(this.b, ph91.b))) {
                                this.c.L.c();
                                x1o x1oVar2 = this.c;
                                com.bumptech.glide.request.a aVar4 = this.b;
                                x1oVar2.getClass();
                                try {
                                    aVar4.h(x1oVar2.L, x1oVar2.H, x1oVar2.O);
                                    this.c.g(this.b);
                                } finally {
                                }
                            }
                            this.c.b();
                        } finally {
                        }
                    }
                }
                return;
        }
    }
}
