package xsna;

import android.graphics.Color;
import com.vk.api.generated.base.dto.BaseGradientPointDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.polls.dto.PollsBackgroundDto;
import com.vk.dto.common.ImageSize;
import com.vk.dto.polls.GradientPoint;
import com.vk.dto.polls.PhotoPoll;
import com.vk.dto.polls.PollBackground;
import com.vk.dto.polls.PollContentColor;
import com.vk.dto.polls.PollGradient;
import com.vk.dto.polls.PollTile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.EmptyList;

/* compiled from: PollsBackgroundDtoToPollBackgroundMapper.kt */
/* loaded from: classes3.dex */
public final class stb0 {

    /* compiled from: PollsBackgroundDtoToPollBackgroundMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PollsBackgroundDto.TypeDto.values().length];
            try {
                iArr[PollsBackgroundDto.TypeDto.GRADIENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PollsBackgroundDto.TypeDto.TILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PollsBackgroundDto.TypeDto.COLOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static ArrayList a(List list) {
        if (list == null) {
            list = EmptyList.b;
        }
        List<BaseImageDto> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (BaseImageDto baseImageDto : list2) {
            arrayList.add(new ImageSize(baseImageDto.getUrl(), baseImageDto.getWidth(), baseImageDto.getHeight(), baseImageDto.e(), (char) 0, false, 48, null));
        }
        return arrayList;
    }

    public static PollBackground b(PollsBackgroundDto pollsBackgroundDto, PollsBackgroundDto pollsBackgroundDto2) {
        String name;
        if (pollsBackgroundDto != null) {
            Integer g = pollsBackgroundDto.g();
            if (g != null) {
                int intValue = g.intValue();
                String e = pollsBackgroundDto.e();
                if (e != null) {
                    return new PhotoPoll(intValue, Color.parseColor("#".concat(e)), a(pollsBackgroundDto.i()));
                }
            }
        } else if (pollsBackgroundDto2 != null) {
            PollsBackgroundDto.TypeDto n = pollsBackgroundDto2.n();
            int i = n == null ? -1 : a.$EnumSwitchMapping$0[n.ordinal()];
            if (i == 1) {
                Integer g2 = pollsBackgroundDto2.g();
                if (g2 != null) {
                    int intValue2 = g2.intValue();
                    String e2 = pollsBackgroundDto2.e();
                    if (e2 != null) {
                        int parseColor = Color.parseColor("#".concat(e2));
                        Integer d = pollsBackgroundDto2.d();
                        int intValue3 = d != null ? d.intValue() : 0;
                        String j = pollsBackgroundDto2.j();
                        List<BaseGradientPointDto> k = pollsBackgroundDto2.k();
                        if (k == null) {
                            k = EmptyList.b;
                        }
                        ArrayList arrayList = new ArrayList();
                        Iterator<T> it = k.iterator();
                        while (it.hasNext()) {
                            String d2 = ((BaseGradientPointDto) it.next()).d();
                            GradientPoint gradientPoint = d2 == null ? null : new GradientPoint(Color.parseColor("#".concat(d2)), r11.e());
                            if (gradientPoint != null) {
                                arrayList.add(gradientPoint);
                            }
                        }
                        return new PollGradient(intValue2, parseColor, intValue3, arrayList, j);
                    }
                }
            } else if (i == 2) {
                Integer g3 = pollsBackgroundDto2.g();
                if (g3 != null) {
                    int intValue4 = g3.intValue();
                    String e3 = pollsBackgroundDto2.e();
                    if (e3 != null) {
                        int parseColor2 = Color.parseColor("#".concat(e3));
                        Integer o = pollsBackgroundDto2.o();
                        int intValue5 = o != null ? o.intValue() : 0;
                        Integer f = pollsBackgroundDto2.f();
                        return new PollTile(intValue4, parseColor2, intValue5, f != null ? f.intValue() : 0, a(pollsBackgroundDto2.i()));
                    }
                }
            } else {
                if (i != 3) {
                    throw new IllegalArgumentException("Illegal poll background type = " + pollsBackgroundDto2.n());
                }
                Integer g4 = pollsBackgroundDto2.g();
                if (g4 != null) {
                    int intValue6 = g4.intValue();
                    String e4 = pollsBackgroundDto2.e();
                    if (e4 == null) {
                        e4 = "9999ff";
                    }
                    int parseColor3 = Color.parseColor("#".concat(e4));
                    PollsBackgroundDto.StyleDto l = pollsBackgroundDto2.l();
                    if (l != null && (name = l.name()) != null) {
                        return new PollContentColor(intValue6, parseColor3, name.toLowerCase(Locale.getDefault()));
                    }
                }
            }
        }
        return null;
    }
}
