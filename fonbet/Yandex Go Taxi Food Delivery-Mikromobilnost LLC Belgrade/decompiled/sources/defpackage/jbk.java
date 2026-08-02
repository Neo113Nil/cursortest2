package defpackage;

import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class jbk implements c4x {
    public Integer a;

    public final boolean a(jbk jbkVar, rvo rvoVar, rvo rvoVar2) {
        c4x c4xVar;
        c4x c4xVar2;
        if (jbkVar != null) {
            if (this instanceof mak) {
                y3k d = ((mak) this).d();
                Object c = jbkVar.c();
                return d.a(c instanceof y3k ? (y3k) c : null, rvoVar, rvoVar2);
            }
            if (this instanceof nak) {
                e4k d2 = ((nak) this).d();
                Object c2 = jbkVar.c();
                return d2.a(c2 instanceof e4k ? (e4k) c2 : null);
            }
            if (this instanceof oak) {
                j4k d3 = ((oak) this).d();
                Object c3 = jbkVar.c();
                return d3.a(c3 instanceof j4k ? (j4k) c3 : null, rvoVar, rvoVar2);
            }
            if (this instanceof pak) {
                o4k d4 = ((pak) this).d();
                Object c4 = jbkVar.c();
                return d4.a(c4 instanceof o4k ? (o4k) c4 : null, rvoVar, rvoVar2);
            }
            if (this instanceof qak) {
                t4k d5 = ((qak) this).d();
                Object c5 = jbkVar.c();
                return d5.a(c5 instanceof t4k ? (t4k) c5 : null, rvoVar, rvoVar2);
            }
            if (this instanceof rak) {
                Object c6 = jbkVar.c();
                return h5k.a(c6 instanceof h5k ? (h5k) c6 : null);
            }
            if (!(this instanceof sak)) {
                if (this instanceof uak) {
                    f6k d6 = ((uak) this).d();
                    Object c7 = jbkVar.c();
                    return d6.a(c7 instanceof f6k ? (f6k) c7 : null, rvoVar, rvoVar2);
                }
                if (this instanceof vak) {
                    k6k d7 = ((vak) this).d();
                    Object c8 = jbkVar.c();
                    return d7.a(c8 instanceof k6k ? (k6k) c8 : null, rvoVar, rvoVar2);
                }
                if (this instanceof wak) {
                    r6k d8 = ((wak) this).d();
                    Object c9 = jbkVar.c();
                    return d8.a(c9 instanceof r6k ? (r6k) c9 : null, rvoVar, rvoVar2);
                }
                if (this instanceof xak) {
                    a7k d9 = ((xak) this).d();
                    Object c10 = jbkVar.c();
                    return d9.a(c10 instanceof a7k ? (a7k) c10 : null, rvoVar, rvoVar2);
                }
                if (this instanceof yak) {
                    l7k d10 = ((yak) this).d();
                    Object c11 = jbkVar.c();
                    return d10.a(c11 instanceof l7k ? (l7k) c11 : null, rvoVar, rvoVar2);
                }
                if (this instanceof zak) {
                    f8k d11 = ((zak) this).d();
                    Object c12 = jbkVar.c();
                    return d11.a(c12 instanceof f8k ? (f8k) c12 : null, rvoVar, rvoVar2);
                }
                if (this instanceof bbk) {
                    u8k d12 = ((bbk) this).d();
                    Object c13 = jbkVar.c();
                    return d12.a(c13 instanceof u8k ? (u8k) c13 : null, rvoVar, rvoVar2);
                }
                if (this instanceof cbk) {
                    b9k d13 = ((cbk) this).d();
                    Object c14 = jbkVar.c();
                    return d13.a(c14 instanceof b9k ? (b9k) c14 : null, rvoVar, rvoVar2);
                }
                if (this instanceof dbk) {
                    g9k d14 = ((dbk) this).d();
                    Object c15 = jbkVar.c();
                    return d14.a(c15 instanceof g9k ? (g9k) c15 : null, rvoVar, rvoVar2);
                }
                if (this instanceof ebk) {
                    l9k d15 = ((ebk) this).d();
                    Object c16 = jbkVar.c();
                    return d15.a(c16 instanceof l9k ? (l9k) c16 : null, rvoVar, rvoVar2);
                }
                if (this instanceof fbk) {
                    t9k d16 = ((fbk) this).d();
                    Object c17 = jbkVar.c();
                    return d16.a(c17 instanceof t9k ? (t9k) c17 : null, rvoVar, rvoVar2);
                }
                if (this instanceof gbk) {
                    hak d17 = ((gbk) this).d();
                    Object c18 = jbkVar.c();
                    return d17.a(c18 instanceof hak ? (hak) c18 : null, rvoVar, rvoVar2);
                }
                if (this instanceof hbk) {
                    zck d18 = ((hbk) this).d();
                    Object c19 = jbkVar.c();
                    return d18.a(c19 instanceof zck ? (zck) c19 : null, rvoVar, rvoVar2);
                }
                if (this instanceof ibk) {
                    fdk d19 = ((ibk) this).d();
                    Object c20 = jbkVar.c();
                    return d19.a(c20 instanceof fdk ? (fdk) c20 : null, rvoVar, rvoVar2);
                }
                if (this instanceof tak) {
                    Object c21 = jbkVar.c();
                    return a6k.a(c21 instanceof a6k ? (a6k) c21 : null);
                }
                if (!(this instanceof abk)) {
                    w511.b();
                    return false;
                }
                m8k d20 = ((abk) this).d();
                Object c22 = jbkVar.c();
                return d20.a(c22 instanceof m8k ? (m8k) c22 : null, rvoVar, rvoVar2);
            }
            sak sakVar = (sak) this;
            Object c23 = jbkVar.c();
            m5k m5kVar = c23 instanceof m5k ? (m5k) c23 : null;
            if (m5kVar != null) {
                p5k p5kVar = sakVar.b.a;
                p5k p5kVar2 = m5kVar.a;
                p5kVar.getClass();
                if (p5kVar2 != null) {
                    if (!(p5kVar instanceof n5k)) {
                        if (!(p5kVar instanceof o5k)) {
                            w511.b();
                            return false;
                        }
                        sie a = ((o5k) p5kVar).a();
                        if (p5kVar2 instanceof n5k) {
                            c4xVar = ((n5k) p5kVar2).b;
                        } else {
                            if (!(p5kVar2 instanceof o5k)) {
                                w511.b();
                                return false;
                            }
                            c4xVar = ((o5k) p5kVar2).a();
                        }
                        return a.a(c4xVar instanceof sie ? (sie) c4xVar : null, rvoVar, rvoVar2);
                    }
                    uhe uheVar = ((n5k) p5kVar).b;
                    if (p5kVar2 instanceof n5k) {
                        c4xVar2 = ((n5k) p5kVar2).b;
                    } else {
                        if (!(p5kVar2 instanceof o5k)) {
                            w511.b();
                            return false;
                        }
                        c4xVar2 = ((o5k) p5kVar2).a();
                    }
                    uhe uheVar2 = c4xVar2 instanceof uhe ? (uhe) c4xVar2 : null;
                    if (uheVar2 != null) {
                        return jl40.l(uheVar.a.a(rvoVar), uheVar2.a.a(rvoVar2));
                    }
                }
            }
        }
        return false;
    }

    public final int b() {
        int b;
        int b2;
        Integer num = this.a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = qoi0.a(getClass()).hashCode();
        if (this instanceof mak) {
            b = ((mak) this).d().b();
        } else if (this instanceof nak) {
            b = ((nak) this).d().b();
        } else if (this instanceof oak) {
            b = ((oak) this).d().b();
        } else if (this instanceof pak) {
            b = ((pak) this).d().b();
        } else if (this instanceof qak) {
            b = ((qak) this).d().b();
        } else if (this instanceof rak) {
            b = ((rak) this).d().b();
        } else {
            int i = 0;
            if (this instanceof sak) {
                m5k m5kVar = ((sak) this).b;
                Integer num2 = m5kVar.b;
                if (num2 != null) {
                    b = num2.intValue();
                } else {
                    int hashCode2 = qoi0.a(m5k.class).hashCode();
                    p5k p5kVar = m5kVar.a;
                    Integer num3 = p5kVar.a;
                    if (num3 != null) {
                        i = num3.intValue();
                    } else {
                        int hashCode3 = qoi0.a(p5kVar.getClass()).hashCode();
                        if (p5kVar instanceof n5k) {
                            uhe uheVar = ((n5k) p5kVar).b;
                            Integer num4 = uheVar.b;
                            if (num4 != null) {
                                b2 = num4.intValue();
                            } else {
                                int hashCode4 = qoi0.a(uhe.class).hashCode() + uheVar.a.hashCode();
                                uheVar.b = Integer.valueOf(hashCode4);
                                b2 = hashCode4;
                            }
                        } else if (p5kVar instanceof o5k) {
                            b2 = ((o5k) p5kVar).a().b();
                        } else {
                            w511.b();
                        }
                        i = b2 + hashCode3;
                        p5kVar.a = Integer.valueOf(i);
                    }
                    int i2 = i + hashCode2;
                    m5kVar.b = Integer.valueOf(i2);
                    b = i2;
                }
            } else if (this instanceof uak) {
                b = ((uak) this).d().b();
            } else if (this instanceof vak) {
                b = ((vak) this).d().b();
            } else if (this instanceof wak) {
                b = ((wak) this).d().b();
            } else if (this instanceof xak) {
                b = ((xak) this).d().b();
            } else if (this instanceof yak) {
                b = ((yak) this).d().b();
            } else if (this instanceof zak) {
                b = ((zak) this).d().b();
            } else if (this instanceof bbk) {
                b = ((bbk) this).d().b();
            } else if (this instanceof cbk) {
                b = ((cbk) this).d().b();
            } else if (this instanceof dbk) {
                b = ((dbk) this).d().b();
            } else if (this instanceof ebk) {
                b = ((ebk) this).d().b();
            } else if (this instanceof fbk) {
                b = ((fbk) this).d().b();
            } else if (this instanceof gbk) {
                b = ((gbk) this).d().b();
            } else if (this instanceof hbk) {
                b = ((hbk) this).d().b();
            } else if (this instanceof ibk) {
                b = ((ibk) this).d().b();
            } else if (this instanceof tak) {
                b = ((tak) this).b.b();
            } else {
                if (!(this instanceof abk)) {
                    w511.b();
                    return 0;
                }
                b = ((abk) this).d().b();
            }
        }
        int i3 = hashCode + b;
        this.a = Integer.valueOf(i3);
        return i3;
    }

    public final Object c() {
        if (this instanceof mak) {
            return ((mak) this).d();
        }
        if (this instanceof nak) {
            return ((nak) this).d();
        }
        if (this instanceof oak) {
            return ((oak) this).d();
        }
        if (this instanceof pak) {
            return ((pak) this).d();
        }
        if (this instanceof qak) {
            return ((qak) this).d();
        }
        if (this instanceof rak) {
            return ((rak) this).d();
        }
        if (this instanceof sak) {
            return ((sak) this).b;
        }
        if (this instanceof uak) {
            return ((uak) this).d();
        }
        if (this instanceof vak) {
            return ((vak) this).d();
        }
        if (this instanceof wak) {
            return ((wak) this).d();
        }
        if (this instanceof xak) {
            return ((xak) this).d();
        }
        if (this instanceof yak) {
            return ((yak) this).d();
        }
        if (this instanceof zak) {
            return ((zak) this).d();
        }
        if (this instanceof bbk) {
            return ((bbk) this).d();
        }
        if (this instanceof cbk) {
            return ((cbk) this).d();
        }
        if (this instanceof dbk) {
            return ((dbk) this).d();
        }
        if (this instanceof ebk) {
            return ((ebk) this).d();
        }
        if (this instanceof fbk) {
            return ((fbk) this).d();
        }
        if (this instanceof gbk) {
            return ((gbk) this).d();
        }
        if (this instanceof hbk) {
            return ((hbk) this).d();
        }
        if (this instanceof ibk) {
            return ((ibk) this).d();
        }
        if (this instanceof tak) {
            return ((tak) this).b;
        }
        if (this instanceof abk) {
            return ((abk) this).d();
        }
        w511.b();
        return null;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((qbk) ft6.b.k1.getValue()).b(ft6.a, this);
    }
}
