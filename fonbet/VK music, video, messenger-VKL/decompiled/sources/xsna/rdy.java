package xsna;

import android.view.KeyEvent;
import androidx.compose.foundation.text.KeyCommand;
import xsna.qdy;

/* compiled from: KeyMapping.android.kt */
/* loaded from: classes11.dex */
public final class rdy {
    public static final a a = new a();

    /* compiled from: KeyMapping.android.kt */
    public static final class a {
        /* JADX WARN: Removed duplicated region for block: B:17:0x00db  */
        /* JADX WARN: Removed duplicated region for block: B:235:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final KeyCommand a(KeyEvent keyEvent) {
            KeyCommand keyCommand;
            KeyCommand keyCommand2;
            int g = k7b0.g(keyEvent);
            KeyCommand keyCommand3 = null;
            if (g == sdy.b) {
                long b = x1o0.b(keyEvent.getKeyCode());
                if (bdy.a(b, bdy.f)) {
                    keyCommand3 = KeyCommand.SELECT_LINE_LEFT;
                } else if (bdy.a(b, bdy.g)) {
                    keyCommand3 = KeyCommand.SELECT_LINE_RIGHT;
                } else if (bdy.a(b, bdy.d)) {
                    keyCommand3 = KeyCommand.SELECT_HOME;
                } else if (bdy.a(b, bdy.e)) {
                    keyCommand3 = KeyCommand.SELECT_END;
                }
            } else if (g == 1) {
                long b2 = x1o0.b(keyEvent.getKeyCode());
                if (bdy.a(b2, bdy.f)) {
                    keyCommand3 = KeyCommand.LINE_LEFT;
                } else if (bdy.a(b2, bdy.g)) {
                    keyCommand3 = KeyCommand.LINE_RIGHT;
                } else if (bdy.a(b2, bdy.d)) {
                    keyCommand3 = KeyCommand.HOME;
                } else if (bdy.a(b2, bdy.e)) {
                    keyCommand3 = KeyCommand.END;
                } else if (bdy.a(b2, bdy.s)) {
                    keyCommand3 = KeyCommand.DELETE_FROM_LINE_START;
                }
            }
            if (keyCommand3 != null) {
                return keyCommand3;
            }
            qdy.a aVar = qdy.a;
            aVar.getClass();
            int i = sdy.c;
            int g2 = k7b0.g(keyEvent);
            long b3 = x1o0.b(keyEvent.getKeyCode());
            KeyCommand keyCommand4 = null;
            if (bdy.a(b3, bdy.s)) {
                if (g2 != 0 && g2 != 8) {
                    int i2 = sdy.d;
                    if (g2 != 12) {
                        if (g2 == 2 || g2 == 10) {
                            keyCommand = KeyCommand.DELETE_PREV_WORD;
                            if (keyCommand != null) {
                                return keyCommand;
                            }
                            int g3 = k7b0.g(keyEvent);
                            if (g3 == 10) {
                                long b4 = x1o0.b(keyEvent.getKeyCode());
                                if (bdy.a(b4, bdy.f) || bdy.a(b4, bdy.H)) {
                                    keyCommand4 = KeyCommand.SELECT_LEFT_WORD;
                                } else if (bdy.a(b4, bdy.g) || bdy.a(b4, bdy.I)) {
                                    keyCommand4 = KeyCommand.SELECT_RIGHT_WORD;
                                } else if (bdy.a(b4, bdy.d) || bdy.a(b4, bdy.F)) {
                                    keyCommand4 = KeyCommand.SELECT_PREV_PARAGRAPH;
                                } else if (bdy.a(b4, bdy.e) || bdy.a(b4, bdy.G)) {
                                    keyCommand4 = KeyCommand.SELECT_NEXT_PARAGRAPH;
                                }
                            } else if (g3 == 2) {
                                long b5 = x1o0.b(keyEvent.getKeyCode());
                                if (bdy.a(b5, bdy.f) || bdy.a(b5, bdy.H)) {
                                    keyCommand4 = KeyCommand.LEFT_WORD;
                                } else if (bdy.a(b5, bdy.g) || bdy.a(b5, bdy.I)) {
                                    keyCommand4 = KeyCommand.RIGHT_WORD;
                                } else if (bdy.a(b5, bdy.d) || bdy.a(b5, bdy.F)) {
                                    keyCommand4 = KeyCommand.PREV_PARAGRAPH;
                                } else if (bdy.a(b5, bdy.e) || bdy.a(b5, bdy.G)) {
                                    keyCommand4 = KeyCommand.NEXT_PARAGRAPH;
                                } else if (bdy.a(b5, bdy.k)) {
                                    keyCommand4 = KeyCommand.DELETE_PREV_CHAR;
                                } else if (bdy.a(b5, bdy.t)) {
                                    keyCommand4 = KeyCommand.DELETE_NEXT_WORD;
                                } else if (bdy.a(b5, bdy.B)) {
                                    keyCommand4 = KeyCommand.DESELECT;
                                }
                            } else if (g3 == 8) {
                                long b6 = x1o0.b(keyEvent.getKeyCode());
                                if (bdy.a(b6, bdy.v) || bdy.a(b6, bdy.J)) {
                                    keyCommand4 = KeyCommand.SELECT_LINE_START;
                                } else if (bdy.a(b6, bdy.w) || bdy.a(b6, bdy.K)) {
                                    keyCommand4 = KeyCommand.SELECT_LINE_END;
                                }
                            } else if (g3 == 1 && bdy.a(x1o0.b(keyEvent.getKeyCode()), bdy.t)) {
                                keyCommand4 = KeyCommand.DELETE_TO_LINE_END;
                            }
                            if (keyCommand4 != null) {
                                return keyCommand4;
                            }
                            aVar.a.getClass();
                            int g4 = k7b0.g(keyEvent);
                            if (g4 == 10) {
                                if (bdy.a(x1o0.b(keyEvent.getKeyCode()), bdy.o)) {
                                    keyCommand2 = KeyCommand.REDO;
                                }
                                keyCommand2 = null;
                            } else if (g4 == 2) {
                                long b7 = x1o0.b(keyEvent.getKeyCode());
                                if (bdy.a(b7, bdy.j) || bdy.a(b7, bdy.x) || bdy.a(b7, bdy.N)) {
                                    keyCommand2 = KeyCommand.COPY;
                                } else if (bdy.a(b7, bdy.l)) {
                                    keyCommand2 = KeyCommand.PASTE;
                                } else if (bdy.a(b7, bdy.m)) {
                                    keyCommand2 = KeyCommand.CUT;
                                } else if (bdy.a(b7, bdy.i)) {
                                    keyCommand2 = KeyCommand.SELECT_ALL;
                                } else if (bdy.a(b7, bdy.n)) {
                                    keyCommand2 = KeyCommand.REDO;
                                } else {
                                    if (bdy.a(b7, bdy.o)) {
                                        keyCommand2 = KeyCommand.UNDO;
                                    }
                                    keyCommand2 = null;
                                }
                            } else if (g4 == 8) {
                                long b8 = x1o0.b(keyEvent.getKeyCode());
                                if (bdy.a(b8, bdy.f) || bdy.a(b8, bdy.H)) {
                                    keyCommand2 = KeyCommand.SELECT_LEFT_CHAR;
                                } else if (bdy.a(b8, bdy.g) || bdy.a(b8, bdy.I)) {
                                    keyCommand2 = KeyCommand.SELECT_RIGHT_CHAR;
                                } else if (bdy.a(b8, bdy.d) || bdy.a(b8, bdy.F)) {
                                    keyCommand2 = KeyCommand.SELECT_UP;
                                } else if (bdy.a(b8, bdy.e) || bdy.a(b8, bdy.G)) {
                                    keyCommand2 = KeyCommand.SELECT_DOWN;
                                } else if (bdy.a(b8, bdy.C) || bdy.a(b8, bdy.L)) {
                                    keyCommand2 = KeyCommand.SELECT_PAGE_UP;
                                } else if (bdy.a(b8, bdy.D) || bdy.a(b8, bdy.M)) {
                                    keyCommand2 = KeyCommand.SELECT_PAGE_DOWN;
                                } else if (bdy.a(b8, bdy.v) || bdy.a(b8, bdy.J)) {
                                    keyCommand2 = KeyCommand.SELECT_LINE_START;
                                } else if (bdy.a(b8, bdy.w) || bdy.a(b8, bdy.K)) {
                                    keyCommand2 = KeyCommand.SELECT_LINE_END;
                                } else {
                                    if (bdy.a(b8, bdy.x) || bdy.a(b8, bdy.N)) {
                                        keyCommand2 = KeyCommand.PASTE;
                                    }
                                    keyCommand2 = null;
                                }
                            } else {
                                if (g4 == 0) {
                                    long b9 = x1o0.b(keyEvent.getKeyCode());
                                    if (bdy.a(b9, bdy.f) || bdy.a(b9, bdy.H)) {
                                        keyCommand2 = KeyCommand.LEFT_CHAR;
                                    } else if (bdy.a(b9, bdy.g) || bdy.a(b9, bdy.I)) {
                                        keyCommand2 = KeyCommand.RIGHT_CHAR;
                                    } else if (bdy.a(b9, bdy.d) || bdy.a(b9, bdy.F)) {
                                        keyCommand2 = KeyCommand.UP;
                                    } else if (bdy.a(b9, bdy.e) || bdy.a(b9, bdy.G)) {
                                        keyCommand2 = KeyCommand.DOWN;
                                    } else if (bdy.a(b9, bdy.h)) {
                                        keyCommand2 = KeyCommand.CENTER;
                                    } else if (bdy.a(b9, bdy.C) || bdy.a(b9, bdy.L)) {
                                        keyCommand2 = KeyCommand.PAGE_UP;
                                    } else if (bdy.a(b9, bdy.D) || bdy.a(b9, bdy.M)) {
                                        keyCommand2 = KeyCommand.PAGE_DOWN;
                                    } else if (bdy.a(b9, bdy.v) || bdy.a(b9, bdy.J)) {
                                        keyCommand2 = KeyCommand.LINE_START;
                                    } else if (bdy.a(b9, bdy.w) || bdy.a(b9, bdy.K)) {
                                        keyCommand2 = KeyCommand.LINE_END;
                                    } else if (bdy.a(b9, bdy.r) || bdy.a(b9, bdy.E)) {
                                        keyCommand2 = KeyCommand.NEW_LINE;
                                    } else if (bdy.a(b9, bdy.s)) {
                                        keyCommand2 = KeyCommand.DELETE_PREV_CHAR;
                                    } else if (bdy.a(b9, bdy.t)) {
                                        keyCommand2 = KeyCommand.DELETE_NEXT_CHAR;
                                    } else if (bdy.a(b9, bdy.A)) {
                                        keyCommand2 = KeyCommand.PASTE;
                                    } else if (bdy.a(b9, bdy.y)) {
                                        keyCommand2 = KeyCommand.CUT;
                                    } else if (bdy.a(b9, bdy.z)) {
                                        keyCommand2 = KeyCommand.COPY;
                                    } else if (bdy.a(b9, bdy.p)) {
                                        keyCommand2 = KeyCommand.TAB;
                                    }
                                }
                                keyCommand2 = null;
                            }
                            return keyCommand2;
                        }
                        keyCommand = null;
                        if (keyCommand != null) {
                        }
                    }
                }
                keyCommand = KeyCommand.DELETE_PREV_CHAR;
                if (keyCommand != null) {
                }
            } else {
                if ((bdy.a(b3, bdy.r) || bdy.a(b3, bdy.E)) && (g2 == 0 || g2 == 8 || g2 == 2 || g2 == 10)) {
                    keyCommand = KeyCommand.NEW_LINE;
                    if (keyCommand != null) {
                    }
                }
                keyCommand = null;
                if (keyCommand != null) {
                }
            }
        }
    }
}
