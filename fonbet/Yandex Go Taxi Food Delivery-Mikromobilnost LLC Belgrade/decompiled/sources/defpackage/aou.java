package defpackage;

import java.io.BufferedReader;
import java.util.ArrayDeque;

/* loaded from: classes10.dex */
public final class aou {
    public final /* synthetic */ int a;
    public final BufferedReader b;
    public final ArrayDeque c;
    public String d;

    public /* synthetic */ aou(ArrayDeque arrayDeque, BufferedReader bufferedReader, int i) {
        this.a = i;
        this.c = arrayDeque;
        this.b = bufferedReader;
    }

    public final boolean a() {
        String trim;
        String trim2;
        int i = this.a;
        BufferedReader bufferedReader = this.b;
        ArrayDeque arrayDeque = this.c;
        switch (i) {
            case 0:
                if (this.d == null) {
                    if (arrayDeque.isEmpty()) {
                        do {
                            String readLine = bufferedReader.readLine();
                            this.d = readLine;
                            if (readLine == null) {
                                break;
                            } else {
                                trim = readLine.trim();
                                this.d = trim;
                            }
                        } while (trim.isEmpty());
                    } else {
                        String str = (String) arrayDeque.poll();
                        str.getClass();
                        this.d = str;
                    }
                }
                break;
            default:
                if (this.d == null) {
                    if (arrayDeque.isEmpty()) {
                        do {
                            String readLine2 = bufferedReader.readLine();
                            this.d = readLine2;
                            if (readLine2 == null) {
                                break;
                            } else {
                                trim2 = readLine2.trim();
                                this.d = trim2;
                            }
                        } while (trim2.isEmpty());
                    } else {
                        String str2 = (String) arrayDeque.poll();
                        str2.getClass();
                        this.d = str2;
                    }
                }
                break;
        }
        return true;
    }

    public final String b() {
        switch (this.a) {
            case 0:
                if (!a()) {
                    ny61.p();
                    break;
                } else {
                    String str = this.d;
                    this.d = null;
                    break;
                }
            default:
                if (!a()) {
                    ny61.p();
                    break;
                } else {
                    String str2 = this.d;
                    this.d = null;
                    break;
                }
        }
        return null;
    }
}
