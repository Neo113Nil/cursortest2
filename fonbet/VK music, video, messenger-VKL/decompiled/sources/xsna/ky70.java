package xsna;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import one.video.player.OneVideoPlayer;
import one.video.player.model.VideoContentType;
import ru.ok.tracer.base.deviceid.DeviceIdUtils;
import xsna.nza0;

/* compiled from: OkHttpPixelSender.kt */
/* loaded from: classes8.dex */
public final class ky70 {
    public static final Pattern i = Pattern.compile("\\{@(\\w+)\\}");
    public final ry70 a;
    public final nza0.b b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Random h = new Random();

    public ky70(ry70 ry70Var, nza0.b bVar, String str, String str2, String str3, String str4, String str5) {
        this.a = ry70Var;
        this.b = bVar;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x003e. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01c9 A[LOOP:2: B:16:0x002f->B:28:0x01c9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01cd A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(zpa0 zpa0Var, long j) {
        String str;
        Matcher matcher;
        int groupCount;
        String group;
        String y;
        String encode;
        Uri uri;
        for (String str2 : zpa0Var.a) {
            try {
                matcher = i.matcher(str2);
                str = str2;
            } catch (PatternSyntaxException e) {
                e = e;
                str = str2;
            }
            while (matcher.find()) {
                try {
                    groupCount = matcher.groupCount();
                } catch (PatternSyntaxException e2) {
                    e = e2;
                }
                if (1 <= groupCount) {
                    String str3 = str;
                    int i2 = 1;
                    while (true) {
                        try {
                            group = matcher.group(i2);
                        } catch (PatternSyntaxException e3) {
                            e = e3;
                            str = str3;
                            Log.e("OkHttpPixelSender", "", e);
                            this.a.a(str, new fe60(zpa0Var, str2), new pu50(this, zpa0Var));
                        }
                        if (group != null) {
                            int hashCode = group.hashCode();
                            Long l = null;
                            r12 = null;
                            String str4 = null;
                            l = null;
                            nza0.b bVar = this.b;
                            switch (hashCode) {
                                case -1616872557:
                                    if (!group.equals("andr_ad_uuid")) {
                                        break;
                                    } else {
                                        String str5 = this.e;
                                        if (TextUtils.isEmpty(str5) || str5 == null) {
                                            str5 = DeviceIdUtils.NULL_UUID;
                                        }
                                        y = brm0.y(str3, "{@andr_ad_uuid}", str5);
                                        str3 = y;
                                        if (i2 != groupCount) {
                                            str = str3;
                                            break;
                                        } else {
                                            i2++;
                                        }
                                    }
                                case -1535997044:
                                    if (!group.equals("dvc_mnfc")) {
                                        break;
                                    } else {
                                        y = brm0.y(str3, "{@dvc_mnfc}", this.f);
                                        str3 = y;
                                        if (i2 != groupCount) {
                                        }
                                    }
                                    break;
                                case -1411074055:
                                    if (!group.equals("app_id")) {
                                        break;
                                    } else {
                                        y = brm0.y(str3, "{@app_id}", this.d);
                                        str3 = y;
                                        if (i2 != groupCount) {
                                        }
                                    }
                                    break;
                                case -1320032759:
                                    if (!group.equals("dvc_id")) {
                                        break;
                                    } else {
                                        y = brm0.y(str3, "{@dvc_id}", this.c);
                                        str3 = y;
                                        if (i2 != groupCount) {
                                        }
                                    }
                                    break;
                                case -1165412001:
                                    if (!group.equals("tns_fts")) {
                                        break;
                                    } else {
                                        OneVideoPlayer oneVideoPlayer = bVar.a;
                                        if (oneVideoPlayer != null) {
                                            long l0 = oneVideoPlayer.l0();
                                            Long valueOf = Long.valueOf(l0);
                                            if (l0 > 0) {
                                                sht0 j2 = oneVideoPlayer.j();
                                                if ((j2 != null ? j2.a : null) == VideoContentType.HLS) {
                                                    l = valueOf;
                                                }
                                            }
                                            if (l != null) {
                                                str3 = brm0.y(str3, "{@tns_fts}", String.valueOf(l.longValue() / 1000));
                                            }
                                        }
                                        if (i2 != groupCount) {
                                        }
                                    }
                                    break;
                                case -120897738:
                                    if (!group.equals("utc_sec")) {
                                        break;
                                    } else {
                                        y = brm0.y(str3, "{@utc_sec}", String.valueOf(System.currentTimeMillis() / 1000));
                                        str3 = y;
                                        if (i2 != groupCount) {
                                        }
                                    }
                                    break;
                                case 102225:
                                    if (!group.equals("geo")) {
                                        break;
                                    } else {
                                        y = brm0.y(str3, "{@geo}", "");
                                        str3 = y;
                                        if (i2 != groupCount) {
                                        }
                                    }
                                    break;
                                case 111096:
                                    if (!group.equals("plt")) {
                                        break;
                                    } else {
                                        y = brm0.y(str3, "{@plt}", MBridgeConstans.DYNAMIC_VIEW_WX_APP);
                                        str3 = y;
                                        if (i2 != groupCount) {
                                        }
                                    }
                                    break;
                                case 116079:
                                    if (!group.equals("url")) {
                                        break;
                                    } else {
                                        OneVideoPlayer oneVideoPlayer2 = bVar.a;
                                        if (oneVideoPlayer2 != null) {
                                            sht0 j3 = oneVideoPlayer2.j();
                                            if (j3 != null && (uri = j3.b) != null) {
                                                str4 = uri.toString();
                                            }
                                            if (str4 != null) {
                                                try {
                                                    encode = URLEncoder.encode(str4, C.UTF8_NAME);
                                                } catch (UnsupportedEncodingException e4) {
                                                    e4.printStackTrace();
                                                }
                                                str3 = brm0.y(str3, "{@url}", encode);
                                            }
                                            encode = "";
                                            str3 = brm0.y(str3, "{@url}", encode);
                                        }
                                        if (i2 != groupCount) {
                                        }
                                    }
                                    break;
                                case 95477450:
                                    if (!group.equals("dev_t")) {
                                        break;
                                    } else {
                                        y = brm0.y(str3, "{@dev_t}", "3");
                                        str3 = y;
                                        if (i2 != groupCount) {
                                        }
                                    }
                                    break;
                                case 108656230:
                                    if (group.equals("rnd64")) {
                                        y = brm0.y(str3, "{@rnd64}", String.valueOf(this.h.nextLong()));
                                        str3 = y;
                                        if (i2 != groupCount) {
                                        }
                                    }
                                    break;
                                case 1980954113:
                                    if (!group.equals("fts_fake_sec")) {
                                        break;
                                    } else {
                                        y = brm0.y(str3, "{@fts_fake_sec}", String.valueOf(j));
                                        str3 = y;
                                        if (i2 != groupCount) {
                                        }
                                    }
                                    break;
                                case 2028661383:
                                    if (!group.equals("dvc_mdl")) {
                                        break;
                                    } else {
                                        y = brm0.y(str3, "{@dvc_mdl}", this.g);
                                        str3 = y;
                                        if (i2 != groupCount) {
                                        }
                                    }
                                    break;
                            }
                            this.a.a(str, new fe60(zpa0Var, str2), new pu50(this, zpa0Var));
                        }
                        y = brm0.y(str3, "{@" + group + "}", "");
                        str3 = y;
                        if (i2 != groupCount) {
                        }
                    }
                }
            }
            this.a.a(str, new fe60(zpa0Var, str2), new pu50(this, zpa0Var));
        }
    }
}
