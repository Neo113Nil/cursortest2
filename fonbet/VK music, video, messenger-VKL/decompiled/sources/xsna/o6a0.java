package xsna;

import com.vk.editor.spoiler.tool.domain.stat.SpoilerStatEvent;
import com.vk.photo.editor.features.collage.model.stat.CollageStatEvent;
import com.vk.photo.editor.features.crop.models.stat.CropStatEvent;
import com.vk.stat.scheme.MobileOfficialAppsCorePhotoEditorStat$CollageEvent;
import com.vk.stat.scheme.MobileOfficialAppsCorePhotoEditorStat$CropEvent;
import com.vk.stat.scheme.MobileOfficialAppsCorePhotoEditorStat$EditorEvent;
import com.vk.stat.scheme.MobileOfficialAppsCorePhotoEditorStat$FilterEvent;
import com.vk.stat.scheme.MobileOfficialAppsCorePhotoEditorStat$PhotoParams;
import com.vk.stat.scheme.MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem;
import java.util.LinkedHashSet;
import java.util.Map;
import xsna.xdr;

/* compiled from: PhotoEditorInternalStatTracker.kt */
/* loaded from: classes15.dex */
public final class o6a0 implements c5p {
    public final ei90 b;
    public final LinkedHashSet c = new LinkedHashSet();
    public Map<f5p, ? extends g5p> d = jgp.b;

    /* compiled from: PhotoEditorInternalStatTracker.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SpoilerStatEvent.BlurType.values().length];
            try {
                iArr[SpoilerStatEvent.BlurType.ONLY_FOR_DONUTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SpoilerStatEvent.BlurType.FOR_ALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public o6a0(ei90 ei90Var) {
        this.b = ei90Var;
    }

    public static boolean d(Map map) {
        if (map.get(y2g.a) instanceof bc0) {
            return true;
        }
        Object obj = map.get(ot20.a);
        dc0 dc0Var = obj instanceof dc0 ? (dc0) obj : null;
        if (dc0Var != null) {
            return d(dc0Var.a);
        }
        return false;
    }

    public static void e(o6a0 o6a0Var, MobileOfficialAppsCorePhotoEditorStat$CollageEvent mobileOfficialAppsCorePhotoEditorStat$CollageEvent, String str, CollageStatEvent.Format format, int i) {
        String str2 = (i & 2) != 0 ? null : str;
        CollageStatEvent.Format format2 = (i & 4) != 0 ? null : format;
        o6a0Var.getClass();
        ksk0.b(new lh40(o6a0Var, format2, str2, mobileOfficialAppsCorePhotoEditorStat$CollageEvent, 1));
    }

    public static void g(o6a0 o6a0Var, MobileOfficialAppsCorePhotoEditorStat$CropEvent mobileOfficialAppsCorePhotoEditorStat$CropEvent, CropStatEvent.j jVar, CropStatEvent.c cVar, int i) {
        CropStatEvent.j jVar2 = (i & 2) != 0 ? null : jVar;
        CropStatEvent.c cVar2 = (i & 4) != 0 ? null : cVar;
        o6a0Var.getClass();
        ksk0.b(new pac(o6a0Var, jVar2, cVar2, mobileOfficialAppsCorePhotoEditorStat$CropEvent, 1));
    }

    public static void h(final o6a0 o6a0Var, final MobileOfficialAppsCorePhotoEditorStat$FilterEvent mobileOfficialAppsCorePhotoEditorStat$FilterEvent, final xdr.e eVar, final xdr.c cVar, final xdr.a aVar, int i) {
        if ((i & 2) != 0) {
            eVar = null;
        }
        if ((i & 4) != 0) {
            cVar = null;
        }
        if ((i & 8) != 0) {
            aVar = null;
        }
        ksk0.b(new gzs() { // from class: xsna.n6a0
            /* JADX WARN: Removed duplicated region for block: B:11:0x0047  */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0055  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0039  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x003f  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x003c  */
            @Override // xsna.gzs
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                String str;
                String str2;
                String str3;
                String str4;
                Integer num;
                Integer num2;
                o6a0 o6a0Var2 = o6a0.this;
                MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem.MediaType c = o6a0Var2.c();
                String a2 = o6a0Var2.b.a();
                xdr.e eVar2 = eVar;
                xdr.c cVar2 = cVar;
                xdr.a aVar2 = aVar;
                if (eVar2 == null || (str = eVar2.a) == null) {
                    str = cVar2 != null ? cVar2.a : null;
                    if (str == null) {
                        if (aVar2 == null) {
                            str2 = null;
                            if (eVar2 != null || (str3 = eVar2.b) == null) {
                                str3 = cVar2 == null ? cVar2.b : null;
                                if (str3 == null) {
                                    if (aVar2 == null) {
                                        str4 = null;
                                        if (eVar2 != null || (num = eVar2.c) == null) {
                                            num = cVar2 != null ? cVar2.c : null;
                                            if (num == null) {
                                                if (aVar2 == null) {
                                                    num2 = null;
                                                    return new MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem(c, a2, null, null, null, null, mobileOfficialAppsCorePhotoEditorStat$FilterEvent, null, null, null, null, null, null, null, null, new MobileOfficialAppsCorePhotoEditorStat$PhotoParams(null, null, null, null, null, null, null, null, str2, str4, num2, eVar2 != null ? Integer.valueOf(eVar2.d) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2147479807, null), 32696, null);
                                                }
                                                num = aVar2.c;
                                            }
                                        }
                                        num2 = num;
                                        return new MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem(c, a2, null, null, null, null, mobileOfficialAppsCorePhotoEditorStat$FilterEvent, null, null, null, null, null, null, null, null, new MobileOfficialAppsCorePhotoEditorStat$PhotoParams(null, null, null, null, null, null, null, null, str2, str4, num2, eVar2 != null ? Integer.valueOf(eVar2.d) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2147479807, null), 32696, null);
                                    }
                                    str3 = aVar2.b;
                                }
                            }
                            str4 = str3;
                            if (eVar2 != null) {
                            }
                            if (cVar2 != null) {
                            }
                            if (num == null) {
                            }
                            num2 = num;
                            return new MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem(c, a2, null, null, null, null, mobileOfficialAppsCorePhotoEditorStat$FilterEvent, null, null, null, null, null, null, null, null, new MobileOfficialAppsCorePhotoEditorStat$PhotoParams(null, null, null, null, null, null, null, null, str2, str4, num2, eVar2 != null ? Integer.valueOf(eVar2.d) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2147479807, null), 32696, null);
                        }
                        str = aVar2.a;
                    }
                }
                str2 = str;
                if (eVar2 != null) {
                }
                if (cVar2 == null) {
                }
                if (str3 == null) {
                }
                str4 = str3;
                if (eVar2 != null) {
                }
                if (cVar2 != null) {
                }
                if (num == null) {
                }
                num2 = num;
                return new MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem(c, a2, null, null, null, null, mobileOfficialAppsCorePhotoEditorStat$FilterEvent, null, null, null, null, null, null, null, null, new MobileOfficialAppsCorePhotoEditorStat$PhotoParams(null, null, null, null, null, null, null, null, str2, str4, num2, eVar2 != null ? Integer.valueOf(eVar2.d) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2147479807, null), 32696, null);
            }
        });
    }

    @Override // xsna.c5p
    public final void a(Map<f5p, ? extends g5p> map) {
        this.d = map;
    }

    @Override // xsna.c5p
    public final void b(srk0 srk0Var) {
        ksk0.a(new com.vk.movika.sdk.base.flow.binding.l(14, srk0Var, this));
    }

    public final MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem.MediaType c() {
        return d(this.d) ? MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem.MediaType.COLLAGE : MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem.MediaType.PHOTO;
    }

    public final void f(MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem.ColorGradingEvent colorGradingEvent) {
        ksk0.b(new dp0(14, this, colorGradingEvent));
    }

    public final void i(MobileOfficialAppsCorePhotoEditorStat$EditorEvent mobileOfficialAppsCorePhotoEditorStat$EditorEvent) {
        ksk0.b(new com.vk.movika.sdk.base.ui.i(23, this, mobileOfficialAppsCorePhotoEditorStat$EditorEvent));
    }
}
