package xsna;

import xsna.q630;

/* compiled from: FocusRequester.kt */
/* loaded from: classes11.dex */
public final class rwr {
    public static final rwr b = new rwr();
    public static final rwr c = new rwr();
    public static final rwr d = new rwr();
    public final ci50<uwr> a = new ci50<>(new uwr[16]);

    /* JADX WARN: Code restructure failed: missing block: B:70:0x004f, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(rwr rwrVar) {
        rwrVar.getClass();
        if (rwrVar == b) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        if (rwrVar == c) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        ci50<uwr> ci50Var = rwrVar.a;
        int i = ci50Var.d;
        if (i == 0) {
            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return;
        }
        uwr[] uwrVarArr = ci50Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            uwr uwrVar = uwrVarArr[i2];
            if (!uwrVar.z().o) {
                uzw.b("visitChildren called on an unattached node");
            }
            ci50 ci50Var2 = new ci50(new q630.c[16]);
            q630.c cVar = uwrVar.z().g;
            if (cVar == null) {
                itl.a(ci50Var2, uwrVar.z());
            } else {
                ci50Var2.b(cVar);
            }
            while (true) {
                int i3 = ci50Var2.d;
                if (i3 != 0) {
                    q630.c cVar2 = (q630.c) ci50Var2.k(i3 - 1);
                    if ((cVar2.e & 1024) == 0) {
                        itl.a(ci50Var2, cVar2);
                    } else {
                        while (true) {
                            if (cVar2 == null) {
                                break;
                            }
                            if ((cVar2.d & 1024) != 0) {
                                ci50 ci50Var3 = null;
                                while (cVar2 != null) {
                                    if (cVar2 instanceof dxr) {
                                        if (((dxr) cVar2).v1(7)) {
                                            break;
                                        }
                                    } else if ((cVar2.d & 1024) != 0 && (cVar2 instanceof ytl)) {
                                        int i4 = 0;
                                        for (q630.c cVar3 = ((ytl) cVar2).q; cVar3 != null; cVar3 = cVar3.g) {
                                            if ((cVar3.d & 1024) != 0) {
                                                i4++;
                                                if (i4 == 1) {
                                                    cVar2 = cVar3;
                                                } else {
                                                    if (ci50Var3 == null) {
                                                        ci50Var3 = new ci50(new q630.c[16]);
                                                    }
                                                    if (cVar2 != null) {
                                                        ci50Var3.b(cVar2);
                                                        cVar2 = null;
                                                    }
                                                    ci50Var3.b(cVar3);
                                                }
                                            }
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                    cVar2 = itl.b(ci50Var3);
                                }
                            } else {
                                cVar2 = cVar2.g;
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0094, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0100, code lost:
    
        r3 = r3 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        ci50<uwr> ci50Var = this.a;
        int i = ci50Var.d;
        if (i == 0) {
            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return;
        }
        uwr[] uwrVarArr = ci50Var.b;
        int i2 = 0;
        while (i2 < i) {
            uwr uwrVar = uwrVarArr[i2];
            q630.c z = uwrVar.z();
            ci50 ci50Var2 = null;
            while (z != null) {
                if (z instanceof dxr) {
                    if (gxr.b((dxr) z)) {
                        return;
                    }
                } else if ((z.d & 1024) != 0 && (z instanceof ytl)) {
                    int i3 = 0;
                    for (q630.c cVar = ((ytl) z).q; cVar != null; cVar = cVar.g) {
                        if ((cVar.d & 1024) != 0) {
                            i3++;
                            if (i3 == 1) {
                                z = cVar;
                            } else {
                                if (ci50Var2 == null) {
                                    ci50Var2 = new ci50(new q630.c[16]);
                                }
                                if (z != null) {
                                    ci50Var2.b(z);
                                    z = null;
                                }
                                ci50Var2.b(cVar);
                            }
                        }
                    }
                    if (i3 == 1) {
                    }
                }
                z = itl.b(ci50Var2);
            }
            if (!uwrVar.z().o) {
                uzw.b("visitChildren called on an unattached node");
            }
            ci50 ci50Var3 = new ci50(new q630.c[16]);
            q630.c cVar2 = uwrVar.z().g;
            if (cVar2 == null) {
                itl.a(ci50Var3, uwrVar.z());
            } else {
                ci50Var3.b(cVar2);
            }
            while (true) {
                int i4 = ci50Var3.d;
                if (i4 != 0) {
                    q630.c cVar3 = (q630.c) ci50Var3.k(i4 - 1);
                    if ((cVar3.e & 1024) == 0) {
                        itl.a(ci50Var3, cVar3);
                    } else {
                        while (true) {
                            if (cVar3 == null) {
                                break;
                            }
                            if ((cVar3.d & 1024) != 0) {
                                ci50 ci50Var4 = null;
                                while (cVar3 != null) {
                                    if (cVar3 instanceof dxr) {
                                        if (gxr.b((dxr) cVar3)) {
                                            return;
                                        }
                                    } else if ((cVar3.d & 1024) != 0 && (cVar3 instanceof ytl)) {
                                        int i5 = 0;
                                        for (q630.c cVar4 = ((ytl) cVar3).q; cVar4 != null; cVar4 = cVar4.g) {
                                            if ((cVar4.d & 1024) != 0) {
                                                i5++;
                                                if (i5 == 1) {
                                                    cVar3 = cVar4;
                                                } else {
                                                    if (ci50Var4 == null) {
                                                        ci50Var4 = new ci50(new q630.c[16]);
                                                    }
                                                    if (cVar3 != null) {
                                                        ci50Var4.b(cVar3);
                                                        cVar3 = null;
                                                    }
                                                    ci50Var4.b(cVar4);
                                                }
                                            }
                                        }
                                        if (i5 == 1) {
                                        }
                                    }
                                    cVar3 = itl.b(ci50Var4);
                                }
                            } else {
                                cVar3 = cVar3.g;
                            }
                        }
                    }
                }
            }
        }
    }
}
