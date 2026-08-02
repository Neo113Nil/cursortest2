package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.catalog2.common.dto.api.sport.CatalogSportMatch;
import com.vk.catalog2.common.dto.api.sport.CatalogSportsMatchResult;
import com.vk.catalog2.common.dto.api.sport.CatalogSportsMatchResultTeam;
import com.vk.catalog2.common.dto.api.sport.CatalogSportsMatchResultTeamScore;
import com.vk.catalog2.common.dto.api.sport.CatalogSportsMatchTeam;
import com.vk.catalog2.common.dto.ui.UIBlockSportMatch;
import com.vk.common.links.LaunchContext;
import com.vk.core.view.components.cell.VkMiniInfoCell;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.text.VkText;
import com.vk.core.view.components.tile.VkTile;
import com.vk.core.view.components.tile.VkTileImageView;
import com.vkontakte.android.R;
import xsna.e3m;
import xsna.qhv0;
import xsna.tlo0;

/* compiled from: CatalogSportWidget.kt */
/* loaded from: classes16.dex */
public final class bha extends ConstraintLayout {
    public final VkText A;
    public final VkTile B;
    public final VkTile C;
    public UIBlockSportMatch D;
    public b5a E;
    public final bpn0 t;
    public final VkMiniInfoCell u;
    public final VkText v;
    public final VkText w;
    public final VkImage x;
    public final VkText y;
    public final VkImage z;

    /* compiled from: CatalogSportWidget.kt */
    public static final class a implements VkTileImageView.b {
        public final VkImage a;

        public a(Context context) {
            VkImage vkImage = new VkImage(context, null, 6, 0);
            vkImage.setVkScaleType(qhv0.e.a);
            this.a = vkImage;
        }

        @Override // com.vk.core.view.components.tile.VkTileImageView.b
        public final void a(VkTileImageView.c cVar) {
            if (cVar instanceof b) {
                this.a.o0(((b) cVar).a, null);
            }
        }

        @Override // com.vk.core.view.components.tile.VkTileImageView.b
        public final View getView() {
            return this.a;
        }
    }

    /* compiled from: CatalogSportWidget.kt */
    public static final class b implements VkTileImageView.c {
        public final String a;

        public b(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("TeamImageParams(url="), this.a, ')');
        }
    }

    /* compiled from: CatalogSportWidget.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[CatalogSportMatch.Status.values().length];
            try {
                iArr[CatalogSportMatch.Status.Planned.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogSportMatch.Status.Canceled.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogSportMatch.Status.Finished.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CatalogSportMatch.Status.Result.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CatalogSportMatch.Status.InProgress.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CatalogSportMatch.SportsType.values().length];
            try {
                iArr2[CatalogSportMatch.SportsType.Football.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CatalogSportMatch.SportsType.Basketball.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[CatalogSportMatch.SportsType.Hockey.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[CatalogSportMatch.SportsType.Tennis.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[CatalogSportsMatchResult.Stage.values().length];
            try {
                iArr3[CatalogSportsMatchResult.Stage.NotStarted.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[CatalogSportsMatchResult.Stage.Postponed.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[CatalogSportsMatchResult.Stage.Suspended.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[CatalogSportsMatchResult.Stage.NotInfoYet.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[CatalogSportsMatchResult.Stage.AwardedWin.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[CatalogSportsMatchResult.Stage.Canceled.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[CatalogSportsMatchResult.Stage.FirstHalf.ordinal()] = 7;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[CatalogSportsMatchResult.Stage.HalfTime.ordinal()] = 8;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[CatalogSportsMatchResult.Stage.SecondHalf.ordinal()] = 9;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[CatalogSportsMatchResult.Stage.ExtraTime.ordinal()] = 10;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr3[CatalogSportsMatchResult.Stage.AfterMatchPenalties.ordinal()] = 11;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr3[CatalogSportsMatchResult.Stage.MatchResultAfterPenalties.ordinal()] = 12;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr3[CatalogSportsMatchResult.Stage.Quarter1.ordinal()] = 13;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr3[CatalogSportsMatchResult.Stage.Quarter1End.ordinal()] = 14;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr3[CatalogSportsMatchResult.Stage.Quarter2.ordinal()] = 15;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr3[CatalogSportsMatchResult.Stage.Quarter2End.ordinal()] = 16;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr3[CatalogSportsMatchResult.Stage.Quarter3.ordinal()] = 17;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr3[CatalogSportsMatchResult.Stage.Quarter3End.ordinal()] = 18;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr3[CatalogSportsMatchResult.Stage.Quarter4.ordinal()] = 19;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr3[CatalogSportsMatchResult.Stage.Quarter4End.ordinal()] = 20;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr3[CatalogSportsMatchResult.Stage.FullTime.ordinal()] = 21;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr3[CatalogSportsMatchResult.Stage.MatchResultAfterExtraTime.ordinal()] = 22;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr3[CatalogSportsMatchResult.Stage.Period1.ordinal()] = 23;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr3[CatalogSportsMatchResult.Stage.Period1End.ordinal()] = 24;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr3[CatalogSportsMatchResult.Stage.Period2.ordinal()] = 25;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr3[CatalogSportsMatchResult.Stage.Period2End.ordinal()] = 26;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr3[CatalogSportsMatchResult.Stage.Period3.ordinal()] = 27;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr3[CatalogSportsMatchResult.Stage.Period3End.ordinal()] = 28;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr3[CatalogSportsMatchResult.Stage.Set1.ordinal()] = 29;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr3[CatalogSportsMatchResult.Stage.Set2.ordinal()] = 30;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr3[CatalogSportsMatchResult.Stage.Set3.ordinal()] = 31;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr3[CatalogSportsMatchResult.Stage.Set4.ordinal()] = 32;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr3[CatalogSportsMatchResult.Stage.Set5.ordinal()] = 33;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr3[CatalogSportsMatchResult.Stage.Result.ordinal()] = 34;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr3[CatalogSportsMatchResult.Stage.Retired.ordinal()] = 35;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr3[CatalogSportsMatchResult.Stage.RainDelay.ordinal()] = 36;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr3[CatalogSportsMatchResult.Stage.ToBeFinished.ordinal()] = 37;
            } catch (NoSuchFieldError unused46) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* compiled from: CatalogSportWidget.kt */
    public static final class d extends VkMiniInfoCell.b {
    }

    public bha(Context context) {
        super(context, null, 0);
        this.t = new bpn0(new jd(this, 16));
        LayoutInflater.from(context).inflate(R.layout.catalog2_sport_widget, this);
        this.u = (VkMiniInfoCell) findViewById(R.id.catalog_sport_widget_title);
        this.v = (VkText) findViewById(R.id.catalog_sport_widget_score);
        this.w = (VkText) findViewById(R.id.catalog_sport_widget_time);
        VkImage vkImage = (VkImage) findViewById(R.id.catalog_sport_widget_team1_logo_planning);
        qhv0.e eVar = qhv0.e.a;
        vkImage.setVkScaleType(eVar);
        this.x = vkImage;
        this.y = (VkText) findViewById(R.id.catalog_sport_widget_team1_name_planning);
        VkImage vkImage2 = (VkImage) findViewById(R.id.catalog_sport_widget_team2_logo_planning);
        vkImage2.setVkScaleType(eVar);
        this.z = vkImage2;
        this.A = (VkText) findViewById(R.id.catalog_sport_widget_team2_name_planning);
        this.B = (VkTile) findViewById(R.id.catalog_sport_widget_team1_running);
        this.C = (VkTile) findViewById(R.id.catalog_sport_widget_team2_running);
        jjc.g(this, new s9(this, 12));
    }

    public static s3q0 P4(bha bhaVar) {
        b5a b5aVar;
        String str;
        UIBlockSportMatch uIBlockSportMatch = bhaVar.D;
        if (uIBlockSportMatch == null) {
            uIBlockSportMatch = null;
        }
        CatalogSportMatch catalogSportMatch = uIBlockSportMatch != null ? uIBlockSportMatch.y : null;
        if (catalogSportMatch != null && (str = catalogSportMatch.p) != null) {
            maz.c(bhaVar.getLinksBridge().e(), bhaVar.getContext(), str, LaunchContext.A, null, null, 24);
        }
        UIBlockSportMatch uIBlockSportMatch2 = bhaVar.D;
        if (uIBlockSportMatch2 != null && (b5aVar = bhaVar.E) != null) {
            b5aVar.a(new cfp0(uIBlockSportMatch2, null));
        }
        return s3q0.a;
    }

    private final qdz getLinksBridge() {
        return (qdz) this.t.getValue();
    }

    private final void setInProgressTime(CatalogSportMatch catalogSportMatch) {
        String sb;
        CatalogSportsMatchResult catalogSportsMatchResult = catalogSportMatch.m;
        if (catalogSportsMatchResult == null) {
            return;
        }
        Integer num = catalogSportsMatchResult.d;
        CatalogSportsMatchResult.Stage stage = catalogSportsMatchResult.b;
        VkText vkText = this.w;
        Context context = vkText.getContext();
        e3m.a aVar = e3m.a;
        vkText.setCompoundDrawablesRelativeWithIntrinsicBounds(new baf0(m33.a(R.drawable.vk_icon_circle_12, context), dhr0.t.c(R.attr.vk_ui_accent_red)), (Drawable) null, (Drawable) null, (Drawable) null);
        StringBuilder sb2 = new StringBuilder();
        CatalogSportMatch.SportsType sportsType = catalogSportMatch.c;
        int i = sportsType == null ? -1 : c.$EnumSwitchMapping$1[sportsType.ordinal()];
        String str = "";
        if (i == 1) {
            switch (stage == null ? -1 : c.$EnumSwitchMapping$2[stage.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    str = Q4(stage);
                    break;
                case 7:
                    str = getContext().getString(R.string.catalog_sport_widget_match_football_first_half);
                    break;
                case 8:
                    str = getContext().getString(R.string.catalog_sport_widget_match_football_half_time);
                    break;
                case 9:
                    str = getContext().getString(R.string.catalog_sport_widget_match_football_second_time);
                    break;
                case 10:
                    str = getContext().getString(R.string.catalog_sport_widget_match_football_extra_time);
                    break;
                case 11:
                    str = getContext().getString(R.string.catalog_sport_widget_match_football_after_match_penalties);
                    break;
                case 12:
                    str = getContext().getString(R.string.catalog_sport_widget_match_football_match_result_after_penalties);
                    break;
            }
        } else if (i == 2) {
            switch (stage == null ? -1 : c.$EnumSwitchMapping$2[stage.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    str = Q4(stage);
                    break;
                case 10:
                    str = getContext().getString(R.string.catalog_sport_widget_match_basketball_extra_time);
                    break;
                case 13:
                    str = getContext().getString(R.string.catalog_sport_widget_match_basketball_quarter_1);
                    break;
                case 14:
                    str = getContext().getString(R.string.catalog_sport_widget_match_basketball_quarter_1_end);
                    break;
                case 15:
                    str = getContext().getString(R.string.catalog_sport_widget_match_basketball_quarter_2);
                    break;
                case 16:
                    str = getContext().getString(R.string.catalog_sport_widget_match_basketball_quarter_2_end);
                    break;
                case 17:
                    str = getContext().getString(R.string.catalog_sport_widget_match_basketball_quarter_3);
                    break;
                case 18:
                    str = getContext().getString(R.string.catalog_sport_widget_match_basketball_quarter_3_end);
                    break;
                case 19:
                    str = getContext().getString(R.string.catalog_sport_widget_match_basketball_quarter_4);
                    break;
                case 20:
                    str = getContext().getString(R.string.catalog_sport_widget_match_basketball_quarter_4_end);
                    break;
                case 21:
                    str = getContext().getString(R.string.catalog_sport_widget_match_basketball_full_time);
                    break;
                case 22:
                    str = getContext().getString(R.string.catalog_sport_widget_match_basketball_match_result_after_extra_time);
                    break;
            }
        } else if (i == 3) {
            int i2 = stage == null ? -1 : c.$EnumSwitchMapping$2[stage.ordinal()];
            switch (i2) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    str = Q4(stage);
                    break;
                default:
                    switch (i2) {
                        case 10:
                            str = getContext().getString(R.string.catalog_sport_widget_match_hockey_extra_time);
                            break;
                        case 11:
                            str = getContext().getString(R.string.catalog_sport_widget_match_hockey_after_match_penalties);
                            break;
                        case 12:
                            str = getContext().getString(R.string.catalog_sport_widget_match_hockey_match_result_after_penalties);
                            break;
                        default:
                            switch (i2) {
                                case 21:
                                    str = getContext().getString(R.string.catalog_sport_widget_match_hockey_full_time);
                                    break;
                                case 22:
                                    str = getContext().getString(R.string.catalog_sport_widget_match_hockey_match_result_after_extra_time);
                                    break;
                                case 23:
                                    str = getContext().getString(R.string.catalog_sport_widget_match_hockey_period_1);
                                    break;
                                case 24:
                                    str = getContext().getString(R.string.catalog_sport_widget_match_hockey_period_1_end);
                                    break;
                                case 25:
                                    str = getContext().getString(R.string.catalog_sport_widget_match_hockey_period_2);
                                    break;
                                case 26:
                                    str = getContext().getString(R.string.catalog_sport_widget_match_hockey_period_2_end);
                                    break;
                                case 27:
                                    str = getContext().getString(R.string.catalog_sport_widget_match_hockey_period_3);
                                    break;
                                case 28:
                                    str = getContext().getString(R.string.catalog_sport_widget_match_hockey_period_3_end);
                                    break;
                            }
                    }
            }
        } else if (i == 4) {
            int i3 = stage == null ? -1 : c.$EnumSwitchMapping$2[stage.ordinal()];
            switch (i3) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    str = Q4(stage);
                    break;
                default:
                    switch (i3) {
                        case 29:
                            str = getContext().getString(R.string.catalog_sport_widget_match_tennis_set_1);
                            break;
                        case 30:
                            str = getContext().getString(R.string.catalog_sport_widget_match_tennis_set_2);
                            break;
                        case 31:
                            str = getContext().getString(R.string.catalog_sport_widget_match_tennis_set_3);
                            break;
                        case 32:
                            str = getContext().getString(R.string.catalog_sport_widget_match_tennis_set_4);
                            break;
                        case 33:
                            str = getContext().getString(R.string.catalog_sport_widget_match_tennis_set_5);
                            break;
                        case 34:
                            str = getContext().getString(R.string.catalog_sport_widget_match_tennis_result);
                            break;
                        case 35:
                            str = getContext().getString(R.string.catalog_sport_widget_match_tennis_retired);
                            break;
                        case 36:
                            str = getContext().getString(R.string.catalog_sport_widget_match_tennis_rain_delay);
                            break;
                        case 37:
                            str = getContext().getString(R.string.catalog_sport_widget_match_tennis_to_be_finished);
                            break;
                    }
            }
        }
        sb2.append(str);
        sb2.append(" • ");
        if (num != null && num.intValue() == -1) {
            sb = uqi.b(new StringBuilder(), catalogSportsMatchResult.c, '\'');
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(num);
            sb3.append('\'');
            sb = sb3.toString();
        }
        sb2.append(sb);
        vkText.setText(sb2.toString());
    }

    private final void setScore(CatalogSportMatch catalogSportMatch) {
        CatalogSportsMatchResultTeam catalogSportsMatchResultTeam;
        CatalogSportsMatchResultTeamScore catalogSportsMatchResultTeamScore;
        CatalogSportsMatchResultTeam catalogSportsMatchResultTeam2;
        CatalogSportsMatchResultTeamScore catalogSportsMatchResultTeamScore2;
        if (catalogSportMatch.h == CatalogSportMatch.Status.Planned) {
            return;
        }
        VkText vkText = this.v;
        vkText.setVisibility(0);
        Context context = vkText.getContext();
        CatalogSportsMatchResult catalogSportsMatchResult = catalogSportMatch.m;
        Integer num = null;
        Integer num2 = (catalogSportsMatchResult == null || (catalogSportsMatchResultTeam2 = catalogSportsMatchResult.e) == null || (catalogSportsMatchResultTeamScore2 = catalogSportsMatchResultTeam2.b) == null) ? null : catalogSportsMatchResultTeamScore2.b;
        if (catalogSportsMatchResult != null && (catalogSportsMatchResultTeam = catalogSportsMatchResult.f) != null && (catalogSportsMatchResultTeamScore = catalogSportsMatchResultTeam.b) != null) {
            num = catalogSportsMatchResultTeamScore.b;
        }
        vkText.setText(context.getString(R.string.catalog_sport_widget_score, num2, num));
    }

    private final void setTeamsMatchesPlanning(CatalogSportMatch catalogSportMatch) {
        VkImage vkImage = this.x;
        vkImage.setVisibility(0);
        CatalogSportsMatchTeam catalogSportsMatchTeam = catalogSportMatch.k;
        CatalogSportsMatchTeam catalogSportsMatchTeam2 = catalogSportMatch.l;
        vkImage.o0(catalogSportsMatchTeam != null ? catalogSportsMatchTeam.d : null, null);
        VkText vkText = this.y;
        vkText.setVisibility(0);
        CatalogSportsMatchTeam catalogSportsMatchTeam3 = catalogSportMatch.k;
        vkText.setText(catalogSportsMatchTeam3 != null ? catalogSportsMatchTeam3.c : null);
        VkImage vkImage2 = this.z;
        vkImage2.setVisibility(0);
        vkImage2.o0(catalogSportsMatchTeam2 != null ? catalogSportsMatchTeam2.d : null, null);
        VkText vkText2 = this.A;
        vkText2.setVisibility(0);
        vkText2.setText(catalogSportsMatchTeam2 != null ? catalogSportsMatchTeam2.c : null);
    }

    private final void setTeamsMatchesRunning(CatalogSportMatch catalogSportMatch) {
        String str;
        String str2;
        VkTile vkTile = this.B;
        vkTile.setVisibility(0);
        VkTile.TextAlignment textAlignment = VkTile.TextAlignment.Center;
        vkTile.setTextAlignment(textAlignment);
        VkTile.VisualContentType visualContentType = VkTile.VisualContentType.Other;
        vkTile.setVisualContentType(visualContentType);
        vkTile.setVisualContentController(new com.vk.core.view.components.tile.c(new a(vkTile.getContext()), vkTile.getContext()));
        CatalogSportsMatchTeam catalogSportsMatchTeam = catalogSportMatch.k;
        CatalogSportsMatchTeam catalogSportsMatchTeam2 = catalogSportMatch.l;
        tlo0.h hVar = null;
        float f = 48;
        vkTile.setVisualContentParams(new VkTileImageView.a(new Size(iah0.a(f), iah0.a(f)), new b(catalogSportsMatchTeam != null ? catalogSportsMatchTeam.d : null), null, 4));
        CatalogSportsMatchTeam catalogSportsMatchTeam3 = catalogSportMatch.k;
        vkTile.setTitle(new VkTile.e((catalogSportsMatchTeam3 == null || (str2 = catalogSportsMatchTeam3.c) == null) ? null : oq.d(tlo0.Companion, str2), 0, null, null, null, null, null, 510));
        VkTile vkTile2 = this.C;
        vkTile2.setVisibility(0);
        vkTile2.setTextAlignment(textAlignment);
        vkTile2.setVisualContentType(visualContentType);
        vkTile2.setVisualContentController(new com.vk.core.view.components.tile.c(new a(vkTile2.getContext()), vkTile2.getContext()));
        vkTile2.setVisualContentParams(new VkTileImageView.a(new Size(iah0.a(f), iah0.a(f)), new b(catalogSportsMatchTeam2 != null ? catalogSportsMatchTeam2.d : null), null, 4));
        if (catalogSportsMatchTeam2 != null && (str = catalogSportsMatchTeam2.c) != null) {
            hVar = oq.d(tlo0.Companion, str);
        }
        vkTile2.setTitle(new VkTile.e(hVar, 0, null, null, null, null, null, 510));
    }

    private final void setTime(CatalogSportMatch catalogSportMatch) {
        CatalogSportMatch.Status status = catalogSportMatch.h;
        CatalogSportMatch.SportsType sportsType = catalogSportMatch.c;
        int i = status == null ? -1 : c.$EnumSwitchMapping$0[status.ordinal()];
        VkText vkText = this.w;
        if (i == 1) {
            vkText.setText(catalogSportMatch.n);
            ConstraintLayout.b bVar = (ConstraintLayout.b) vkText.getLayoutParams();
            bVar.j = this.u.getId();
            vkText.setLayoutParams(bVar);
            float f = 8;
            f4m.t(iah0.a(f), vkText);
            f4m.q(iah0.a(f), vkText);
            vkText.requestLayout();
            return;
        }
        if (i == 2) {
            vkText.setText(sportsType == CatalogSportMatch.SportsType.Tennis ? vkText.getContext().getString(R.string.catalog_sport_widget_game_canceled) : vkText.getContext().getString(R.string.catalog_sport_widget_match_canceled));
            return;
        }
        if (i == 3 || i == 4) {
            vkText.setText(sportsType == CatalogSportMatch.SportsType.Tennis ? vkText.getContext().getString(R.string.catalog_sport_widget_game_finished) : vkText.getContext().getString(R.string.catalog_sport_widget_match_finished));
        } else {
            if (i != 5) {
                return;
            }
            setInProgressTime(catalogSportMatch);
        }
    }

    private final void setTitle(CatalogSportMatch catalogSportMatch) {
        ccr0 ccr0Var = new ccr0(getContext());
        ccr0Var.r(catalogSportMatch.f);
        Drawable drawable = ccr0Var.b;
        if (drawable == null) {
            return;
        }
        tlo0.a aVar = tlo0.Companion;
        String str = catalogSportMatch.e;
        if (str == null) {
            str = "";
        }
        VkMiniInfoCell.e eVar = new VkMiniInfoCell.e(oq.d(aVar, str), false, false, false, false, null, 62);
        VkMiniInfoCell vkMiniInfoCell = this.u;
        vkMiniInfoCell.setMiddle(eVar);
        vkMiniInfoCell.setIcon(new VkMiniInfoCell.d(new eko(drawable), null, 6));
        vkMiniInfoCell.setMode(VkMiniInfoCell.Mode.Base);
        vkMiniInfoCell.setDecorator(new d(false));
    }

    public final String Q4(CatalogSportsMatchResult.Stage stage) {
        switch (c.$EnumSwitchMapping$2[stage.ordinal()]) {
            case 1:
                return getContext().getString(R.string.catalog_sport_widget_match_not_started);
            case 2:
                return getContext().getString(R.string.catalog_sport_widget_match_postponed);
            case 3:
                return getContext().getString(R.string.catalog_sport_widget_match_suspended);
            case 4:
                return getContext().getString(R.string.catalog_sport_widget_match_not_no_info_yet);
            case 5:
                return getContext().getString(R.string.catalog_sport_widget_match_awarded_win);
            case 6:
                return getContext().getString(R.string.catalog_sport_widget_match_canceled);
            default:
                return "";
        }
    }

    public final void setCatalogEventsBus(b5a b5aVar) {
        this.E = b5aVar;
    }

    public final void setUiData(UIBlockSportMatch uIBlockSportMatch) {
        this.D = uIBlockSportMatch;
        CatalogSportMatch catalogSportMatch = uIBlockSportMatch.y;
        setTitle(catalogSportMatch);
        setScore(catalogSportMatch);
        setTime(catalogSportMatch);
        if (catalogSportMatch.h == CatalogSportMatch.Status.Planned) {
            setTeamsMatchesPlanning(catalogSportMatch);
        } else {
            setTeamsMatchesRunning(catalogSportMatch);
        }
    }
}
