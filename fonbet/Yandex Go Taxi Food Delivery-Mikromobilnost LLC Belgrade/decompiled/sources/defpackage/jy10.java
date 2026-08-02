package defpackage;

import io.flutter.plugins.videoplayer.PlatformPlaybackState;
import io.flutter.plugins.videoplayer.PlatformVideoFormat;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes4.dex */
public class jy10 extends vzt0 {
    @Override // defpackage.vzt0
    public final Object f(byte b, ByteBuffer byteBuffer) {
        int i = 0;
        if (b == -127) {
            Long l = (Long) e(byteBuffer);
            if (l != null) {
                int longValue = (int) l.longValue();
                PlatformVideoFormat.Companion.getClass();
                PlatformVideoFormat[] values = PlatformVideoFormat.values();
                int length = values.length;
                while (i < length) {
                    PlatformVideoFormat platformVideoFormat = values[i];
                    if (platformVideoFormat.getRaw() == longValue) {
                        return platformVideoFormat;
                    }
                    i++;
                }
            }
        } else if (b == -126) {
            Long l2 = (Long) e(byteBuffer);
            if (l2 != null) {
                int longValue2 = (int) l2.longValue();
                PlatformPlaybackState.Companion.getClass();
                PlatformPlaybackState[] values2 = PlatformPlaybackState.values();
                int length2 = values2.length;
                while (i < length2) {
                    PlatformPlaybackState platformPlaybackState = values2[i];
                    if (platformPlaybackState.getRaw() == longValue2) {
                        return platformPlaybackState;
                    }
                    i++;
                }
            }
        } else if (b == -125) {
            Object e = e(byteBuffer);
            List list = e instanceof List ? (List) e : null;
            if (list != null) {
                return new vwv(((Long) list.get(0)).longValue(), ((Long) list.get(1)).longValue(), ((Long) list.get(2)).longValue(), ((Long) list.get(3)).longValue());
            }
        } else if (b == -124) {
            Object e2 = e(byteBuffer);
            List list2 = e2 instanceof List ? (List) e2 : null;
            if (list2 != null) {
                return new mxc0((PlatformPlaybackState) list2.get(0));
            }
        } else if (b == -123) {
            Object e3 = e(byteBuffer);
            List list3 = e3 instanceof List ? (List) e3 : null;
            if (list3 != null) {
                return new yyw(((Boolean) list3.get(0)).booleanValue());
            }
        } else if (b == -122) {
            Object e4 = e(byteBuffer);
            List list4 = e4 instanceof List ? (List) e4 : null;
            if (list4 != null) {
                return new pwc0(((Long) list4.get(0)).longValue());
            }
        } else if (b == -121) {
            Object e5 = e(byteBuffer);
            List list5 = e5 instanceof List ? (List) e5 : null;
            if (list5 != null) {
                return new z8f((String) list5.get(0), (PlatformVideoFormat) list5.get(1), (Map) list5.get(2), (String) list5.get(3));
            }
        } else {
            if (b != -120) {
                return super.f(b, byteBuffer);
            }
            Object e6 = e(byteBuffer);
            List list6 = e6 instanceof List ? (List) e6 : null;
            if (list6 != null) {
                return new tuy0(((Long) list6.get(0)).longValue(), ((Long) list6.get(1)).longValue());
            }
        }
        return null;
    }

    @Override // defpackage.vzt0
    public final void k(ckn cknVar, Object obj) {
        if (obj instanceof PlatformVideoFormat) {
            cknVar.write(HProv.PP_SECURITY_LEVEL);
            k(cknVar, Long.valueOf(((PlatformVideoFormat) obj).getRaw()));
            return;
        }
        if (obj instanceof PlatformPlaybackState) {
            cknVar.write(130);
            k(cknVar, Long.valueOf(((PlatformPlaybackState) obj).getRaw()));
            return;
        }
        if (obj instanceof vwv) {
            cknVar.write(HProv.PP_FAST_CODE);
            k(cknVar, ((vwv) obj).a());
            return;
        }
        if (obj instanceof mxc0) {
            cknVar.write(HProv.PP_CONTAINER_EXTENSION);
            k(cknVar, Collections.singletonList(((mxc0) obj).a));
            return;
        }
        if (obj instanceof yyw) {
            cknVar.write(HProv.PP_ENUM_CONTAINER_EXTENSION);
            k(cknVar, Collections.singletonList(Boolean.valueOf(((yyw) obj).a)));
            return;
        }
        if (obj instanceof pwc0) {
            cknVar.write(HProv.PP_CONTAINER_EXTENSION_DEL);
            k(cknVar, Collections.singletonList(Long.valueOf(((pwc0) obj).a)));
        } else if (obj instanceof z8f) {
            cknVar.write(HProv.PP_CONTAINER_DEFAULT);
            k(cknVar, ((z8f) obj).a());
        } else if (!(obj instanceof tuy0)) {
            super.k(cknVar, obj);
        } else {
            cknVar.write(HProv.PP_LCD_QUERY);
            k(cknVar, ((tuy0) obj).a());
        }
    }
}
